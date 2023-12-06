package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MyBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBackendApplication.class, args);
    }
}

@RestController
@RequestMapping("/api")
class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, this is the backend!";
    }
}
