package com.childrenPalace.palace.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

    @RequestMapping("")
    public String greeting( Model model) {
        model.addAttribute("title", "Menul principal");
        return "home";
    }
    @RequestMapping("about")
    public String about( Model model) {
        model.addAttribute("title", "Despre noi");
        return "about";
    }

    @RequestMapping("blog")
    public String blog( Model model) {
        model.addAttribute("blog", "Blog");
        return "blog-main";
    }

}