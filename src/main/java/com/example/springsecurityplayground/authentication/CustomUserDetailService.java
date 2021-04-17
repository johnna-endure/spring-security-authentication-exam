package com.example.springsecurityplayground.authentication;

import com.example.springsecurityplayground.member.entity.Member;
import com.example.springsecurityplayground.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.springframework.security.crypto.factory.PasswordEncoderFactories.*;

@RequiredArgsConstructor
@Service
public class CustomUserDetailService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Member member = memberRepository.findByName(username)
                .orElseThrow(() -> new UsernameNotFoundException("not found " + username));
        UserDetails userDetails = User.builder()
                .username(member.getName())
                .roles(member.getRole())
                .password(member.getPassword())
                .passwordEncoder(p -> createDelegatingPasswordEncoder().encode(p))
                .build();
        return userDetails;
    }
}
