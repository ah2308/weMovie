package com.weMovies.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weMovies.dto.MovieDTO;
import com.weMovies.service.MovieService;

@Controller
public class APIController {
    
    @Autowired
    private MovieService movieService;
    
    private MovieDTO movieDTO;
    
    //영화 1차 데이터를 받아옵니다. 40개의 데이터를 가져올 예정.
    @RequestMapping("/movie/api")
    public String MovieInfo(){
        String result = "";
        try {
            for(int j=1; j<3; j++) {
             // 영화 초기 데이터를 받아오는 API 주소입니다. 중복된 값이 있는 경우 추가되지 않습니다.
                URL mvInfo = new URL("https://api.themoviedb.org/3/movie/now_playing?api_key=22376a02c7c78135128730f34dd4622a&language=ko-KR&page="+j);
                HttpURLConnection urlConnection = (HttpURLConnection)mvInfo.openConnection();
                urlConnection.setRequestMethod("GET");
                urlConnection.setRequestProperty("Content-type", "application/json");
                
                BufferedReader bf = new BufferedReader(new InputStreamReader(mvInfo.openStream(), "UTF-8"));
                result = bf.readLine();
                
                JSONParser jsonParser = new JSONParser();
                JSONObject jsonObject = (JSONObject) jsonParser.parse(result);
                JSONArray jsonArray = (JSONArray) jsonObject.get("results");
                for(int i=0; i<jsonArray.size(); i++) {
                    JSONObject object = (JSONObject) jsonArray.get(i);
                    int id = Integer.parseInt(object.get("id").toString());
                    String title = (String) object.get("title");
                    String original_title = (String) object.get("original_title");
                    String release_date = (String) object.get("release_date");
                    String overview = (String) object.get("overview");
                    String poster_path = (String) object.get("poster_path");
                    MovieDTO movieDTO = new MovieDTO(id, original_title, title, poster_path, release_date, overview);
                    movieService.apiLoad(movieDTO);
                }
            }         
        }catch(Exception e) {
            e.printStackTrace();
        }
        return "redirect:/movie/list";
    }
    
    // 영화 2차 데이터를 받는 주소입니다. 장르, 런타임을 받아옵니다.
    @RequestMapping("/movie/update")
    public String apiLoad2(HttpServletRequest request) {
        String result = "";
        int id = Integer.parseInt(request.getParameter("id"));
        String genres = "";
        try {
            // id의 값은 버튼 클릭시 jsp에서 파라미터로 받아올 수 있도록 설정해두었습니다.
            URL mvInfo = new URL("https://api.themoviedb.org/3/movie/" + id + "?api_key=22376a02c7c78135128730f34dd4622a&language=ko-KR");
            HttpURLConnection urlConnection = (HttpURLConnection)mvInfo.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setRequestProperty("Content-type", "application/json");
            
            BufferedReader bf = new BufferedReader(new InputStreamReader(mvInfo.openStream(), "UTF-8"));
            result = bf.readLine();
            
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(result);
            JSONArray jsonArray = (JSONArray) jsonObject.get("genres");
            int runtime = Integer.parseInt(jsonObject.get("runtime").toString());
            for(int i=0; i<jsonArray.size(); i++) {
                JSONObject object = (JSONObject) jsonArray.get(i);
                genres += (String) object.get("name")+"; ";
            }
            MovieDTO movieDTO = new MovieDTO(id, genres, runtime);
            System.out.println("영화 상세정보 아이디: " + id + " 장르: " + genres + " 상영시간: " + runtime);
            movieService.mvUpdate(movieDTO);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return "admin/admin_upload";
    }
    
}