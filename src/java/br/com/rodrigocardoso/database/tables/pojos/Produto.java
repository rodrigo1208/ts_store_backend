/*
 * This file is generated by jOOQ.
*/
package br.com.rodrigocardoso.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;


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
public class Produto implements Serializable {

    private static final long serialVersionUID = 288097778;

    private Timestamp createdDate;
    private UUID      createdUser;
    private Timestamp updatedDate;
    private UUID      updatedUser;
    private Boolean   active;
    private UUID      id;
    private String    descricao;
    private String    codigo;
    private Double    valor;
    private UUID      categoriaId;

    public Produto() {}

    public Produto(Produto value) {
        this.createdDate = value.createdDate;
        this.createdUser = value.createdUser;
        this.updatedDate = value.updatedDate;
        this.updatedUser = value.updatedUser;
        this.active = value.active;
        this.id = value.id;
        this.descricao = value.descricao;
        this.codigo = value.codigo;
        this.valor = value.valor;
        this.categoriaId = value.categoriaId;
    }

    public Produto(
        Timestamp createdDate,
        UUID      createdUser,
        Timestamp updatedDate,
        UUID      updatedUser,
        Boolean   active,
        UUID      id,
        String    descricao,
        String    codigo,
        Double    valor,
        UUID      categoriaId
    ) {
        this.createdDate = createdDate;
        this.createdUser = createdUser;
        this.updatedDate = updatedDate;
        this.updatedUser = updatedUser;
        this.active = active;
        this.id = id;
        this.descricao = descricao;
        this.codigo = codigo;
        this.valor = valor;
        this.categoriaId = categoriaId;
    }

    public Timestamp getCreatedDate() {
        return this.createdDate;
    }

    public Produto setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public UUID getCreatedUser() {
        return this.createdUser;
    }

    public Produto setCreatedUser(UUID createdUser) {
        this.createdUser = createdUser;
        return this;
    }

    public Timestamp getUpdatedDate() {
        return this.updatedDate;
    }

    public Produto setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    public UUID getUpdatedUser() {
        return this.updatedUser;
    }

    public Produto setUpdatedUser(UUID updatedUser) {
        this.updatedUser = updatedUser;
        return this;
    }

    public Boolean getActive() {
        return this.active;
    }

    public Produto setActive(Boolean active) {
        this.active = active;
        return this;
    }

    public UUID getId() {
        return this.id;
    }

    public Produto setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public Produto setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public Double getValor() {
        return this.valor;
    }

    public Produto setValor(Double valor) {
        this.valor = valor;
        return this;
    }

    public UUID getCategoriaId() {
        return this.categoriaId;
    }

    public Produto setCategoriaId(UUID categoriaId) {
        this.categoriaId = categoriaId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Produto (");

        sb.append(createdDate);
        sb.append(", ").append(createdUser);
        sb.append(", ").append(updatedDate);
        sb.append(", ").append(updatedUser);
        sb.append(", ").append(active);
        sb.append(", ").append(id);
        sb.append(", ").append(descricao);
        sb.append(", ").append(codigo);
        sb.append(", ").append(valor);
        sb.append(", ").append(categoriaId);

        sb.append(")");
        return sb.toString();
    }
}
