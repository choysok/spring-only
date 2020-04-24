package com.page.controller;


import com.page.controller.User.DateChange;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {


    @RequestMapping("/dateChange")
    public String DateChange(DateChange date){
        System.out.println("执行了/dateChange请求");
        System.out.println(date);
        return "yes";
    }
}
