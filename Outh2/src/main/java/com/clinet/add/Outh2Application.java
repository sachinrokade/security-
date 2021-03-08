package com.clinet.add;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
public class Outh2Application {

	public static void main(String[] args) {
		SpringApplication.run(Outh2Application.class, args);
	}

	
}


@RestController
class Test{
    
    @GetMapping("/")
    public String test() {
	return "Git hub auth is done";
    }
}