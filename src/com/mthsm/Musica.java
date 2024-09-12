package com.mthsm;

public class Musica {
    private String nome;
    private FormatoAudio formato;
    private String caminho;

    Musica(String nome, FormatoAudio formato, String caminho) {
    }

    public String getNome() {
        return nome;
    }

    public String getCaminho() {
        return caminho;
    }

    public String getFormato() {
        return formato.getExtensao();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }
}
