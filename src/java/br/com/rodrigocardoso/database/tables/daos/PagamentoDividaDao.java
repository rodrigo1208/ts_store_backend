/*
 * This file is generated by jOOQ.
*/
package br.com.rodrigocardoso.database.tables.daos;


import br.com.rodrigocardoso.database.tables.PagamentoDivida;
import br.com.rodrigocardoso.database.tables.records.PagamentoDividaRecord;

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
public class PagamentoDividaDao extends DAOImpl<PagamentoDividaRecord, br.com.rodrigocardoso.database.tables.pojos.PagamentoDivida, UUID> {

    /**
     * Create a new PagamentoDividaDao without any configuration
     */
    public PagamentoDividaDao() {
        super(PagamentoDivida.PAGAMENTO_DIVIDA, br.com.rodrigocardoso.database.tables.pojos.PagamentoDivida.class);
    }

    /**
     * Create a new PagamentoDividaDao with an attached configuration
     */
    public PagamentoDividaDao(Configuration configuration) {
        super(PagamentoDivida.PAGAMENTO_DIVIDA, br.com.rodrigocardoso.database.tables.pojos.PagamentoDivida.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected UUID getId(br.com.rodrigocardoso.database.tables.pojos.PagamentoDivida object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>created_date IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.PagamentoDivida> fetchByCreatedDate(Timestamp... values) {
        return fetch(PagamentoDivida.PAGAMENTO_DIVIDA.CREATED_DATE, values);
    }

    /**
     * Fetch records that have <code>created_user IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.PagamentoDivida> fetchByCreatedUser(UUID... values) {
        return fetch(PagamentoDivida.PAGAMENTO_DIVIDA.CREATED_USER, values);
    }

    /**
     * Fetch records that have <code>updated_date IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.PagamentoDivida> fetchByUpdatedDate(Timestamp... values) {
        return fetch(PagamentoDivida.PAGAMENTO_DIVIDA.UPDATED_DATE, values);
    }

    /**
     * Fetch records that have <code>updated_user IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.PagamentoDivida> fetchByUpdatedUser(UUID... values) {
        return fetch(PagamentoDivida.PAGAMENTO_DIVIDA.UPDATED_USER, values);
    }

    /**
     * Fetch records that have <code>active IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.PagamentoDivida> fetchByActive(Boolean... values) {
        return fetch(PagamentoDivida.PAGAMENTO_DIVIDA.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.PagamentoDivida> fetchById(UUID... values) {
        return fetch(PagamentoDivida.PAGAMENTO_DIVIDA.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public br.com.rodrigocardoso.database.tables.pojos.PagamentoDivida fetchOneById(UUID value) {
        return fetchOne(PagamentoDivida.PAGAMENTO_DIVIDA.ID, value);
    }

    /**
     * Fetch records that have <code>descricao IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.PagamentoDivida> fetchByDescricao(String... values) {
        return fetch(PagamentoDivida.PAGAMENTO_DIVIDA.DESCRICAO, values);
    }

    /**
     * Fetch records that have <code>valor IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.PagamentoDivida> fetchByValor(Double... values) {
        return fetch(PagamentoDivida.PAGAMENTO_DIVIDA.VALOR, values);
    }

    /**
     * Fetch records that have <code>data IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.PagamentoDivida> fetchByData(Timestamp... values) {
        return fetch(PagamentoDivida.PAGAMENTO_DIVIDA.DATA, values);
    }

    /**
     * Fetch records that have <code>pessoa_id IN (values)</code>
     */
    public List<br.com.rodrigocardoso.database.tables.pojos.PagamentoDivida> fetchByPessoaId(UUID... values) {
        return fetch(PagamentoDivida.PAGAMENTO_DIVIDA.PESSOA_ID, values);
    }
}
