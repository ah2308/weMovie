package com.weMovies.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieDTO {
    
    private int id;
    private String original_title;
    private String title;
    private String poster_path;
    private String release_date;
    private String overview;
    private String genres;
    private int runtime;
    
    public MovieDTO() {
    }
    public MovieDTO(int id, String genres, int runtime) {
        this.id = id;
        this.genres = genres;
        this.runtime = runtime;
    }
    public MovieDTO(int id, String original_title, String title, String poster_path, String release_date, String overview) {
        this.id = id;
        this.original_title = original_title;
        this.title = title;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.overview = overview;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getOriginal_title() {
        return original_title;
    }
    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPoster_path() {
        return poster_path;
    }
    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }
    public String getRelease_date() {
        return release_date;
    }
    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }
    public String getOverview() {
        return overview;
    }
    public void setOverview(String overview) {
        this.overview = overview;
    }
}
