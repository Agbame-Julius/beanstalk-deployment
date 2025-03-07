package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping
public class HomeController {
    @GetMapping("/about")
    public String home(Model model) {
            model.addAttribute("title", "Cristiano Ronaldo - The GOAT");
            model.addAttribute("biography", "Lionel Andrés Messi is an Argentine professional footballer "
                    + "who plays as a forward for Inter Miami and the Argentina national team. "
                    + "Widely regarded as one of the greatest footballers of all time, "
                    + "he has won multiple Ballon d'Or awards and led Argentina to victory in the 2022 FIFA World Cup.");

            // List of achievements as a List of String arrays (no extra class)
            List<String[]> achievements = List.of(
                    new String[]{"2009", "First Ballon d'Or"},
                    new String[]{"2012", "Most goals in a calendar year (91 goals)"},
                    new String[]{"2015", "Fifth Ballon d'Or"},
                    new String[]{"2021", "Seventh Ballon d'Or"},
                    new String[]{"2022", "FIFA World Cup Winner"}
            );

            model.addAttribute("achievements", achievements);
            model.addAttribute("imageUrl", "https://images.app.goo.gl/EkRjp2wD6Uo5rroi9");

            return "index"; // Refers to messi.html in templates folder
    }




}
