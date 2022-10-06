package com.example.spingbootswagger2.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserOne {
    private Long id;
    private String firstName;
    private int age;
    private String email;

    @Builder
    public UserOne(Long id, String firstName, int age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.email = email;
    }
}
