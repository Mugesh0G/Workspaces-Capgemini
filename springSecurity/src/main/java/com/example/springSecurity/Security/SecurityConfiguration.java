package com.example.springSecurity.Security;

import com.example.springSecurity.Jwt.JwtCustomToken;
import com.example.springSecurity.Jwt.JwtTokenVerifier;
import com.example.springSecurity.Jwt.JwtUsernameAndPasswordAuthenticationFilter;
import com.example.springSecurity.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.crypto.SecretKey;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;
    private final StudentService studentService;

    private final JwtCustomToken jwtCustomToken;
    private final SecretKey secretKey;



    @Autowired
    public SecurityConfiguration(PasswordEncoder passwordEncoder, StudentService studentService, JwtCustomToken jwtCustomToken, SecretKey secretKey) {
        this.passwordEncoder = passwordEncoder;
        this.studentService = studentService;
        this.jwtCustomToken = jwtCustomToken;
        this.secretKey = secretKey;

    }



    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .csrf().disable()

                .authorizeRequests()
                .antMatchers("/","index","/css/*","/js/*")
                .permitAll()
//                .antMatchers("/students/**").hasRole(ADMIN.name())
//                .antMatchers(HttpMethod.DELETE).hasAuthority(STUDENT_WRITE.getPermission())
//                .antMatchers(HttpMethod.POST).hasAuthority(STUDENT_WRITE.getPermission())
//                .antMatchers(HttpMethod.PUT).hasAuthority(STUDENT_WRITE.getPermission())
//                .antMatchers(HttpMethod.GET).hasAnyRole(STUDENT.name(),ADMIN.name())
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();

                //form type login
             /*   .formLogin()
                .loginPage("/login")
                    .permitAll()
//                .successHandler(new SavedRequestAwareAuthenticationSuccessHandler() {
//                    @Override
//                    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//                        getRedirectStrategy().sendRedirect(request,response,"/default");
//                    }
//                })
//

                    .defaultSuccessUrl("/default",true)


                    .and()
                //remember-me cookies
                .rememberMe()
                    .tokenValiditySeconds((int) TimeUnit.DAYS.toSeconds(10))
                    .key("hello")
                .and()

                //logout and clearing cookies
                .logout()
                    .logoutUrl("/logout")
                    .clearAuthentication(true)
                    .invalidateHttpSession(true)
                    .deleteCookies("JSESSIONID","remember-me")
                    .logoutSuccessUrl("/login")
                .and()
                .httpBasic();*/

//        http .addFilter(new JwtUsernameAndPasswordAuthenticationFilter(authenticationManager(), jwtCustomToken, secretKey))
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//                //.addFilterAfter(new JwtTokenVerifier(jwtCustomToken, secretKey), UsernamePasswordAuthenticationFilter.class);

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(daoAuthenticationProvider());
    }


    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setPasswordEncoder(passwordEncoder);
        provider.setUserDetailsService(studentService);
        return provider;
    }


//    @Override
//    @Bean
//    protected UserDetailsService userDetailsService() {
//        UserDetails admin = User.builder()
//                .username("Mugesh")
//                .password(passwordEncoder.encode("password"))
////                .roles(ADMIN.name())
//                .authorities(ADMIN.getGrantedAuthority())
//                .build();
//
//        UserDetails student = User.builder()
//                .username("Deenadhayalan")
//                .password(passwordEncoder.encode("password22"))
////                .roles(STUDENT.name())
//                .authorities(STUDENT.getGrantedAuthority())
//                .build();
//
//        return new InMemoryUserDetailsManager(admin,student);
//    }
}
