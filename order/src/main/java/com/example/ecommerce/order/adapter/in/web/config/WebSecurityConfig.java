package com.example.ecommerce.order.adapter.in.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    protected void configure(final HttpSecurity http) throws Exception {
        http.csrf()
                .disable();

        http.authorizeRequests()
                .antMatchers("/orders/**")
                .permitAll();

        http.antMatcher("/h2-console/**")
                .headers()
                .frameOptions()
                .disable();
    }
}