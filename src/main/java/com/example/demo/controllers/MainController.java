package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/main")
public class MainController {

    @GetMapping("/index")
    public String doSomething() {
        return  "index";
    }

    @GetMapping("/hello/{name}")
    public String helloRequest(Model model, @PathVariable(value = "name") String name) {
        model.addAttribute("name", name);
        return  "hello";
    }
}
