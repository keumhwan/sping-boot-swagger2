package com.example.spingbootswagger2.domain.controller;

import com.example.spingbootswagger2.domain.dto.UserOne;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "사용자 API", description = "사용자 관련 API")
@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    @Tag(name = "사용자 API", description = "사용자 목록 조회")
    @GetMapping(value = "/users")
    public List<UserOne> users() {
        return List.of(
                UserOne.builder().id(1L).age(20).email("jason@kakao.com").firstName("Jason").build(),
                UserOne.builder().id(2L).age(21).email("john@kakao.com").firstName("john").build(),
                UserOne.builder().id(3L).age(26).email("peter@kakao.com").firstName("Peter").build()
        );
    }
}
