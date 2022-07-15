package com.generation.blogpessoal.configuration;

import org.springdoc.core.customizers.OpenApiCustomiser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI springBlogPessoalOpenAPI() {
		return new OpenAPI()
				.info(new Info()
					.title("CarnaBlog")
					.description("Projeto de Blog sobre o Carnaval - Generation Brasil")
					.version("v0.0.1")
				.license(new License()
						.name("Diego Candido")
						.url("https://www.linkedin.com/in/ogeidc/"))
				.contact(new Contact()
						.name("Diego Candido")
						.url("https://github.com/ogeidc")
						.email("ogeid.csilva@gmail.com")))
				.externalDocs(new ExternalDocumentation()
						.description("Github")
						.url("https://github.com/ogeidc/BlogPessoal"));
	}
	@Bean
	public OpenApiCustomiser customiserGlobalHeaderOpenApiCustomiser() {
		return openApi -> {
			openApi.getPaths().values().forEach(pathItem -> pathItem.readOperations().forEach(operation -> {
				
				ApiResponses apiResponses = operation.getResponses();
				
				apiResponses.addApiResponse("200", createApiResponse
						("Sucesso!"));
				apiResponses.addApiResponse("201", createApiResponse
						("Objeto Persistido"));
				apiResponses.addApiResponse("204", createApiResponse
						("Objeto Excluido"));
				apiResponses.addApiResponse("400", createApiResponse
						("Erro na requisição"));
				apiResponses.addApiResponse("404", createApiResponse
						("Objeto não encontrado"));
				apiResponses.addApiResponse("500", createApiResponse
						("Erro na aplicação"));
			
				
				
			}));
		
		};
	}
	private ApiResponse createApiResponse(String message) {
		return new ApiResponse().description(message);
				}
}
	
		
	
