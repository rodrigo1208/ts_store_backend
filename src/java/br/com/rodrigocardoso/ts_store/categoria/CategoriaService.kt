package br.com.rodrigocardoso.ts_store.categoria

import br.com.rodrigocardoso.database.tables.daos.CategoriaDao
import br.com.rodrigocardoso.database.tables.pojos.Categoria
import br.com.rodrigocardoso.database.tables.records.CategoriaRecord
import br.com.rodrigocardoso.ts_store.service.Service
import br.com.rodrigocardoso.ts_store.util.Connection
import br.com.rodrigocardoso.ts_store.util.Context
import java.util.*

class CategoriaService : Service<CategoriaRecord, Categoria, CategoriaDao>(CategoriaDao(Connection.configuration), Categoria::class.java) {
    override fun onCreate(entity: Categoria,context: Context) {
        with(entity) {
            id = UUID.randomUUID()
            createdDate = this@CategoriaService.now()
            createdUser = context.userId
        }
    }

    override fun onUpdate(entity: Categoria, context: Context) {
        with(entity) {
            updatedDate = this@CategoriaService.now()
            updatedUser = context.userId
        }
    }

    override fun inactive(entity: Categoria, context: Context) {
        onUpdate(entity, context)
        with(entity) {
            active = false
        }
    }

}