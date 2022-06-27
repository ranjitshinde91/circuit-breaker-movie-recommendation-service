package com.movierecommendation.service;

import com.movierecommendation.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieRecommendationService {

    public List<Movie> recommendedMovies() {
        return List.of(
                new Movie("Bhool Bhulaiyaa 2", "20 May 2022", "145 min", "Hindi"),
                new Movie("Lightyear", "17 June 2022", "105 min", "English")
        );
    }
}
