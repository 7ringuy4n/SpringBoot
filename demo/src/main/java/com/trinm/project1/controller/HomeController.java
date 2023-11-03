package com.trinm.project1.controller;

import com.trinm.project1.configure.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/2/2023, Thu
 **/

@RestController
public class HomeController {

    @GetMapping(value = Api.ping)
    public String ping() {
        return "home.html";
    }
}
