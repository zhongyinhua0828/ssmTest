package com.mhys.controller;

import com.mhys.model.User;
import com.mhys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/findAll", produces = "application/json;charset=utf-8")
    public ModelAndView findAll() {
        //新建时加页面
        ModelAndView mv = new ModelAndView("/index.jsp");
        List<User> list = userService.findAll();
        //在mv中存list带到页面去
        mv.addObject("list", list);
        return mv;
    }

    @RequestMapping("/findByName")
    public ModelAndView findByName(User user) {
        ModelAndView mv = new ModelAndView("main.jsp");
        List<User> users = userService.findByName(user);//得到数据
        mv.addObject("list", users);
        return mv;
    }

    @RequestMapping("/delById")
    public ModelAndView delById(@RequestParam("id") String id) {
        int count = userService.delById(Integer.parseInt(id));
        if (count > 0) return new ModelAndView("/findByName");
        else return new ModelAndView("/main.jsp");
    }

    @RequestMapping("/findByNames")
    public ModelAndView findByNames(User user) {
        ModelAndView mv = new ModelAndView("main2.jsp");
        List<User> list = userService.findByNames(user);
        mv.addObject("list", list);
        return mv;
    }

    @RequestMapping("/insertUser")
    public ModelAndView insertUser(User user) {
        int count = userService.insertUser(user);
        if (count > 0) {
            System.out.println("成功");
            return new ModelAndView(("redirect:./findByNames"));

        } else {
            System.out.println("失败");
            return new ModelAndView(("/add.jsp"));
        }
    }

    @RequestMapping("/selectByID")
    public ModelAndView selectByID(User user) {
        ModelAndView mv = new ModelAndView("add.jsp");
        User user1 = userService.selectById(user);
        mv.addObject("user", user1);
        return mv;
    }
@RequestMapping("/addOrUpdate")
    public String addOrUpdate(@RequestParam("sid") String sid, User user) {
        //分为两种情况,如果有sid的话就是修改,没有的话就是新增
        if (sid.equals("")) {//新增
            int count = userService.insertUser(user);
            if (count>0){
                return "redirect:./findByNames";
            }else {
                return "add.jsp";
            }
        }else {//修改
            user.setId(Integer.parseInt(sid));
            int i = userService.updateById(user);
            if (i>0){
                return "redirect:./findByNames";
            }else {
                return "add.jsp";
            }
        }
    }

}
