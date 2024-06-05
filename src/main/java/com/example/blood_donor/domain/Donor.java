package com.example.blood_donor.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "donor")
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(unique = true, nullable = false)
    private String fotoUrl;
    @Column(unique = true, nullable = false)
    private String nome;
    private String tipo;
    private String bairro;

    public Donor(UUID id, String fotoUrl, String nome, String tipo, String bairro) {
        this.id = id;
        this.fotoUrl = fotoUrl;
        this.nome = nome;
        this.tipo = tipo;
        this.bairro = bairro;
    }

    public Donor() {}
    /*
    * Getters
    * */
    public UUID getId() {
        return id;
    }
    public String getFotoUrl() {
        return fotoUrl;
    }
    public String getNome() {
        return nome;
    }
    public String getTipo() {
        return tipo;
    }
    public String getBairro() {
        return bairro;
    }
    /*
     * Setters
     * */
    public void setId(UUID id) {
        this.id = id;
    }
    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

}
