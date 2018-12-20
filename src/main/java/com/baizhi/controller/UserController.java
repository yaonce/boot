package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/show")
    public String show(Model model){
        List<User> users = userService.queryAll();
        model.addAttribute("users",users);
        return "show";
    }
    @RequestMapping("/insert")
    @ResponseBody
    public String insert(Model model,User user){
        userService.insert(user);
        return "insert";
    }
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(Model model , User user){
        userService.delete(user);
        return null;
    }
    @RequestMapping("/update")
    @ResponseBody
    public String update(Model model , User user){
        userService.update(user);
        return null;
    }

}
