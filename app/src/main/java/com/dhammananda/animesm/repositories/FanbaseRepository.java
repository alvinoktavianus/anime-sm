package com.dhammananda.animesm.repositories;

import com.dhammananda.animesm.models.Fanbase;

import java.util.List;

public class FanbaseRepository {

    private List<Fanbase> fanbases;

    public FanbaseRepository(List<Fanbase> fanbases) {
        this.fanbases = fanbases;
    }

    public List<Fanbase> findAll() {
        return fanbases;
    }

    public Fanbase findByAnimeId(Integer id) {
        for (Fanbase fanbase : fanbases) {
            if (fanbase.getAnimeId().equals(id)) {
                return fanbase;
            }
        }
        return null;
    }

}
