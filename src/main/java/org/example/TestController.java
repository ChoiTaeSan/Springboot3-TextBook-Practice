package org.example;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {
    @GetMapping("/test")
    public String test(){
        return "Hello World!";
    }
}
