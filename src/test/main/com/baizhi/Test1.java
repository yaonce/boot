package com.baizhi;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.baizhi.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Hashtable;
import java.util.List;

public class Test1 {
//    @Autowired
//    private UserService userService;
    @Test
    public void test1(){
        UserServiceImpl userService = new UserServiceImpl();

        List<User> users = userService.queryAll();
        System.out.println(users);
    }
    @Test
    public void test2(){
        String s1 = "a";
        String s2 = s1 + "b";
        String s3 = "a" + "b";
        System.out.println(s2 .equals( "ab"));
        System.out.println(s3 == "ab");
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.clone();
    }
}
