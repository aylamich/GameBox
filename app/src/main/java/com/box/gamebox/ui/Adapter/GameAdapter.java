package com.box.gamebox.ui.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.box.gamebox.R;
import com.box.gamebox.ui.Models.Game;

import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameViewHolder> {
    private List<Game> listaJogos;

    public GameAdapter(List<Game> listaJogos) {
        this.listaJogos = listaJogos;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_game, parent, false);
        return new GameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        Game jogo = listaJogos.get(position);
        holder.textoTitulo.setText(jogo.getTitulo());
        holder.imagem.setImageResource(jogo.getIdImagem());
    }

    @Override
    public int getItemCount() {
        return listaJogos.size();
    }

    static class GameViewHolder extends RecyclerView.ViewHolder {
        ImageView imagem;
        TextView textoTitulo;

        public GameViewHolder(@NonNull View itemView) {
            super(itemView);
            imagem = itemView.findViewById(R.id.imagemJogo);
            textoTitulo = itemView.findViewById(R.id.nomeJogo);
        }
    }
}