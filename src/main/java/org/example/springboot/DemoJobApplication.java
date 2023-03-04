package org.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author bailiang
 */
@SpringBootApplication
@EnableSwagger2
public class DemoJobApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoJobApplication.class, args);
    }
}
