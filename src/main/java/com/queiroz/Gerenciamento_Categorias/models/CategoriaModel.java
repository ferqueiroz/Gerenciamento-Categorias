package com.queiroz.Gerenciamento_Categorias.models;

import jakarta.persistence.*;

@Entity(name = "Categoria")
@Table(name = "tb_categoria")
public class CategoriaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CAT_ID")
    private int id;

    @Column(name = "CAT_NOME")
    private String nome;

    @Column(name = "CAT_DESCRICAO")
    private String descricao;

    public CategoriaModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
