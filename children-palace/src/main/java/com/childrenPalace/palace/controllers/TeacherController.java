package com.childrenPalace.palace.controllers;


import com.childrenPalace.palace.servicies.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("teachers")
    public String getTeachers(Model model) {
        model.addAttribute("teachers", teacherService.listAll());

        return "teachers";
    }
}
