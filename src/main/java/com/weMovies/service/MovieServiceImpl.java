package com.weMovies.service;

import javax.inject.Inject;

import com.weMovies.dao.MovieDAO;
import com.weMovies.dto.MovieDTO;

public class MovieServiceImpl implements MovieService{

    @Inject
    MovieDAO mDAO;
    
    @Override
    public String ticketing(MovieDTO mdto) {
       return mDAO.ticketing(mdto);
    }

}
