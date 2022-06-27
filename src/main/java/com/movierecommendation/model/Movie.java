package com.movierecommendation.model;


public class Movie {
    private String name;
    private String releaseDate;
    private String runningTime;
    private String language;

    public Movie(String name, String releaseDate, String runningTime, String language) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.runningTime = runningTime;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public String getLanguage() {
        return language;
    }
}
