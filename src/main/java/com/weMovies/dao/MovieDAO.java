package com.weMovies.dao;

import com.weMovies.dto.MovieDTO;

public interface MovieDAO {
    
    public void apiLoad(MovieDTO mdto)throws Exception;

}
