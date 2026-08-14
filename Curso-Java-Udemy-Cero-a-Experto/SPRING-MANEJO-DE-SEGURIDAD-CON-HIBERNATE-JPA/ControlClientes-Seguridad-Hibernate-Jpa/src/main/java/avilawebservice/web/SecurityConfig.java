package avilawebservice.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                .requestMatchers("/login").permitAll()
                .requestMatchers("/editar/**", "/agregar/**", "/eliminar/**").hasRole("ADMIN")
                .requestMatchers("/").hasAnyRole("USER", "ADMIN")
                .anyRequest().authenticated()
                )
                .formLogin(form -> form
                    .loginPage("/login")
                     .failureUrl("/login?error=true")
                    .permitAll()
                )
                .logout(logout -> logout.permitAll()
                )
                .exceptionHandling(exception -> exception
                    .accessDeniedPage("/errores/403") // Pagina personalizada para 403
                );

        return http.build();
    }

}
