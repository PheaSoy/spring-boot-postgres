package org.soyphea;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class Application {
	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository){
		return args -> {
			log.info("Start printout user.");
			userRepository.findAll().forEach(System.out::println);
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
