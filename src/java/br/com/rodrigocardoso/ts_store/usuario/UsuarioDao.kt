package br.com.rodrigocardoso.ts_store.usuario

import br.com.rodrigocardoso.database.tables.daos.UsuarioDao
import br.com.rodrigocardoso.database.tables.pojos.Usuario
import br.com.rodrigocardoso.database.tables.records.UsuarioRecord
import org.jooq.DAO
import org.jooq.Record
import java.util.*

private val u = br.com.rodrigocardoso.database.tables.Usuario.USUARIO

fun UsuarioDao.existsEmail(email: String): Boolean {
    return with(configuration().dsl()) {
        selectCount()
                .from(u)
                .where(u.EMAIL.eq(email))
                .fetchOne(0, Int::class.java) >= 1
    }
}

fun UsuarioDao.findByEmail(email: String): Usuario? {
    return with(configuration().dsl()) {
        select()
                .from(u)
                .where(u.EMAIL.eq(email))
                .and(u.ACTIVE.isTrue)
                .fetchOne()
                .into(Usuario::class.java)
    }
}
