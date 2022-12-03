package project.labcitra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    
    @GetMapping(value="/hello")
    public String home(Model model){
        return("home/home");
    }
}
