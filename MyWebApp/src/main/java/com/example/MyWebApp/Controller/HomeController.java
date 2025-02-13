package com.example.MyWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String great(){
         return "Welcome to TCC";
    }
    @RequestMapping("/about")
    public String about()
    {
        return "About TCC";
    }
}
