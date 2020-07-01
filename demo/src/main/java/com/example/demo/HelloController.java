package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;


@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/about")
    public String about() {
        return "This is the about page.";
    }

    @RequestMapping("/list")
    public ArrayList<String> list() {
        ArrayList<String> returnList = new ArrayList<String>();

        returnList.add("first");
        returnList.add("second");
        returnList.add("third");
        returnList.add("fourth");

        return returnList;
    }
}
