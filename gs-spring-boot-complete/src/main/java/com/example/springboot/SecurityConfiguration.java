package com.example.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth
			.inMemoryAuthentication()
			.withUser("jagdish")
			.password("password")
			.roles("USER")
			.and()
			.withUser("jagdish2")
			.password("password2")
			.roles("ADMIN");
	}
	
	@Bean
	public PasswordEncoder getEncodedPassword() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
			.authorizeRequests()
			.antMatchers("/admin").hasAnyRole("ADMIN","USER")
			.antMatchers("/user").hasRole("USER")
			.antMatchers("/","static/css","static/js").permitAll()
			.and()
			.formLogin();
	}
}
