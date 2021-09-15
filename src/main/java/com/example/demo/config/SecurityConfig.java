package com.example.demo.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()    //HttpServletRequest를 사용하는 요청들에 대한 접근 제한
            .antMatchers("/**").permitAll()
            .antMatchers("/guest/**").permitAll()  //해당 주소의 요청은 인증없이 접근을 허용하겠다는 의미
            .antMatchers("/manager/**").authenticated()  //나머지 요청들에 대해서는 모두 인증을 받아야 한다는 의미 
            .antMatchers("/admin/**").authenticated();
    }

}
