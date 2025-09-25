//package com.project.Medical.Security;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfiguration 
//{
//	@Bean
//    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception 
//	{
//		http.authorizeHttpRequests(requests->requests.requestMatchers("/savePatient","deletePatient","/updatePatient").authenticated()
//				.requestMatchers("/getPatient/{id}","/getAllPatients").permitAll());
//		http.formLogin(withDefaults());
//		http.httpBasic(withDefaults());
//				return http.build();
//	}
//}
