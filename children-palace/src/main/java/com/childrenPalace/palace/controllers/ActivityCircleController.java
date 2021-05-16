package com.childrenPalace.palace.controllers;

import com.childrenPalace.palace.servicies.ActivityCircleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ActivityCircleController {
    @Autowired
    private ActivityCircleService activityCircleService;

    @RequestMapping("activityCircle")
    private String getActivityCircle(Model mode) {
        mode.addAttribute("activityCircle", activityCircleService.listAll());
        return "activityCircle";
    }
}
