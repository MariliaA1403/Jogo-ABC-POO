package br.unicap.si.poo.project.demo.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    
    @Bean
    public OpenAPI myOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API do Projeto de POO")
                        .version("1.0")
                        .description("Documentação gerada automaticamente com Springdoc Swagger.")
                );
    }
}
