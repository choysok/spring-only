package com.page.controller;

import com.page.controller.User.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/annot")
@SessionAttributes({"msg","User"}) //此注解只能用在类中。把msg=张三，放入到SessionScope中
public class AnnotController {

    @RequestMapping("/testAnnotParam")
    public String testAnnotParam(@RequestParam(name = "username") String name){
        System.out.println("执行了/nannot/testAnnotParam请求！");
        System.out.println(name);

        return "yes";
    }


    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody  String body){
        System.out.println("执行了/nannot/testAnnotParam请求！");
        System.out.println(body);

        return "yes";
    }

    @RequestMapping("/testPathVariable")
    public String testPathVariable(){
        System.out.println("执行了/annot/testPathVariable请求！");
        System.out.println("查询出所有信息！");

        return "yes";
    }

    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariableid(@PathVariable(name="id") String id) {
        System.out.println("执行了/annot/testPathVariable/{id}请求！");
        System.out.println(id);


        return "pathvariable";
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(name = "Referer")  String header){
        System.out.println("执行了/annot/testRequestHeader请求！");
        System.out.println("Referer为："+header);

        return "yes";
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(name = "JSESSIONID") String cookieValue){
        System.out.println("执行了/annot/testRequestHeader请求！");
        System.out.println("JSESSIONID为："+cookieValue);

        return "yes";
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user){
        System.out.println("执行了/annot/testModelAttribute请求！");
        System.out.println(user);

        return "yes";
    }


    /*
        该方法会 优先 执行

    @ModelAttribute
    public  User  ModelAttribute(Integer age){
     System.out.println("该方法会 优先 执行!!!!");
     User user = new User();
     user.setAge(age);
     user.setMoney(200.00);
     System.out.println(user);
     return user;
    }
 */
    @RequestMapping("/testSessionAttribute")
    public String testSessionAttribute(Model model){
        System.out.println("执行了/annot/testSessionAttribute请求！");
       //会存储到RequestScope中
        model.addAttribute("msg","张三");
        model.addAttribute("User","用户");
        System.out.println(model);

        return "yes";
    }

  /*
  从SessionScope中取值
   */
    @RequestMapping("/GetSessionAttribute")
    public String GetSessionAttribute(ModelMap model){
        System.out.println("执行了/annot/GetSessionAttribute请求！");
        model.get("msg");
        System.out.println( model.get("msg"));
       return "yes";
    }

         /*
          删除SessionAttribute
          */

    @RequestMapping("/DelSessionAttribute")
    public String DelSessionAttribute(SessionStatus sessionStatus){
        System.out.println("执行了/annot/DelSessionAttribute请求！");
        sessionStatus.setComplete();

        return "yes";
    }


}
