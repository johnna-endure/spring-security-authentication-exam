package com.example.springsecurityplayground.member.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private String password;
    private String role;

    protected Member() {}

    public Member(String name, String password, String role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }
}
