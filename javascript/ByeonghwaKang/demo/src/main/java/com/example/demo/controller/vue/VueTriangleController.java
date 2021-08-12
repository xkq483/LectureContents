package com.example.demo.controller.vue;


import com.example.demo.entity.Triangle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class VueTriangleController {

    // 근래 엄중성이 부여되어 RestController를 사용하더라도
    // JSON 방식의 데이터를 처리하려면 PostMapping에
    // 파라미터(입력)에 RequestBody를 붙여서 JSON임을 명시해주는 것이 좋다.
    @PostMapping("/calcTriangle")
    public double getCalcTriangle (@RequestBody Triangle triangle) {
        log.info("getCalcTriangle(): " + triangle);

        Integer height = triangle.getHeight();
        Integer width = triangle.getWidth();

        return height * width / 2.0;
    }
}
