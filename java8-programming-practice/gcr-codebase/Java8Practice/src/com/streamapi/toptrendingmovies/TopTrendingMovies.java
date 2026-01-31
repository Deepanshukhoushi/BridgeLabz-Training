package com.streamapi.toptrendingmovies;

import java.util.*;

public class TopTrendingMovies {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 2023, 9.1),
            new Movie("Movie B", 2022, 8.7),
            new Movie("Movie C", 2019, 8.9),
            new Movie("Movie D", 2021, 9.3),
            new Movie("Movie E", 2017, 8.5),
            new Movie("Movie F", 2020, 9.0),
            new Movie("Movie G", 2024, 9.4)
        );

        System.out.println("Top 5 Trending Movies:");

        movies.stream()
              .filter(m -> m.releaseYear >= 2019)

              .sorted((m1, m2) -> Double.compare(m2.rating, m1.rating))

              .limit(5)

              .forEach(System.out::println);
    }
}
