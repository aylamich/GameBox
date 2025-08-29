package com.box.gamebox.ui.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.box.gamebox.R;
import com.box.gamebox.ui.Models.FavoriteGame;

import java.util.ArrayList;
import java.util.List;

public class FavoriteGameAdapter extends RecyclerView.Adapter<FavoriteGameAdapter.FavoriteGameViewHolder> {

    private List<FavoriteGame> favoriteGameList;

    public FavoriteGameAdapter(List<FavoriteGame> favoriteGameList) {
        if (favoriteGameList == null) {
            this.favoriteGameList = new ArrayList<>();
        } else {
            this.favoriteGameList = favoriteGameList;
        }
    }

    @NonNull
    @Override
    public FavoriteGameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_game, parent, false);
        return new FavoriteGameViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteGameViewHolder holder, int position) {
        if (favoriteGameList == null || position < 0 || position >= favoriteGameList.size()) {
            return;
        }
        FavoriteGame currentGame = favoriteGameList.get(position);

        if (currentGame == null) {
            return;
        }

        holder.titleTextView.setText(currentGame.getTitulo());

        int imageResId = currentGame.getIdImagemResource();

        if (imageResId != 0) {
            holder.gameImageView.setImageResource(imageResId);
        } else {
            holder.gameImageView.setImageResource(R.drawable.placeholder_image);
        }
    }

    @Override
    public int getItemCount() {
        return favoriteGameList != null ? favoriteGameList.size() : 0;
    }

    public static class FavoriteGameViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        ImageView gameImageView;

        public FavoriteGameViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.nomeJogo);
            gameImageView = itemView.findViewById(R.id.imagemJogo);
        }
    }
}
