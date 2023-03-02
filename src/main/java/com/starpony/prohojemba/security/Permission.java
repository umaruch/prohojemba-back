package com.starpony.prohojemba.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

public enum Permission {
    PERM_EDIT_TITLES,
    PERM_EDIT_TYPES,
    PERM_EDIT_USERS;

    @Configuration
    @EnableWebSecurity
    public static class SecurityConfiguration {
        @Bean
        public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
            httpSecurity.cors().and().csrf().disable()
                    .authorizeHttpRequests().anyRequest().permitAll();
            return httpSecurity.build();
        }
    }
}
