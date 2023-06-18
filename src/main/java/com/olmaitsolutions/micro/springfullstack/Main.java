package com.olmaitsolutions.micro.springfullstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: SpringFullStack
 * @Author: Temesgen D.
 * @Date: 6/2/23
 */

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public GreetResponse sayHello() {
        String[] languages = new String[]{"Java", "Python", "Dart"};
        List<String> languages2 = Arrays.asList(languages);

        Person person = new Person("Temesgen");
        return new GreetResponse("Hello", 23, languages2, person, 20_000);
    }
}
