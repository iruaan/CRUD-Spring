package com.example.demo.Swagger;


import org.springdoc.core.models.GroupedOpenApi;
import org.springdoc.core.utils.SpringDocUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    GroupedOpenApi customApi() {
        return GroupedOpenApi.builder()
            .group("api")
            .pathsToMatch("/api/**","/alunos","/put")
            .build();
    }

    static {
        SpringDocUtils.getConfig().addRestControllers(SwaggerConfig.class);
    }
}
