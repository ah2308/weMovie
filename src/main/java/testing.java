import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class testing {
    
    
    static final String BASE_URL = "https://api.themoviedb.org/3/movie/now_playing?api_key=22376a02c7c78135128730f34dd4622a&language=ko-KR&page=1";
    public static void main(String[] args) throws ParseException {

        
        // 포스터 이미지 주소 : https://image.tmdb.org/t/p/original + POSTER_PATH
        /**
         *  REST API 호출하기
         */
        URL url = null;
        HttpURLConnection con= null;
        JSONObject result = null;
        StringBuilder sb = new StringBuilder();
        try {
            // URL 객채 생성 (BASE_URL)
            url = new URL(BASE_URL);
            // URL을 참조하는 객체를 URLConnection 객체로 변환
            con = (HttpURLConnection) url.openConnection();

            // 커넥션 request 방식 "GET"으로 설정
            con.setRequestMethod("GET");

            // 커넥션 request 값 설정(key,value) 
            con.setRequestProperty("Content-type", "application/json");

            // 받아온 JSON 데이터 출력 가능 상태로 변경 (default : false)
            con.setDoOutput(true);

            // 데이터 입력 스트림에 담기
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
            while(br.ready()) {
                sb.append(br.readLine());
            }
            con.disconnect();
        }catch(Exception e) {
            e.printStackTrace();
        }

        /**
         *  JSON 데이터 파싱하기
         */
        // JSONParser에 입력 스트림에 담은 JSON데이터(sb.toString())를 넣어 파싱한 다음 JSONObject로 반환한다.
        JSONObject info = (JSONObject) new JSONParser().parse(sb.toString());

        // REST API 호출 상태 출력하기
        StringBuilder out = new StringBuilder();
        out.append(info.get("status") +" : " + info.get("status_message") +"\n");

        // JSON데이터에서 "data"라는 JSONObject를 가져온다.
        // JSONObject data = (JSONObject) result.get(result);
        // JSONObject에서 Array데이터를 get하여 JSONArray에 저장한다.
        JSONArray array = (JSONArray) info.get("results");

        // 데이터 출력하기 (뮤비 제목, 장르)
        JSONObject tmp;
        out.append("데이터 출력하기 \n");
        for(int i=0; i<array.size(); i++) {
            tmp = (JSONObject) array.get(i);
            out.append("title("+i+") :"+ tmp.get("title") +"\n");
            out.append("original_title("+i+") :"+ tmp.get("original_title") +"\n");
            out.append("release_date("+i+") :"+ tmp.get("release_date") +"\n");
            out.append("vote_average("+i+") :"+ tmp.get("vote_average") +"\n");
            out.append("poster_path("+i+") :"+ tmp.get("poster_path") +"\n");
            out.append("id("+i+") :"+ tmp.get("id") +"\n");

            /* / movies[] 배열 안에 있는 genres[] 데이터 꺼내기
            JSONArray array2 = (JSONArray) tmp.get("genres");
            out.append("genres("+i+"): ");
            for(int j=0; j<array2.size(); j++) {
                out.append(array2.get(j));
                if(j!=array2.size()-1) {
                    out.append(",");
                }
            } */
            out.append("\n");
            out.append("\n");
        }
        System.out.println(out.toString());
    }
}
