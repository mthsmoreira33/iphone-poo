package com.mthsm;

public class Musica {
    private String nome;
    private FormatoAudio formato;
    private String caminho;

    Musica(String nome, FormatoAudio formato, String caminho) {
        this.nome = nome;
        this.formato = formato;
        this.caminho = caminho;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCaminho() {
        return this.caminho;
    }

    public String getFormato() {
        return this.formato.getExtensao();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }
}
