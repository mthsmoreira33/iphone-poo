package com.mthsm;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void exibirPagina(String url) {
        System.out.println("Bem vindo à página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    @Override
    public void efetuarLigacao(int numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void encerrarLigacao() {
        System.out.println("Ligação encerrada");
    }

    @Override
    public void IniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.println("Música selecionada: " + musica.getNome());
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausar música");
    }
}
