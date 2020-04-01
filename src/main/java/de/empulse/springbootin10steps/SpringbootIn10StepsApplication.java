package de.empulse.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
// add @EnableMongoRepositories annotation and provide the package of the repository.
// THIS IS ABSOLUTELY NECESSARY!!
@SpringBootApplication
@EnableMongoRepositories("de.empulse.springbootin10steps.repository")
@ComponentScan("de.empulse.springbootin10steps.*")
public class SpringbootIn10StepsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootIn10StepsApplication.class, args);
    }
}
