package com.condomanager.api.service

import com.condomanager.api.entity.Usuario
import com.condomanager.api.repository.UsuarioRepository
import org.springframework.stereotype.Service


@Service

class UsuarioService (val repository: UsuarioRepository){
    fun cadastrar(usuario: Usuario): Usuario{
        return repository.save(usuario)
    }

    fun listar(): List<Usuario>{
        return repository.findAll()
    }

    fun buscar(id: Long): Usuario?{
        return repository.findById(id).orElse(null)
    }

    fun excluir(id: Long):Boolean{
        if (!repository.existsById(id)){
            return false
        }
        repository.deleteById(id)
        return true
    }
    fun atualizar(id: Long, usuario: Usuario): Usuario?{
        var usuarioExistente = repository.findById(id).orElse(null)?: return null
        usuarioExistente.email = usuario.email
        usuarioExistente.senha = usuario.senha
        return repository.save(usuarioExistente)

    }
}
//pedir para o chatgpt explicar para mim com muito carinho e amor