package com.example.demo.webController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Hello")
public class HelloControlller {

    @ResponseBody
    @RequestMapping("/say")
    public String sayHello(){
        return "Hello, Daniel!";
    }
}
