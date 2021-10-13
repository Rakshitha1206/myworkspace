package com.example.demo.contoller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class WelcomeController {
	  @RequestMapping(value="/",method=RequestMethod.GET)
	    public String init(Model model) {

	        model.addAttribute("majHeading","Sri Jayachamarajendra College of Engineering");
	        return "index";
	    }
}
