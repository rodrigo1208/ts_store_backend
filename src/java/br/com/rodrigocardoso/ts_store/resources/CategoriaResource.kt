package br.com.rodrigocardoso.ts_store.resources

import br.com.rodrigocardoso.database.tables.pojos.Categoria
import br.com.rodrigocardoso.database.tables.records.CategoriaRecord
import br.com.rodrigocardoso.ts_store.service.CategoriaService

class CategoriaResource : Resource<CategoriaRecord, Categoria, CategoriaService>(
        service = CategoriaService(),
        type = Categoria::class.java,
        uri = "/categoria"
) {

}