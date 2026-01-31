package com.streamapi.toptrendingmovies;

class Movie {
    String name;
    int releaseYear;
    double rating;

    Movie(String name, int releaseYear, double rating) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " (" + releaseYear + ") - Rating: " + rating;
    }
}
