package com.example.bookprojec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    @GetMapping("/")
    public String home(Model model){
        return "members/home";
    }

}
