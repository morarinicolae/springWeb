package com.childrenPalace.palace.controllers;

import com.childrenPalace.palace.servicies.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SubCategoryController {
    @Autowired
    private SubCategoryService subCategoryService;

    @RequestMapping("subCategory")
    private String getCategory(Model mode) {
        mode.addAttribute("subCategory", subCategoryService.listAll());
        return "subCategory";
    }
}
