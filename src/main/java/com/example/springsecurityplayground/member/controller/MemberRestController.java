package com.example.springsecurityplayground.member.controller;

import com.example.springsecurityplayground.member.entity.Member;
import com.example.springsecurityplayground.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberRestController {

    private final MemberService memberService;

    @GetMapping("/members")
    public List<Member> members() {
        return memberService.findAll();
    }

}
