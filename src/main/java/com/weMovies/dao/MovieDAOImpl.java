package com.weMovies.dao;

import java.util.List;

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

    @Override
    public List<MovieDTO> movieList(MovieDTO movieDTO) throws Exception {
        // TODO Auto-generated method stub
        return sqlSession.selectList("movieList", movieDTO);
    }

    @Override
    public void delMovie(String title) throws Exception {
        // TODO Auto-generated method stub
        sqlSession.delete("movie.delMovie", title);
    }

    @Override
    public void mvUpdate(MovieDTO mdto) throws Exception {
        sqlSession.update("movie.movieDetail", mdto);
    }
    
}