package com.veera.owm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OwmController {

   @RequestMapping("/")
   public String index() {
      return "index";
   }

   @PostMapping("/currentWeather")
   public String sayHello(@RequestParam("city") String city, Model model) {
      model.addAttribute("city", city);
      return "owmReport";
   }
}
