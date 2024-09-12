package com.mthsm;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Musica musica = new Musica("Darude - Sandstorm", FormatoAudio.MP3, "./musicas");

        iphone.exibirPagina("https://google.com/");
        iphone.efetuarLigacao(123456789);
        iphone.encerrarLigacao();
        iphone.selecionarMusica(musica);
        iphone.tocarMusica();
        iphone.pausarMusica();
    }
}