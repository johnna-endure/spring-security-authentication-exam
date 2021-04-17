package com.example.springsecurityplayground;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringSecurityPlaygroundApplicationTests {

    @Autowired
    private AuthenticationManagerBuilder builder;

//    @Test
//    void contextLoads() {
//    }

    @Test
    public void isNotNull() {
        assertThat(builder).isNotNull();
    }

    @Test
    public void builderTest() {
    }


}
