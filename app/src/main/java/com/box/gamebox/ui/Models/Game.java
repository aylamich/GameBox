package com.box.gamebox.ui.Models;

public class Game {
    private String titulo;
    private int idImagem;

    public Game(String titulo, int idImagem) {
        this.titulo = titulo;
        this.idImagem = idImagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getIdImagem() {
        return idImagem;
    }
}