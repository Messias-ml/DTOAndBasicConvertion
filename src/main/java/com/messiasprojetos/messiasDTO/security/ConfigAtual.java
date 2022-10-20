package com.messiasprojetos.messiasDTO.security;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;
/*
@EnableWebSecurity
public class ConfigAtual {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        return getPermicoes(http);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    private DefaultSecurityFilterChain getPermicoes(HttpSecurity http) throws Exception {
        return http
                .csrf()
                .disable()
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/usuarios/buscar").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST,"/clientes").permitAll()
                .antMatchers("/clientes").hasAnyRole("ADMIN", "MANAGER")
                .anyRequest().authenticated().and().build();
    }
}*/
