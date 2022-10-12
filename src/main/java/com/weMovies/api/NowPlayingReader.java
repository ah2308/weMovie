package com.weMovies.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class NowPlayingReader {
    public static void main(String[] args) {
        String result = "";
        try {
            // 영화 초기 데이터를 받아오는 API 주소입니다.
            URL mvInfo = new URL("https://api.themoviedb.org/3/movie/19995?api_key=22376a02c7c78135128730f34dd4622a&language=ko-KR");

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
                String genres = (String) object.get("name");
                System.out.println(genres);
            }
            System.out.println(runtime);
            JSONArray jsonArray = (JSONArray) jsonObject.get("results");
            for(int i=0; i<jsonArray.size(); i++) {
                JSONObject object = (JSONObject) jsonArray.get(i);
                int id = Integer.parseInt(object.get("id").toString());
                String title = (String) object.get("title");
                String original_title = (String) object.get("original_title");
                String release_date = (String) object.get("release_date");
                String overview = (String) object.get("overview");
                String poster_path = (String) object.get("poster_path");
                System.out.println(id);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void testing() {
        System.out.println("테스트 동작");
    }
}
