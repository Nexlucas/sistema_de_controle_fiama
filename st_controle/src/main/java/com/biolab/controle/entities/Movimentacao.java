package com.biolab.controle.entities;

import jakarta.persistence.*;

@Entity
public class Movimentacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String data_movimentacao;
    private int quantidade;
    @ManyToOne
    @JoinColumn(name = "material_id")
    private Material material;

    public Movimentacao() {
    }

    public Movimentacao(String data_movimentacao, int quantidade, Material material) {
        this.data_movimentacao = data_movimentacao;
        this.quantidade = quantidade;
        this.material = material;
    }

    public Movimentacao(int id, String data_movimentacao, int quantidade, Material material) {
        this.id = id;
        this.data_movimentacao = data_movimentacao;
        this.quantidade = quantidade;
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData_movimentacao() {
        return data_movimentacao;
    }

    public void setData_movimentacao(String data_movimentacao) {
        this.data_movimentacao = data_movimentacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
