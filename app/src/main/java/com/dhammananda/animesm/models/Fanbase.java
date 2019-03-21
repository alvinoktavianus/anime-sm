package com.dhammananda.animesm.models;

import com.dhammananda.animesm.enums.Genre;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Fanbase {

    private Integer animeId;
    private String name;
    private String synopsis;
    private List<Genre> genres;
    private Double rating;
    private Double latitude;
    private Double longitude;

}
