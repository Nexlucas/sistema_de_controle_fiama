package com.biolab.controle.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int peso;
    private String unidade_medida;
    private double valor_unitario;
    private int quantidade;
    private String categoria;

    public Material() {
    }

    public Material(String nome, int peso, String unidade_medida, double valor_unitario, int quantidade, String categoria) {
        this.nome = nome;
        this.peso = peso;
        this.unidade_medida = unidade_medida;
        this.valor_unitario = valor_unitario;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public Material(long id, String nome, int peso, String unidade_medida, double valor_unitario, int quantidade, String categoria) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.unidade_medida = unidade_medida;
        this.valor_unitario = valor_unitario;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getUnidade_medida() {
        return unidade_medida;
    }

    public void setUnidade_medida(String unidade_medida) {
        this.unidade_medida = unidade_medida;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
