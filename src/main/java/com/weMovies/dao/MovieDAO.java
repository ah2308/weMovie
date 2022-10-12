package com.weMovies.dao;

import java.util.List;

import com.weMovies.dto.MovieDTO;

public interface MovieDAO {
    
    public void apiLoad(MovieDTO mdto)throws Exception;
    
    public List<MovieDTO> movieList(MovieDTO movieDTO) throws Exception;
    
    public void delMovie(String title) throws Exception;
    
    public void mvUpdate(MovieDTO mdto) throws Exception;
}
