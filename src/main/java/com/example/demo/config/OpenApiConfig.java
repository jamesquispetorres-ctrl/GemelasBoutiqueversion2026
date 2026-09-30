package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI gemelasBoutiqueOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Gemelas Boutique API")
                        .description("API REST para la gestión de Clientes, Empleados, Usuarios y Ventas de Gemelas Boutique.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Gemelas Boutique Support")
                                .email("contacto@gemelasboutique.com"))
                        .license(new License().name("Apache 2.0").url("https://springdoc.org")));
    }
}
