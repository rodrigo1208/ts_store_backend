/*
 * This file is generated by jOOQ.
*/
package br.com.rodrigocardoso.database.tables.records;


import br.com.rodrigocardoso.database.tables.Produto;

import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ProdutoRecord extends UpdatableRecordImpl<ProdutoRecord> implements Record10<Timestamp, UUID, Timestamp, UUID, Boolean, UUID, String, String, Double, UUID> {

    private static final long serialVersionUID = -1240302069;

    /**
     * Setter for <code>public.produto.created_date</code>.
     */
    public ProdutoRecord setCreatedDate(Timestamp value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.produto.created_date</code>.
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) get(0);
    }

    /**
     * Setter for <code>public.produto.created_user</code>.
     */
    public ProdutoRecord setCreatedUser(UUID value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.produto.created_user</code>.
     */
    public UUID getCreatedUser() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>public.produto.updated_date</code>.
     */
    public ProdutoRecord setUpdatedDate(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.produto.updated_date</code>.
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.produto.updated_user</code>.
     */
    public ProdutoRecord setUpdatedUser(UUID value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.produto.updated_user</code>.
     */
    public UUID getUpdatedUser() {
        return (UUID) get(3);
    }

    /**
     * Setter for <code>public.produto.active</code>.
     */
    public ProdutoRecord setActive(Boolean value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.produto.active</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>public.produto.id</code>.
     */
    public ProdutoRecord setId(UUID value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.produto.id</code>.
     */
    public UUID getId() {
        return (UUID) get(5);
    }

    /**
     * Setter for <code>public.produto.descricao</code>.
     */
    public ProdutoRecord setDescricao(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.produto.descricao</code>.
     */
    public String getDescricao() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.produto.codigo</code>.
     */
    public ProdutoRecord setCodigo(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.produto.codigo</code>.
     */
    public String getCodigo() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.produto.valor</code>.
     */
    public ProdutoRecord setValor(Double value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.produto.valor</code>.
     */
    public Double getValor() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>public.produto.categoria_id</code>.
     */
    public ProdutoRecord setCategoriaId(UUID value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.produto.categoria_id</code>.
     */
    public UUID getCategoriaId() {
        return (UUID) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Timestamp, UUID, Timestamp, UUID, Boolean, UUID, String, String, Double, UUID> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Timestamp, UUID, Timestamp, UUID, Boolean, UUID, String, String, Double, UUID> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field1() {
        return Produto.PRODUTO.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field2() {
        return Produto.PRODUTO.CREATED_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Produto.PRODUTO.UPDATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field4() {
        return Produto.PRODUTO.UPDATED_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return Produto.PRODUTO.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field6() {
        return Produto.PRODUTO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Produto.PRODUTO.DESCRICAO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Produto.PRODUTO.CODIGO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field9() {
        return Produto.PRODUTO.VALOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field10() {
        return Produto.PRODUTO.CATEGORIA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component1() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component2() {
        return getCreatedUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getUpdatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component4() {
        return getUpdatedUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component6() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getDescricao();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getCodigo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component9() {
        return getValor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component10() {
        return getCategoriaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value1() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value2() {
        return getCreatedUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getUpdatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value4() {
        return getUpdatedUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value6() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDescricao();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCodigo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value9() {
        return getValor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value10() {
        return getCategoriaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord value1(Timestamp value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord value2(UUID value) {
        setCreatedUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord value3(Timestamp value) {
        setUpdatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord value4(UUID value) {
        setUpdatedUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord value5(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord value6(UUID value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord value7(String value) {
        setDescricao(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord value8(String value) {
        setCodigo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord value9(Double value) {
        setValor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord value10(UUID value) {
        setCategoriaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord values(Timestamp value1, UUID value2, Timestamp value3, UUID value4, Boolean value5, UUID value6, String value7, String value8, Double value9, UUID value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProdutoRecord
     */
    public ProdutoRecord() {
        super(Produto.PRODUTO);
    }

    /**
     * Create a detached, initialised ProdutoRecord
     */
    public ProdutoRecord(Timestamp createdDate, UUID createdUser, Timestamp updatedDate, UUID updatedUser, Boolean active, UUID id, String descricao, String codigo, Double valor, UUID categoriaId) {
        super(Produto.PRODUTO);

        set(0, createdDate);
        set(1, createdUser);
        set(2, updatedDate);
        set(3, updatedUser);
        set(4, active);
        set(5, id);
        set(6, descricao);
        set(7, codigo);
        set(8, valor);
        set(9, categoriaId);
    }
}