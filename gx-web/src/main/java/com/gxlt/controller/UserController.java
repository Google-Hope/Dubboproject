package com.gxlt.controller;

import com.gxlt.Interface.UserService;
import com.gxlt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Controller
public class UserController {
    @Autowired
    private UserService UserServiceimpl;
    @RequestMapping("/index")
    public ModelAndView toIndex(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("User");
        List<User> allUsers = UserServiceimpl.findAllUsers();
        modelAndView.addObject("allUsers",allUsers);
        return  modelAndView;
    }

    @RequestMapping("/addUser")
    public String addIndex(User user, HttpServletRequest request, HttpServletResponse response) throws  Exception{
        String id = UUID.randomUUID().toString();
        user.setUserid(id);
        UserServiceimpl.addUser(user);


        return  "redirect:index";
    }
    @RequestMapping("/deUser")
    public  String deleteUser(String userid){
UserServiceimpl.deleUser(userid);

        return  "redirect:index";
    }
    @RequestMapping("/searchByid")
    @ResponseBody
    public User searchByid(String userid){
        System.out.println(userid);
        //根据id查询user
        User user = UserServiceimpl.searchUser(userid);
        System.out.println(user.getEmaill());
        return user;
    }

    @RequestMapping("/changeUser")
    public String changeUser(User user){
        UserServiceimpl.changeUser(user);
        return  "forward:index";
    }
}
