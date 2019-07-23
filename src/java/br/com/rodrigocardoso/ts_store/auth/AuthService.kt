package br.com.rodrigocardoso.ts_store.auth

import br.com.rodrigocardoso.database.tables.daos.UsuarioDao
import br.com.rodrigocardoso.database.tables.pojos.Usuario
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
    private val tokenInvalido = "Token inválido"

    fun login(login: Login): String {
        val usuario = dao.findByEmail(login.email) ?: throwUnauthorized()
        Password.validate(login.senha.toCharArray(), usuario.salt.stringToByte(), usuario.senha.stringToByte()).takeIf { b -> b } ?: throwUnauthorized()
        val token = Jwt.createToken(usuario.email)

        usuario.userToken = token
        dao.update(usuario)

        return toJson(Token(token))
    }

    fun authenticate(token: String?): Usuario {
        token ?: throwUnauthorized(tokenInvalido)
        val email = Jwt.verify(token) ?: throwUnauthorized(tokenInvalido)
        val usuario = dao.findByEmail(email) ?: throwUnauthorized(tokenInvalido)
        (usuario.userToken == token).takeIf { b -> b } ?: throwUnauthorized(tokenInvalido)
        return usuario
    }

    private fun throwUnauthorized(message: String = "Usuário ou senha incorretos"): Nothing = throw ServiceException(ResponseStatus.UNAUTHORIZED, message)

    private fun String.stringToByte(): ByteArray {
        return Base64.getDecoder().decode(this)
    }
}