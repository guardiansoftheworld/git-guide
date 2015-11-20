package com.git.guide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitGuideApplication {
private static String welcomeStr="welcome to git training !";
    public static void main(String[] args) {
        SpringApplication.run(GitGuideApplication.class, args);
        System.out.println("Any one there ?!");
    }

    public void myNewMethod() {

    }
}
