package br.com.rodrigocardoso.ts_store.categoria

import br.com.rodrigocardoso.database.tables.daos.CategoriaDao
import br.com.rodrigocardoso.database.tables.pojos.Categoria
import br.com.rodrigocardoso.database.tables.records.CategoriaRecord
import br.com.rodrigocardoso.ts_store.resources.Resource

class CategoriaResource : Resource<CategoriaRecord, Categoria, CategoriaDao, CategoriaService>(
        service = CategoriaService(),
        type = Categoria::class.java,
        uri = "/api/categoria"
)