package com.baidu.controller;

import com.baidu.pojo.User;
import com.baidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getuserlist")
    public List<User> getList(){
        List<User> userList=userService.getList();
        return userList;
    }
@RequestMapping("/addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "ok";
    }

//    @RequestMapping(value="/getindex",method = RequestMethod.GET)
//    public ModelAndView select() {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("zzz","hadf");
//        mv.setViewName("aaa");
//        return mv;
//    }
 @RequestMapping(value="/getindex")
    public String select(Model model) {
        model.addAttribute("zzz", "helloff world!!");
        return "aaa";
    }

//    @RequestMapping("/getindex")
//    public ModelAndView getindex() {
//        ModelAndView mv=new ModelAndView();
//        mv.addObject("aaa", "helloff world!!");
//       mv.setViewName("index");
//        return mv;
//    }


}

