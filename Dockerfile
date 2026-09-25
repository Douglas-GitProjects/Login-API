# Dá permissão de execução ao arquivo gradlew
RUN chmod +x ./gradlew

# Baixa dependências
RUN ./gradlew dependencies --no-daemon || true

# Copia o restante do projeto
COPY . .

# Garante a permissão de execução novamente (caso o COPY . . tenha sobrescrito)
RUN chmod +x ./gradlew

# Gera o JAR
RUN ./gradlew bootJar --no-daemon

# Imagem final
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]