/*
 * This file is generated by jOOQ.
*/
package br.com.rodrigocardoso.database.tables.daos;


import br.com.rodrigocardoso.database.tables.Venda;
import br.com.rodrigocardoso.database.tables.records.VendaRecord;

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
public class VendaDao extends DAOImpl<VendaRecord, br.com.rodrigocardoso.database.tables.pojos.Venda, UUID> {

    /**
     * Create a new VendaDao without any configuration
     */
    public VendaDao() {
        super(Venda.VENDA, br.com.rodrigocardoso.database.tables.pojos.Venda.class);
    }

    /**
     * Create a new VendaDao with an attached configuration
     */
    public VendaDao(Configuration configuration) {
        super(Venda.VENDA, br.com.rodrigocardoso.database.tables.pojos.Venda.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected UUID getId(br.com.rodrigocardoso.database.tables.pojos.Venda object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>created_date IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Venda> fetchByCreatedDate(Timestamp... values) {
        return fetch(Venda.VENDA.CREATED_DATE, values);
    }

    /**
     * Fetch records that have <code>created_user IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Venda> fetchByCreatedUser(UUID... values) {
        return fetch(Venda.VENDA.CREATED_USER, values);
    }

    /**
     * Fetch records that have <code>updated_date IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Venda> fetchByUpdatedDate(Timestamp... values) {
        return fetch(Venda.VENDA.UPDATED_DATE, values);
    }

    /**
     * Fetch records that have <code>updated_user IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Venda> fetchByUpdatedUser(UUID... values) {
        return fetch(Venda.VENDA.UPDATED_USER, values);
    }

    /**
     * Fetch records that have <code>active IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Venda> fetchByActive(Boolean... values) {
        return fetch(Venda.VENDA.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Venda> fetchById(UUID... values) {
        return fetch(Venda.VENDA.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public br.com.rodrigocardoso.database.tables.pojos.Venda fetchOneById(UUID value) {
        return fetchOne(Venda.VENDA.ID, value);
    }

    /**
     * Fetch records that have <code>venda_dia_id IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Venda> fetchByVendaDiaId(UUID... values) {
        return fetch(Venda.VENDA.VENDA_DIA_ID, values);
    }

    /**
     * Fetch records that have <code>pessoa_id IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.Venda> fetchByPessoaId(UUID... values) {
        return fetch(Venda.VENDA.PESSOA_ID, values);
    }
}
