/*
 * This file is generated by jOOQ.
*/
package br.com.rodrigocardoso.database.tables.daos;


import br.com.rodrigocardoso.database.tables.Categoria;
import br.com.rodrigocardoso.database.tables.records.CategoriaRecord;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CategoriaDao extends DAOImpl<CategoriaRecord, br.com.rodrigocardoso.database.tables.pojos.Categoria, UUID> {

    /**
     * Create a new CategoriaDao without any configuration
     */
    public CategoriaDao() {
        super(Categoria.CATEGORIA, br.com.rodrigocardoso.database.tables.pojos.Categoria.class);
    }

    /**
     * Create a new CategoriaDao with an attached configuration
     */
    public CategoriaDao(Configuration configuration) {
        super(Categoria.CATEGORIA, br.com.rodrigocardoso.database.tables.pojos.Categoria.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected UUID getId(br.com.rodrigocardoso.database.tables.pojos.Categoria object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>created_date IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Categoria> fetchByCreatedDate(Timestamp... values) {
        return fetch(Categoria.CATEGORIA.CREATED_DATE, values);
    }

    /**
     * Fetch records that have <code>created_user IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Categoria> fetchByCreatedUser(UUID... values) {
        return fetch(Categoria.CATEGORIA.CREATED_USER, values);
    }

    /**
     * Fetch records that have <code>updated_date IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Categoria> fetchByUpdatedDate(Timestamp... values) {
        return fetch(Categoria.CATEGORIA.UPDATED_DATE, values);
    }

    /**
     * Fetch records that have <code>updated_user IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Categoria> fetchByUpdatedUser(UUID... values) {
        return fetch(Categoria.CATEGORIA.UPDATED_USER, values);
    }

    /**
     * Fetch records that have <code>active IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Categoria> fetchByActive(Boolean... values) {
        return fetch(Categoria.CATEGORIA.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Categoria> fetchById(UUID... values) {
        return fetch(Categoria.CATEGORIA.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public br.com.rodrigocardoso.database.tables.pojos.Categoria fetchOneById(UUID value) {
        return fetchOne(Categoria.CATEGORIA.ID, value);
    }

    /**
     * Fetch records that have <code>descricao IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Categoria> fetchByDescricao(String... values) {
        return fetch(Categoria.CATEGORIA.DESCRICAO, values);
    }
}
