package com.springmvctest.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        //model.addAttribute("msg", new User().getUsername());
        return "index";
    }
    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }
    @RequestMapping("/logout-success")
    public String logoutPage()
    {
        return "logout";
    }
}
