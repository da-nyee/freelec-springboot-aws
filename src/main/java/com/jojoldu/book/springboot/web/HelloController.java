package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                             // Controller --> JSON 반환하는 Controller 변환
public class HelloController {

    @GetMapping("/hello")                   // GET(HTTP Method) 요청 받을 수 있는 API 생성
    public String hello() {
        return "hello";
    }
}
