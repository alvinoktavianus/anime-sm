package com.dhammananda.animesm.ui;

import android.os.Bundle;import android.widget.ListView;
import android.widget.Toast;

import com.dhammananda.animesm.R;
import com.dhammananda.animesm.adapter.AnimeListAdapter;
import com.dhammananda.animesm.repositories.FanbaseRepository;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView animeListView;
    FanbaseRepository fanbaseRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animeListView = findViewById(R.id.anime_list_view);

        fanbaseRepository = FanbaseRepository.getInstance();

        animeListView.setAdapter(new AnimeListAdapter(this, R.layout.anime_list, fanbaseRepository.findAll()));
        animeListView.setOnItemClickListener((parent, view, position, id) -> {

            String selectedTitle = fanbaseRepository.findAll().get(position).getName();
            Toast.makeText(this, selectedTitle, Toast.LENGTH_SHORT).show();
        });
    }

}
