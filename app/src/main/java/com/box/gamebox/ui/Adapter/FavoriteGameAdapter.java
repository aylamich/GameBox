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
import com.squareup.picasso.Picasso;
import java.util.List;

public class FavoriteGameAdapter extends RecyclerView.Adapter<FavoriteGameAdapter.FavoriteGameViewHolder> {

    private List<FavoriteGame> favoriteGameList;

    public FavoriteGameAdapter(List<FavoriteGame> favoriteGameList) {
        this.favoriteGameList = favoriteGameList;
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
        FavoriteGame currentGame = favoriteGameList.get(position);
        holder.titleTextView.setText(currentGame.getTitulo());

        int imageResId = currentGame.getIdImagemResource();

        if (imageResId != 0) {
            Picasso.get()
                    .load(imageResId)
                    .placeholder(R.drawable.placeholder_image)
                    .error(R.drawable.placeholder_image)
                    .into(holder.gameImageView);

        } else {
            holder.gameImageView.setImageResource(R.drawable.placeholder_image);
        }
    }

    @Override
    public int getItemCount() {
        return favoriteGameList.size();
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

