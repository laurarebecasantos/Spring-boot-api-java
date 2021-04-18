package io.github.laurarebecasantos.ProjectSpringBootJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ProjectSpringBootJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSpringBootJavaApplication.class, args);
		System.out.println("Hello world");
	}

}
