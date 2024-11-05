package com.interivalle.spring3;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring3Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring3Application.class, args);
	}
     //localhost:8081/doc/swagger-ui/index.html
         @Bean
      public OpenAPI customOpenAPI(){
          return new OpenAPI()
                  .components(new Components())
                  .info(new Info()
                          .title("API InteriValle")
                          .description("documentacion usando SpringDoc-openApi"));
      }

}
