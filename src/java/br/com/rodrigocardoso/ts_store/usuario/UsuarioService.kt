package br.com.rodrigocardoso.ts_store.usuario

import br.com.rodrigocardoso.database.tables.daos.UsuarioDao
import br.com.rodrigocardoso.database.tables.pojos.Usuario
import br.com.rodrigocardoso.database.tables.records.UsuarioRecord
import br.com.rodrigocardoso.ts_store.resources.ResponseStatus
import br.com.rodrigocardoso.ts_store.exceptions.ServiceException
import br.com.rodrigocardoso.ts_store.service.Service
import br.com.rodrigocardoso.ts_store.util.Connection
import br.com.rodrigocardoso.ts_store.util.Password
import java.util.*

class UsuarioService : Service<UsuarioRecord, Usuario, UsuarioDao>(UsuarioDao(Connection.configuration), Usuario::class.java) {
    override fun create(entity: Usuario): Usuario {
        dao.existsEmail(entity.email).takeIf { b -> !b } ?: throw ServiceException(ResponseStatus.CONFLICT, "User already exists")

        val password = Password(entity.senha.toCharArray())
        onCreate(entity)
        entity.senha = password.generatedPassword.byteToString()
        entity.salt = password.salt.byteToString()

        dao.insert(entity)
        return with(entity) {
            senha = ""
            salt = ""
            this
        }
    }

    override fun onCreate(entity: Usuario) {
        with(entity) {
            id = UUID.randomUUID()
            createdDate = now()
            createdUser = id
        }
    }

    override fun onUpdate(entity: Usuario) {
        with(entity) {
            updatedDate = now()
            updatedUser = UUID.randomUUID()
        }
    }

    override fun inactive(entity: Usuario) {
        onUpdate(entity)
        entity.active = false
    }

    private fun ByteArray.byteToString(): String {
        return Base64.getEncoder().encodeToString(this)
    }
}
