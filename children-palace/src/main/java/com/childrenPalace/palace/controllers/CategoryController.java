package com.childrenPalace.palace.controllers;

import com.childrenPalace.palace.servicies.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("category")
    private String getCategory(Model mode) {
        mode.addAttribute("category", categoryService.listAll());
        return "category";
    }

}
