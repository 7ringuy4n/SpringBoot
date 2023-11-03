package com.trinm.project2.controller;

import com.trinm.project2.dto.UserDtoForLogin;
import com.trinm.project2.entity.User;
import com.trinm.project2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/3/2023, Fri
 **/

@Controller
public class UserController {

    @Autowired
    private UserService userService;
//
//    @Autowired
//    private HobbiesService hobbiesService;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new UserDtoForLogin());
        return "login";
    }

//    @PostMapping("/login")
//    public String processLogin(@ModelAttribute("user") @Valid UserDtoForLogin userDtoForLogin, BindingResult bindingResult, HttpServletRequest request) {
//        if (bindingResult.hasErrors()) {
//            return "login";
//        } else {
//            User user = userService.getByUserName(userDtoForLogin.getUserName(), userDtoForLogin.getPassword());
//            if (user != null) {
//                request.getSession().setAttribute("user", user);
//                return "redirect:/admin/home";
//            } else {
//                bindingResult.rejectValue("userName", "error.userModel", "Username or password does not exist");
//                return "login";
//            }
//        }
//    }
}
