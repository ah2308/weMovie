package com.weMovies.dao;

import com.weMovies.dto.LoginDTO;
import com.weMovies.dto.MemberDTO;
import com.weMovies.dto.MovieDTO;

//요기에 @Primary 있었음
public interface MovieDAO {
    //예약
    public String ticketing(MovieDTO mdto);
}
