package com.greatlearning.spring.security.gl.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception{
        SimpleGrantedAuthority userAuthority=new SimpleGrantedAuthority("USER");
        SimpleGrantedAuthority adminAuthority=new SimpleGrantedAuthority("ADMIN");

        List<GrantedAuthority> adminRole=new ArrayList<>();
        adminRole.add(adminAuthority);

        List<GrantedAuthority> userRole=new ArrayList<>();
        userRole.add(userAuthority);

        UserDetails admin1=new User("gaurav",new BCryptPasswordEncoder().encode("gaurav123"),adminRole);
        UserDetails user=new User("gopal",new BCryptPasswordEncoder().encode("gopal123"),userRole);
        UserDetails admin2=new User("akshay",new BCryptPasswordEncoder().encode("akshay123"),adminRole);

        InMemoryUserDetailsManager userDetailsManager=new InMemoryUserDetailsManager();
        userDetailsManager.createUser(admin1);
        userDetailsManager.createUser(admin2);
        userDetailsManager.createUser(user);

        DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(userDetailsManager);
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());

        auth.authenticationProvider(daoAuthenticationProvider);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception{
//          http
//                 .authorizeRequests()
//                  .antMatchers("/products").hasAnyAuthority("USER","ADMIN")
//                  .antMatchers("/products/new","/save").hasAnyAuthority("ADMIN")
//                 .anyRequest()
//                 .authenticated()
//                 .and()
//                 .formLogin()
//                 .loginProcessingUrl("/login")
//                  .successForwardUrl("/products")
//                 .permitAll()
//                 .and()
//                 .logout()
//                 .logoutSuccessUrl("/login")
//                 .permitAll()
//                 .and()
//                  .exceptionHandling().accessDeniedPage("/forbidden")
//                  .and()
//                 .cors().and().csrf().disable();

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
