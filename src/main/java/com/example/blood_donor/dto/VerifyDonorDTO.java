package com.example.blood_donor.dto;

public class VerifyDonorDTO {
    private String tipo;
    private String bairro;

    public VerifyDonorDTO(String tipo, String bairro) {
        this.tipo = tipo;
        this.bairro = bairro;
    }
    public VerifyDonorDTO() {}

    /*
    * Getters
    * */
    public String getTipo() {
        return tipo;
    }
    public String getBairro() {
        return bairro;
    }
    /*
     * Setters
     * */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
