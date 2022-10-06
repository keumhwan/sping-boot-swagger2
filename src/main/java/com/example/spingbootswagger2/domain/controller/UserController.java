package com.example.spingbootswagger2.domain.controller;

import com.example.spingbootswagger2.domain.dto.UserOne;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @GetMapping(value = "/users")
    public List<UserOne> users() {
        return List.of(
                UserOne.builder().id(1L).age(20).email("jason@kakao.com").firstName("Jason").build(),
                UserOne.builder().id(2L).age(21).email("john@kakao.com").firstName("john").build(),
                UserOne.builder().id(3L).age(26).email("peter@kakao.com").firstName("Peter").build()
        );
    }
}
