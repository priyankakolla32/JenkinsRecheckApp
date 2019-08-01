package com.mss.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsRecheckAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsRecheckAppApplication.class, args);
	}
	@GetMapping("/mySample")
	public String myMethod() {
		return "HAI HELLO WELCOME";
	}

}
