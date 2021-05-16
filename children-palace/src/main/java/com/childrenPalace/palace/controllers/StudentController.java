package com.childrenPalace.palace.controllers;


import com.childrenPalace.palace.servicies.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("students")
    private String getTeachers(Model mode) {
        mode.addAttribute("students", studentService.listAll());
        return "students";
    }
}
