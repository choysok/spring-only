package com.page.controller;


import com.page.controller.User.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/param")
public class UserController {

    @RequestMapping("/userParam")
    public String  bindParam(Param param){

        System.out.println(param);
        return "yes";
    }

}
