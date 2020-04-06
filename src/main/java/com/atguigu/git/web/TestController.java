package com.atguigu.git.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("show")
    public Object show() {
        return "show";
    }
}
