package com.box.gamebox.ui.Activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.box.gamebox.R;
import com.box.gamebox.ui.Models.FavoriteGame;
import com.box.gamebox.ui.Adapter.FavoriteGameAdapter;

import java.util.ArrayList;
import java.util.List;

public class FavoriteGamesActivity extends AppCompatActivity {
    private RecyclerView favoriteGamesRecyclerView;
    private FavoriteGameAdapter favoriteGameAdapter;
    private final List<FavoriteGame> favoriteGamesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_games);

        favoriteGamesRecyclerView = findViewById(R.id.gamesRecyclerView);
        if (favoriteGamesRecyclerView == null) {
            return;
        }

        favoriteGamesRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        loadStaticFavoriteGames();

        favoriteGameAdapter = new FavoriteGameAdapter(favoriteGamesList);
        favoriteGamesRecyclerView.setAdapter(favoriteGameAdapter);
    }

    private void loadStaticFavoriteGames() {
        favoriteGamesList.clear();
        favoriteGamesList.add(new FavoriteGame(
                101, "jogo epico meudeus", "2023-01-15", R.drawable.tlou, 4.8, 1500));
        favoriteGamesList.add(new FavoriteGame(
                102, "jogo", "2022-07-20", R.drawable.tlou2, 4.5, 950));
    }
}
