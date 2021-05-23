package com.example.demo.controllers;

import com.example.demo.entities.ItemProjection;
import com.example.demo.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/main")
public class MainController {

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/index")
    public String doSomething() {
        List<ItemProjection> itemProjections = itemRepository.findItemProjectionsByCost(50);
        System.out.println(itemProjections);
        return  "index";
    }

    @GetMapping("/hello/{name}")
    public String helloRequest(Model model, @PathVariable(value = "name") String name) {
        model.addAttribute("name", name);
        return  "hello";
    }
}
