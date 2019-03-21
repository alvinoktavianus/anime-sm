package com.dhammananda.animesm.enums;

public enum Genre {

    FANTASY("Fantasy"),
    COMEDY("Comedy"),
    ACTION("Action"),
    ADVENTURE("Adventure"),
    SCHOOL("School"),
    MYSTERY("Mystery");

    private String label;

    Genre(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }

}
