package avilawebservice.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    //1.  ✅ Devuelve un UserDetailsService, no es void
//    @Bean
//    public UserDetailsService users() {
//        return new InMemoryUserDetailsManager(
//                User.builder()
//                        .username("admin")
//                        .password("{noop}123")
//                        .roles("ADMIN", "USER")
//                     .build(),
//                User.builder()
//                .username("user")
//                .password("{noop}123")
//                .roles("USER")
//                .build()
//                );
//    }
    
    //2.  ✅ Devuelve AuthenticationManager (no es void)
    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception{
        AuthenticationManagerBuilder auth = http.getSharedObject(AuthenticationManagerBuilder.class); 
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("{noop}123")
                .roles("ADMIN", "USER")
                .and()
                .withUser("user")
                .password("{noop}123")
                .roles("USER");
        return auth.build();   // <- Devuelve AuthenticationManager
    }
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .authorizeHttpRequests(auth -> auth
                .requestMatchers("/login")
                    .permitAll()
                .requestMatchers("/editar/**", "/agregar/**", "/eliminar/**")
                    .hasRole("ADMIN")
                .requestMatchers("/")
                    .hasAnyRole("USER", "ADMIN")
                .anyRequest()
                     .authenticated()
                )
                .formLogin(form -> form
                    .loginPage("/login")
                    .permitAll()
                )
                .logout(logout -> logout
                    .permitAll()
                )
                .exceptionHandling(exception -> exception
                     .accessDeniedPage("/errores/403") // Pagina personalizada para 403
                );
        
        return http.build();
    }
    
}