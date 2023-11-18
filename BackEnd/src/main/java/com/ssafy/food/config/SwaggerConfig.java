// package com.ssafy.food.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import springfox.documentation.builders.ApiInfoBuilder;
// import springfox.documentation.builders.PathSelectors;
// import springfox.documentation.builders.RequestHandlerSelectors;
// import springfox.documentation.service.ApiInfo;
// import springfox.documentation.spi.DocumentationType;
// import springfox.documentation.spring.web.plugins.Docket;

// //Swagger 설정을 위한 파일
// @Configuration
// public class SwaggerConfig {
// 	@Bean
// 	public Docket api() {
// 		return new Docket(DocumentationType.SWAGGER_2)
// 				.select()
// 				.apis(RequestHandlerSelectors.basePackage("com.ssafy.board.controller"))
// 				.paths(PathSelectors.ant("/api/**")) 
// 				.build()
// 				.apiInfo(apiInfo());
// 	}
	
// 	private ApiInfo apiInfo() {
// 		return new ApiInfoBuilder()
// 				.title("SSAFY 10기 Final 관통 Project")
// 				.description("")
// 				.version("0.1")
// 				.build();
// 	}
// }