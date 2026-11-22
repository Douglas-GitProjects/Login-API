# Login-API

API REST desenvolvida em Kotlin com Spring Boot, como projeto de estudo para trabalhar com operações de cadastro e gerenciamento de usuários.

## Tecnologias utilizadas

- Kotlin
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- H2 Database
- Gradle

## Funcionalidades

- Cadastro de usuários.
- Listagem de usuários cadastrados.
- Atualização de informações por ID.
- Exclusão de usuários por ID.
- Persistência de dados utilizando banco H2.

## Endpoints

| Método | Rota | Descrição |
|---|---|---|
| POST | `/usuarios` | Cadastrar usuário |
| GET | `/usuarios` | Listar usuários |
| PUT | `/usuarios/{id}` | Atualizar usuário |
| DELETE | `/usuarios/{id}` | Excluir usuário |

## Banco de dados

O projeto utiliza o H2 Database, configurado para armazenar os dados em arquivo.

O console do banco pode ser acessado pelo caminho:

`/h2-console`

## Como executar

1. Clone o repositório.
2. Abra o projeto em uma IDE compatível com Kotlin e Gradle.
3. Aguarde a sincronização das dependências.
4. Execute a aplicação Spring Boot.
5. A API ficará disponível, por padrão, na porta `8080`.

## Objetivo do projeto

Praticar o desenvolvimento de APIs REST, organização em camadas, operações CRUD, integração com banco de dados e utilização do ecossistema Spring Boot.

---

Desenvolvido por **Douglas Galdino da Silva**.
