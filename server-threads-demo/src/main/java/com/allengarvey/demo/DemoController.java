package com.allengarvey.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import java.text.NumberFormat;

@RestController
public class DemoController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/max")
    public String max() {
        return String.format("Max is: %d", DemoService.max);
    }

    @GetMapping("/max/reset")
    public String resetMax() {
        DemoService.max = 0;
        return String.format("Max is: %d", DemoService.max);
    }

    @GetMapping("/max/update")
    public String updateMax(@RequestParam(value = "max", defaultValue = "0") int max) {
        String message = "Max not updated";
        
        if(max > DemoService.max){
            DemoService.calculatedMax = Math.pow(max, 60) / (Math.pow(DemoService.max, 5) + 1) + 4938;
            NumberFormat numberFormat = NumberFormat.getInstance();
            message = String.format("Max updated, it is now: %s", numberFormat.format(max));
            DemoService.max = max;
        }

        return message;
    }
}
