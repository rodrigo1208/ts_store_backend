package br.com.rodrigocardoso.ts_store.usuario

import br.com.rodrigocardoso.database.tables.daos.UsuarioDao
import br.com.rodrigocardoso.database.tables.pojos.Usuario
import br.com.rodrigocardoso.database.tables.records.UsuarioRecord
import br.com.rodrigocardoso.ts_store.resources.Resource

class UsuarioResource : Resource<UsuarioRecord, Usuario, UsuarioDao, UsuarioService>(
        service = UsuarioService(),
        uri = "/usuario",
        type = Usuario::class.java
)