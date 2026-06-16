package com.biolab.controle.entities;

import jakarta.persistence.*;

@Entity
public class Movimentacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_data_entrada")
    private Material data_entrada;
    private String data_retirada;
    private int quantidade;
    @ManyToOne
    @JoinColumn(name = "material_id")
    private Material material;


    public Movimentacao() {
    }

    public Movimentacao(Material data_entrada, String data_retirada, int quantidade, Material material) {
        this.data_entrada = data_entrada;
        this.data_retirada = data_retirada;
        this.quantidade = quantidade;
        this.material = material;
    }

    public Movimentacao(int id, Material data_entrada, String data_retirada, int quantidade, Material material) {
        this.id = id;
        this.data_entrada = data_entrada;
        this.data_retirada = data_retirada;
        this.quantidade = quantidade;
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Material getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Material data_entrada) {
        this.data_entrada = data_entrada;
    }

    public String getData_retirada() {
        return data_retirada;
    }

    public void setData_retirada(String data_retirada) {
        this.data_retirada = data_retirada;
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
