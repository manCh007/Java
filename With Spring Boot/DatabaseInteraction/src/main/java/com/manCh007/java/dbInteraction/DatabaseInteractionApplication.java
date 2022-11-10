package com.manCh007.java.dbInteraction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.manCh007.java.dbInteraction.repository")
public class DatabaseInteractionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseInteractionApplication.class, args);
	}

}
