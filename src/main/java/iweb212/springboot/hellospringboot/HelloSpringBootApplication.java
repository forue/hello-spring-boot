package iweb212.springboot.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "iweb212.springboot.controller")
public class HelloSpringBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(HelloSpringBootApplication.class, args);
    }

}
