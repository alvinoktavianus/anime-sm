package com.dhammananda.animesm.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.dhammananda.animesm.R;
import com.dhammananda.animesm.models.Fanbase;
import com.dhammananda.animesm.repositories.FanbaseRepository;

public class AnimeDetailActivity extends AppCompatActivity {

    FanbaseRepository fanbaseRepository;
    Fanbase fanbase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_detail);

        fanbaseRepository = FanbaseRepository.getInstance();

        int position = getIntent().getIntExtra("fanbase_position", 0);
        fanbase = fanbaseRepository.findByListIndex(position);
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
}
