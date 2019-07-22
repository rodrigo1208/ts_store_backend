/*
 * This file is generated by jOOQ.
*/
package br.com.rodrigocardoso.database.tables.records;


import br.com.rodrigocardoso.database.enums.StatusVendaDia;
import br.com.rodrigocardoso.database.tables.VendaDia;

import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class VendaDiaRecord extends UpdatableRecordImpl<VendaDiaRecord> implements Record11<Timestamp, UUID, Timestamp, UUID, Boolean, UUID, Timestamp, Double, Double, StatusVendaDia, String> {

    private static final long serialVersionUID = 1701894940;

    /**
     * Setter for <code>public.venda_dia.created_date</code>.
     */
    public VendaDiaRecord setCreatedDate(Timestamp value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.venda_dia.created_date</code>.
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) get(0);
    }

    /**
     * Setter for <code>public.venda_dia.created_user</code>.
     */
    public VendaDiaRecord setCreatedUser(UUID value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.venda_dia.created_user</code>.
     */
    public UUID getCreatedUser() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>public.venda_dia.updated_date</code>.
     */
    public VendaDiaRecord setUpdatedDate(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.venda_dia.updated_date</code>.
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.venda_dia.updated_user</code>.
     */
    public VendaDiaRecord setUpdatedUser(UUID value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.venda_dia.updated_user</code>.
     */
    public UUID getUpdatedUser() {
        return (UUID) get(3);
    }

    /**
     * Setter for <code>public.venda_dia.active</code>.
     */
    public VendaDiaRecord setActive(Boolean value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.venda_dia.active</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>public.venda_dia.id</code>.
     */
    public VendaDiaRecord setId(UUID value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.venda_dia.id</code>.
     */
    public UUID getId() {
        return (UUID) get(5);
    }

    /**
     * Setter for <code>public.venda_dia.data</code>.
     */
    public VendaDiaRecord setData(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.venda_dia.data</code>.
     */
    public Timestamp getData() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>public.venda_dia.valor_abertura</code>.
     */
    public VendaDiaRecord setValorAbertura(Double value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.venda_dia.valor_abertura</code>.
     */
    public Double getValorAbertura() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>public.venda_dia.valor_fechamento</code>.
     */
    public VendaDiaRecord setValorFechamento(Double value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.venda_dia.valor_fechamento</code>.
     */
    public Double getValorFechamento() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>public.venda_dia.status</code>.
     */
    public VendaDiaRecord setStatus(StatusVendaDia value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.venda_dia.status</code>.
     */
    public StatusVendaDia getStatus() {
        return (StatusVendaDia) get(9);
    }

    /**
     * Setter for <code>public.venda_dia.motivo_cancelamento</code>.
     */
    public VendaDiaRecord setMotivoCancelamento(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.venda_dia.motivo_cancelamento</code>.
     */
    public String getMotivoCancelamento() {
        return (String) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Timestamp, UUID, Timestamp, UUID, Boolean, UUID, Timestamp, Double, Double, StatusVendaDia, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Timestamp, UUID, Timestamp, UUID, Boolean, UUID, Timestamp, Double, Double, StatusVendaDia, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field1() {
        return VendaDia.VENDA_DIA.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field2() {
        return VendaDia.VENDA_DIA.CREATED_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return VendaDia.VENDA_DIA.UPDATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field4() {
        return VendaDia.VENDA_DIA.UPDATED_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return VendaDia.VENDA_DIA.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field6() {
        return VendaDia.VENDA_DIA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return VendaDia.VENDA_DIA.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return VendaDia.VENDA_DIA.VALOR_ABERTURA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field9() {
        return VendaDia.VENDA_DIA.VALOR_FECHAMENTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<StatusVendaDia> field10() {
        return VendaDia.VENDA_DIA.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return VendaDia.VENDA_DIA.MOTIVO_CANCELAMENTO;
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
    public Timestamp component7() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component8() {
        return getValorAbertura();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component9() {
        return getValorFechamento();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatusVendaDia component10() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getMotivoCancelamento();
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
    public Timestamp value7() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getValorAbertura();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value9() {
        return getValorFechamento();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatusVendaDia value10() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getMotivoCancelamento();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VendaDiaRecord value1(Timestamp value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VendaDiaRecord value2(UUID value) {
        setCreatedUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VendaDiaRecord value3(Timestamp value) {
        setUpdatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VendaDiaRecord value4(UUID value) {
        setUpdatedUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VendaDiaRecord value5(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VendaDiaRecord value6(UUID value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VendaDiaRecord value7(Timestamp value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VendaDiaRecord value8(Double value) {
        setValorAbertura(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VendaDiaRecord value9(Double value) {
        setValorFechamento(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VendaDiaRecord value10(StatusVendaDia value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VendaDiaRecord value11(String value) {
        setMotivoCancelamento(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VendaDiaRecord values(Timestamp value1, UUID value2, Timestamp value3, UUID value4, Boolean value5, UUID value6, Timestamp value7, Double value8, Double value9, StatusVendaDia value10, String value11) {
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
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VendaDiaRecord
     */
    public VendaDiaRecord() {
        super(VendaDia.VENDA_DIA);
    }

    /**
     * Create a detached, initialised VendaDiaRecord
     */
    public VendaDiaRecord(Timestamp createdDate, UUID createdUser, Timestamp updatedDate, UUID updatedUser, Boolean active, UUID id, Timestamp data, Double valorAbertura, Double valorFechamento, StatusVendaDia status, String motivoCancelamento) {
        super(VendaDia.VENDA_DIA);

        set(0, createdDate);
        set(1, createdUser);
        set(2, updatedDate);
        set(3, updatedUser);
        set(4, active);
        set(5, id);
        set(6, data);
        set(7, valorAbertura);
        set(8, valorFechamento);
        set(9, status);
        set(10, motivoCancelamento);
    }
}