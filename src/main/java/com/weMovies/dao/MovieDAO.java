package com.weMovies.dao;

import java.util.List;
import com.weMovies.dto.MovieDTO;

public interface MovieDAO {
    
    public void apiLoad(MovieDTO mdto)throws Exception;
    
    public List<MovieDTO> movieList(MovieDTO movieDTO) throws Exception;
    
    public void delMovie(String title) throws Exception;
    
    public void mvUpdate(MovieDTO mdto) throws Exception;


import com.weMovies.dto.LoginDTO;
import com.weMovies.dto.MemberDTO;
import com.weMovies.dto.MovieDTO;

//요기에 @Primary 있었음
public interface MovieDAO {
    //예약
    public String ticketing(MovieDTO mdto);
}
