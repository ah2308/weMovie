package com.weMovies.service;

import java.util.List;

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

    @Override
    public List<MovieDTO> movieList(MovieDTO movieDTO) throws Exception {
        // TODO Auto-generated method stub
        return mdao.movieList(movieDTO);
    }

    @Override
    public void delMovie(String title) throws Exception {
        // TODO Auto-generated method stub
        mdao.delMovie(title);
    }

    @Override
    public void mvUpdate(MovieDTO mdto) throws Exception {
        // TODO Auto-generated method stub
        mdao.mvUpdate(mdto);
    }
    

}
