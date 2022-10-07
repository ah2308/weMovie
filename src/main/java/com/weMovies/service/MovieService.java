package com.weMovies.service;

import com.weMovies.dto.MovieDTO;

public interface MovieService {
    
    // api에서 데이터값을 1차 추출
    public void apiLoad(MovieDTO mdto)throws Exception;
    //예약
    public String ticketing(MovieDTO mdto);
}
