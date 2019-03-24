package com.dhammananda.animesm.models;

import com.dhammananda.animesm.enums.Genre;

import java.util.List;

public class Fanbase {

    private Integer animeId;
    private String name;
    private String synopsis;
    private List<Genre> genres;
    private Double rating;
    private Double latitude;
    private Double longitude;

    public Fanbase() {
    }

    public Integer getAnimeId() {
        return animeId;
    }

    public void setAnimeId(Integer animeId) {
        this.animeId = animeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public String getGenresInString() {
        StringBuilder s = new StringBuilder();
        for (Genre genre : genres) {
            s.append(genre.toString()).append(", ");
        }
        return s.toString();
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}
