package com.example.springsecurityplayground.member.service;

import com.example.springsecurityplayground.member.entity.Member;
import com.example.springsecurityplayground.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class MemberService {

    private final MemberRepository memberRepository;
    private final Logger logger = LoggerFactory.getLogger(MemberService.class);
    @PostConstruct
    public void init() {
        memberRepository.save(new Member("11", "1234", "USER"));
        memberRepository.save(new Member("user2", "password2", "USER"));
        memberRepository.save(new Member("user3", "password3", "USER"));
        memberRepository.save(new Member("user4", "password4", "USER"));
    }

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

}
