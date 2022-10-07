package com.weMovies.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.weMovies.dto.MovieDTO;

@Repository("movieDAO")
public class MovieDAOImpl implements MovieDAO{
    
    @Inject
    SqlSession sqlSession;

    @Override
    public void apiLoad(MovieDTO mdto) throws Exception {
        sqlSession.insert("movie.apiLoad", mdto);     
    }
}
