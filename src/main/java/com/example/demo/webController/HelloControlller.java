package com.example.demo.webController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Hello")
public class HelloControlller {


    /**
     * 测试
     * @param name 姓名
     * @return
     */
    @ResponseBody
    @RequestMapping("/say")
    public String sayHello(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
}
