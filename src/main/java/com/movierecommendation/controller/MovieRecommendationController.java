package com.movierecommendation.controller;

import com.movierecommendation.model.Movie;
import com.movierecommendation.service.MovieRecommendationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class MovieRecommendationController {
    private final MovieRecommendationService movieRecommendationService;

    public MovieRecommendationController(MovieRecommendationService movieRecommendationService) {
        this.movieRecommendationService = movieRecommendationService;
    }

    @GetMapping("recommendedMovies")
    public List<Movie> recommendedMovies() throws InterruptedException {
        TimeUnit.SECONDS.sleep(15);
        return movieRecommendationService.recommendedMovies();
    }
}
