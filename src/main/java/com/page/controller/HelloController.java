package com.page.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("处理/hello请求，然后跳转到success页面！");
        return "success";
    }

    @RequestMapping("/servletapi")
    public String  servletAPI(HttpServletRequest request, HttpServletResponse response){
        System.out.println("执行了/servletapi请求！");
        System.out.println(request);
        System.out.println(request.getSession());
        System.out.println(request.getSession().getServletContext());
        System.out.println(response);

        return "yes";
    }

}
