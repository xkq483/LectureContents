package com.example.demo.controller.board;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
// Controller  vs  RestController의 차이점은 딱 하나다.
// Controller는 HTML을 파싱하는반면
// RestController는 json을 파싱한다
@RestController
public class SixthController {

    @GetMapping("/jsonTest")
    public String getJsonTest(){

        return "I'm JSON!!!";
    }

    @GetMapping("/jsonKeyValueTest")
    public String getJsonKeyValueTest(){
        // 모든 json 데이터는 아래와 같이 생겼음
        // 향후 Vue에서 보내는 데이터도 전부 이 json 형태로 날아옴
        // 우리가 SRT API나 여러가지 Rest API라고 하는 녀석들도
        // 요청을 하면 데이터 형식이 전부 json 형식으로 날아옴
        String jsonString = "{\"title\": \"hihi\",  " +
                "\"draft\": false,  " +
                "\"star\": 5" +
                "}";

        // JSON 파싱
        JSONObject jObj = new JSONObject(jsonString);
        String title = jObj.getString("title");
        Boolean draft = jObj.getBoolean("draft");
        Integer star = jObj.getInt("star");

        log.info("title: " + title + ", draft: " + draft + ", star: " + star);

        return jsonString;
    }

    @GetMapping("/jsonMultiObjectest")
    public String getJsonMultiObjectest(){

        String jsonString = "{" +
                "\"movie1\": {" +
                    "\"title\": \"hihi\",  " +
                    "\"draft\": false,  " +
                    "\"star\": 5" +
                    "}, " +
                "\"movie2\": {" +
                    "\"title\": \"code monkey\",  " +
                    "\"draft\": false,  " +
                    "\"star\": 5" +
                    "}, " +
                "}";

        return jsonString;
    }
}
