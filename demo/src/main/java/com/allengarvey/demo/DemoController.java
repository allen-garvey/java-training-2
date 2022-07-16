package com.allengarvey.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DemoController {
    static int max = 0;

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/max")
    public String max() {
        return String.format("Max is: %d", max);
    }

    @GetMapping("/max/update")
    public String updateMax(@RequestParam(value = "max", defaultValue = "0") int max) {
        if(max > DemoController.max){
            DemoController.max = max;
        }

        return "Max updated";
    }
}
