package com.dhammananda.animesm.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

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
            Intent intent = new Intent(MainActivity.this, AnimeDetailActivity.class);
            intent.putExtra("fanbase_position", position);
            startActivity(intent);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_logout:
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                return true;
        }
        return false;
    }
}
