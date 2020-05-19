package com.mhys.controller;

import com.mhys.model.User;
import com.mhys.service.GoodsService;
import com.mhys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @RequestMapping(value = "/findAllGoods", produces = "application/json;charset=utf-8")
    public ModelAndView findAllGoods() {
        //新建时加页面
        ModelAndView mv = new ModelAndView("/index.jsp");
        List<User> list =goodsService.findAllGoods();
        //在mv中存list带到页面去
        mv.addObject("list", list);
        return mv;
    }
    @RequestMapping("/delById")
    public ModelAndView delById(@RequestParam("id") String id) {
        int count = goodsService.delByidGoods(Integer.parseInt(id));
        if (count > 0) return new ModelAndView("/goods.jsp");
        else return new ModelAndView("/goods.jsp");
    }

}
