package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/showMyLoginPage")
    public String showMyLoginPage(){

        return "fancylogin";
    }
}
