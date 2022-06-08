package org.spring.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("virat").password(bCryptPasswordEncoder.encode("100100s")).roles("admin")
//		.and()
//		.withUser("pant").password(bCryptPasswordEncoder.encode("12345")).roles("user");
		
//		Load data from db to authenticate
		
		
		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(bCryptPasswordEncoder);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
//		.antMatchers("/main","/admin")
//		.authenticated()
//		.antMatchers("/main","/user").access("ha")
//		.authenticated()
//		.antMatchers("/bye")
		.antMatchers("/user" ,"/main").hasAuthority("USER")
		.antMatchers("/admin", "/main").hasAuthority("ADMIN")
		.and()
		.formLogin().loginPage("/login1").permitAll()
		.and().logout()
		.and().exceptionHandling().accessDeniedPage("/accessDenied"); 
	}
//	@Bean
//	PasswordEncoder getpassEncoder() {
//		//return NoOpPasswordEncoder.getInstance();
//		return new BCryptPasswordEncoder();
//	}
}
