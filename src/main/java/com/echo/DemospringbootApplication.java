package com.echo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemospringbootApplication {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

	public static void main(String[] args) {
		SpringApplication.run(DemospringbootApplication.class, args);
	}
}