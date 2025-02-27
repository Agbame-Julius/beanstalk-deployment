package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.Arrays;

@Controller
public class HomeController {
    @GetMapping("/home")
    String home(Model model) {
        model.addAttribute("message", "Welcome to my Web!!");
        model.addAttribute("users", Arrays.asList(
                new User("Julius","Agbame", "Backend", "Takoradi"),
                new User("Mola", "Kporxah", "DevOp", "Accra"),
                new User("Bernard", "Essilfie", "Backend", "Takoradi"),
                new User("Charles", "Akasoma", "Quality Assurance", "Accra"),
                new User("Kweku", "Boateng", "Data Engineer", "Kumasi"),
                new User("Edem ", "Stephens", "UI/UX", "Takoradi")
        ));
        return "home";
    }
}
