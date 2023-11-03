package com.trinm.project2.controller;

import com.trinm.project2.configure.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/3/2023, Fri
 **/

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "redirect:" + Api.login;
    }

    @GetMapping(value = Api.login)
    public String ping() {
        return "login";
    }

    @GetMapping(value = Api.subpage)
    public String subpage() {
        return "subpage";
    }
}
