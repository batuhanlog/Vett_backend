package dev.patika.VeterinaryManagementSystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("http://localhost:5173","https://veterinary-management.vercel.app/")
                .allowedOrigins("")
                .allowedMethods("GET", "POST", "PUT", "DELETE");
                .allowCredentials(false);
    }
}
