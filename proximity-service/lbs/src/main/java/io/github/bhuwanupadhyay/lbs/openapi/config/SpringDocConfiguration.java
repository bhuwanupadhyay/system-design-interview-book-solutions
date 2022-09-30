package io.github.bhuwanupadhyay.lbs.openapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Proximity Service - Location Based Search")
                                .description("Location Based Search [LBS] Service: is used to discover nearby places such as restaurants, hotels, theaters, museums, etc. Example: Yelp or near by me on Google Map ")
                                .version("1.0.0")
                )
        ;
    }
}