package com.amoelcodigo.springbootmvc.controllers;

import com.amoelcodigo.springbootmvc.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/app")
public class UserController {

    @GetMapping({"/view", "/", "/another"})
    public String view(Model model) {
        model.addAttribute("title", "Welcome");
        model.addAttribute("message", "App using spring boot MVC");
        model.addAttribute("user",
                new User(1L, "Manuel",
                        "Moreno",
                        "manuel.com",
                        "vmanuel", LocalDateTime.now()));
        //Este return tiene que ser el mismo nombre de la plantilla .html
        return "view";
    }

}
