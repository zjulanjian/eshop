package com.bj186.crm.controller;

import com.bj186.crm.exception.CustomException;
import com.bj186.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.bj186.crm.pojo.User;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")    // http://localhost:8080/user user就会找到注解中标注为/user的controller类
@SessionAttributes(value={"sessionName"},types={String.class})
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login") // http://localhost:8080/user/login login就去找到对应的/login对应的方法
    public String login() {
        System.out.println("Hello World!");
        return "/user/login.jsp";
    }

    @RequestMapping("/userList")
    public ModelAndView getUserList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList",findAll());
        modelAndView.setViewName("/user/userList.jsp");
        return modelAndView;
    }

    public List<User> findAll() {
        List<User> userList = new ArrayList();
        User user = new User();
        user.setUserName("艾格尼丝");
        user.setUserId(3);
        userList.add(user);
        return userList;
    }

    @RequestMapping("/user")
    public ModelAndView getUserById() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",userService.selectUserById(1));
        System.out.println("user" + userService.selectUserById(2));
        modelAndView.setViewName("/user/user.jsp");
        return modelAndView;
    }

//    通过ModelAttribute来向前端传值,优先级很高
    @ModelAttribute("girl")
    public User getUser() {
        User user = new User();
        user.setUserName("艾格尼丝");
        user.setUserGender("女");
        return user;
    }

//    使用session向前端传值
    @RequestMapping("/user2")
    public String login(ModelMap modelMap) {
        modelMap.put("sessionName","admin");
        return "/user/user.jsp";
    }

//    使用Restful接收方式, 用绑定URI模板变量值的方式
    @RequestMapping(value="/query/id/{id}")
    public String login(@PathVariable("id") Integer id) {
        System.out.println("id: " + id);
        return "/user/login.jsp";
    }

    //路径获取请求参数可以设置多个，例如下面的效果：
    @RequestMapping(value = "/query/{id}/{name}")
    public String login(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        System.out.println(id);
        System.out.println(name);
        return "login";  // 默认是转发
    }

    //获取请求参数
    @RequestMapping(value = "/login2")
    public String login(@RequestParam(name = "username", required = true, defaultValue = "admin") String username) {
        System.out.println(username);
        return "login";
    }

    //使用JSON从前端获取数据
    @RequestMapping(value = "/login3")
    public String login(@RequestBody User user) {
        System.out.println(user.getUserName());
        System.out.println(user.getUserGender());
        return "/user/user.jsp";
    }

    @RequestMapping("/html")
    public String toHTML(User user){
        return "redirect:/statics/html/hello.html";
    }

    @RequestMapping("/ajax")
    @ResponseBody
    public List<User> ajax(@RequestBody User user) throws CustomException {
        System.out.println(user);
        // 利用异常,改写操作
        if(user.getUserName().equals("")){
            throw new CustomException("用户名不能为空");
        }else{
            user.setUserAddress("123456789");
            user.setUserGender("女");
            List<User> users = new ArrayList<>();
            users.add(user);
            return users;
        }
    }
}
