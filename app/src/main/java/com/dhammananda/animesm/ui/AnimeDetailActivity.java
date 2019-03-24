package com.dhammananda.animesm.ui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.dhammananda.animesm.R;
import com.dhammananda.animesm.models.Fanbase;
import com.dhammananda.animesm.repositories.FanbaseRepository;

public class AnimeDetailActivity extends AppCompatActivity implements View.OnClickListener {

    AppCompatTextView animeName;
    AppCompatTextView animeGenre;
    AppCompatTextView animeRating;
    AppCompatTextView animeSynopsis;
    AppCompatTextView animeFanbaseLocation;
    AppCompatButton buttonRegister;

    FanbaseRepository fanbaseRepository;
    Fanbase fanbase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_detail);

        animeName = findViewById(R.id.text_view_anime_name);
        animeGenre = findViewById(R.id.text_view_anime_genre);
        animeRating = findViewById(R.id.text_view_anime_rating);
        animeSynopsis = findViewById(R.id.text_view_anime_synopsis);
        animeFanbaseLocation = findViewById(R.id.text_view_fanbase_location);
        buttonRegister = findViewById(R.id.button_register_fanbase);

        int position = getIntent().getIntExtra("fanbase_position", 0);
        fanbaseRepository = FanbaseRepository.getInstance();
        fanbase = fanbaseRepository.findByListIndex(position);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(fanbase.getName());
        }

        animeName.setText(getString(R.string.text_anime_name, fanbase.getName()));
        animeGenre.setText(getString(R.string.text_anime_genre, fanbase.getGenresInString()));
        animeRating.setText(getString(R.string.text_anime_rating, fanbase.getRating().toString()));
        animeSynopsis.setText(getString(R.string.text_anime_synopsis, fanbase.getSynopsis()));
        animeFanbaseLocation.setText(getString(R.string.text_fanbase_location, fanbase.getLatitude().toString(), fanbase.getLongitude().toString()));

        buttonRegister.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_register_fanbase:
                onClickRegister();
                break;
        }
    }

    private void onClickRegister() {

    }
}
