package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-using-springbootapplication-annotation

 * 
 *  @SpringBootApplication 는 다음 3가지 기능을 포함한다.
  
    -@EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism
	-@ComponentScan: enable @Component scan on the package where the application is located (see the best practices)
    -@Configuration: allow to register extra beans in the context or import additional configuration classes
1. boot project 가능하게
2. 프로젝트 생성시 com.example.*  로 component-scan
3. @Configuraiton 달린 설정 class  로딩, 설정에 사용해 줌 
 * 
 */


@SpringBootApplication
public class Boot01BasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot01BasicApplication.class, args);
		System.out.println("main");
	}

}
