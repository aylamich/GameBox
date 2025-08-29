package com.box.gamebox.ui.Models;

public class FavoriteGame {
    private int id;
    private String titulo;
    private String dataLancamento;
    private int idImagemResource;
    private double avaliacao;
    private int contagemAvaliacoes;

    public FavoriteGame(int id, String titulo, String dataLancamento,
                        int idImagemResource,
                        double avaliacao, int contagemAvaliacoes) {
        this.id = id;
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.idImagemResource = idImagemResource;
        this.avaliacao = avaliacao;
        this.contagemAvaliacoes = contagemAvaliacoes;
    }

    // Getters
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDataLancamento() { return dataLancamento; }
    public int getIdImagemResource() { return idImagemResource; }
    public double getAvaliacao() { return avaliacao; }
    public int getContagemAvaliacoes() { return contagemAvaliacoes; }
}
