package com.ferkan.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ferkan.configuration.GlobalProperties;


@EntityScan(basePackages = {"com.ferkan"})
@ComponentScan(basePackages = {"com.ferkan"})
@EnableJpaRepositories(basePackages = {"com.ferkan"})
@SpringBootApplication
//@PropertySource(value = "classpath:application.properties")
@EnableConfigurationProperties(value = GlobalProperties.class)
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
