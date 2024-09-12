package com.mthsm;

public enum FormatoAudio {
    MP3(".mp3"),
    WAV(".wav"),
    ALAC(".alac");

    private final String extensao;

    FormatoAudio(String extensao) {
        this.extensao = extensao;
    }

    public String getExtensao() {
        return extensao;
    }
}
