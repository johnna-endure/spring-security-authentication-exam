package com.example.springsecurityplayground;

import org.junit.jupiter.api.Test;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

public class TypeTest {
    @Test
    public void compareType() {
        Class<?> aClass = Authentication.class;
        System.out.println(aClass.isInstance(UsernamePasswordAuthenticationToken.class));
        System.out.println(aClass.isAssignableFrom(UsernamePasswordAuthenticationToken.class));
        System.out.println(aClass.isAssignableFrom(Authentication.class));
        System.out.println(aClass.isAssignableFrom(Class.class));
    }
}
