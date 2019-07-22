package br.com.rodrigocardoso.ts_store.service

import br.com.rodrigocardoso.database.tables.daos.CategoriaDao
import br.com.rodrigocardoso.database.tables.pojos.Categoria
import br.com.rodrigocardoso.database.tables.records.CategoriaRecord
import br.com.rodrigocardoso.ts_store.util.Connection
import java.util.*

class CategoriaService : Service<CategoriaRecord, Categoria>(CategoriaDao(Connection.configuration), Categoria::class.java) {
    override fun onCreate(entity: Categoria) {
        with(entity) {
            id = UUID.randomUUID()
            createdDate = this@CategoriaService.now()
            createdUser = UUID.randomUUID()
        }
    }

    override fun onUpdate(entity: Categoria) {
        with(entity) {
            updatedDate = this@CategoriaService.now()
            updatedUser = UUID.randomUUID()
        }
    }

    override fun inactive(entity: Categoria) {
        onUpdate(entity)
        with(entity) {
            active = false
        }
    }

}