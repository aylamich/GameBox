package com.box.gamebox.ui.Activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import com.box.gamebox.R;
import com.box.gamebox.ui.Game;
import com.box.gamebox.ui.GameAdapter;

import java.util.ArrayList;
import java.util.List;

public class GamesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        // configuracao pro menu
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //  RecyclerView, lista de jogos estaticos (depois mudar pra outro arquivo pq vai ter mais)
        RecyclerView recyclerView = findViewById(R.id.gamesRecyclerView);
        List<Game> gameList = new ArrayList<>();
        gameList.add(new Game("The Last of Us", R.drawable.tlou));
        gameList.add(new Game("The Last of Us Part II", R.drawable.tlou2));
        GameAdapter adaptador = new GameAdapter(gameList);
        recyclerView.setAdapter(adaptador);
    }


}