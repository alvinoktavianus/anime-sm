package com.dhammananda.animesm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.dhammananda.animesm.R;
import com.dhammananda.animesm.models.Fanbase;

import java.util.List;
import java.util.StringJoiner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class AnimeListAdapter extends ArrayAdapter<Fanbase> {

    private final Context context;
    private final List<Fanbase> fanbases;

    public AnimeListAdapter(@NonNull Context context, int resource, @NonNull List<Fanbase> objects) {
        super(context, resource, objects);
        this.context = context;
        fanbases = objects;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.anime_list, parent, false);
        AppCompatTextView animeTitle = view.findViewById(R.id.anime_title);
        AppCompatTextView animeGenre = view.findViewById(R.id.anime_genre);
        AppCompatTextView animeRating = view.findViewById(R.id.anime_rating);


        animeTitle.setText(fanbases.get(position).getName());
        animeGenre.setText(fanbases.get(position).getGenresInString());
        animeRating.setText(fanbases.get(position).getRating().toString());

        return view;
    }
}
