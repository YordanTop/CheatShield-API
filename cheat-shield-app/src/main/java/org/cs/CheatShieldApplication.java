package org.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.cs")
public class CheatShieldApplication {
    public static void main(String[] args) {
        SpringApplication.run(CheatShieldApplication.class, args);
    }
}