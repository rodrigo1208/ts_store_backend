package br.com.rodrigocardoso.ts_store.auth

import br.com.rodrigocardoso.database.tables.daos.UsuarioDao
import br.com.rodrigocardoso.ts_store.resources.ResponseStatus
import br.com.rodrigocardoso.ts_store.exceptions.ServiceException
import br.com.rodrigocardoso.ts_store.usuario.findByEmail
import br.com.rodrigocardoso.ts_store.util.Connection
import br.com.rodrigocardoso.ts_store.util.Jwt
import br.com.rodrigocardoso.ts_store.util.Password
import br.com.rodrigocardoso.ts_store.util.toJson
import java.util.*

class AuthService {
    private val dao = UsuarioDao(Connection.configuration)

    fun login(login: Login): String {
        val usuario = dao.findByEmail(login.email) ?: throwUnauthorized()
        Password.validate(login.senha.toCharArray(), usuario.salt.stringToByte(), usuario.senha.stringToByte()).takeIf { b -> b } ?: throwUnauthorized()

        return toJson(Token(Jwt.createToken(usuario.email)))
    }

    private fun throwUnauthorized(): Nothing {
        throw ServiceException(ResponseStatus.UNAUTHORIZED, "Usuário ou senha incorretos")
    }

    private fun String.stringToByte(): ByteArray {
        return Base64.getDecoder().decode(this)
    }
}