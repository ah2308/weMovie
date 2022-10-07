package com.weMovies.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.weMovies.dao.MovieDAO;
import com.weMovies.dto.MovieDTO;

@Service("movieService")
public class MovieServiceImpl implements MovieService {
    
    @Inject
    MovieDAO mdao;

    @Override
    public void apiLoad(MovieDTO mdto) throws Exception {
        mdao.apiLoad(mdto);
    }
}