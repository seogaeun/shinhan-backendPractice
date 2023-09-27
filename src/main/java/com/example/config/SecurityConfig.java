package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    // 필터체인으로 request 가로챔. 그 정보 받아옴. 기본적으로 제공하는 login form을 쓰겠다. 칼럼명을 디폴트값은 usernamed으로 table 만들어줘여함.
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.
                csrf().disable()
                .formLogin()
                .defaultSuccessUrl("/home")
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login");


        return httpSecurity
                .authorizeRequests(auth ->
                        auth.antMatchers("/api/v1/user/join", "/login").permitAll()
                                .antMatchers("/admin").hasRole("ADMIN")
                                .antMatchers("/manager").access("hasRole('ADMIN') or hasRole('MANAGER')")
                                .anyRequest().authenticated()
                        )
                .build();
    }

    // Bean으로 받아서 사용하겠다.
    @Bean
    public PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

}