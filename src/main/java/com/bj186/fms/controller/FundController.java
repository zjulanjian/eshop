package com.bj186.fms.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bj186.fms.pojo.Fund;
import com.bj186.fms.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value={"/fund"}, method = {RequestMethod.POST,RequestMethod.GET})
public class FundController {

    @Autowired
    private FundService fundService;

    //查看所有基金
    @RequestMapping("/showallfunds")
    public String selectAllFunds() {
        List<Fund> fundList = fundService.selectAll();
        System.out.println("fundList: " + fundList.toString());
        return JSON.toJSONString(fundList);
    }

    //查看一页基金
    @ResponseBody
    @RequestMapping("/showfundsbypage/{page}/{limit}")
    public ModelAndView selectFundsByPage(@PathVariable("page") int page,@PathVariable int limit) {
        System.out.println("我在这里: /showfundsbypage/page/limit");
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        map.put("limit",limit);
        List<JSONObject> fundList = fundService.selectFundsByPage(map);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:http://localhost:8080/fms/html/fund-product.html");
        modelAndView.addObject("fundList",fundList);
        return modelAndView;
    }

    //查看一页基金2
    @RequestMapping("/showfundsbypage")
    public void selectFundsByPage2(HttpServletRequest request, HttpServletResponse response) {

          Map<String,Object> map = new HashMap<>();
          int limit = Integer.parseInt(request.getParameter("limit"));
          int page = (Integer.parseInt(request.getParameter("page")) - 1) * limit;
          map.put("page", page);
          map.put("limit", limit);

        Map jsonMap=new HashMap<>();
        jsonMap.put("code",0);
        jsonMap.put("count",1000);
        jsonMap.put("msg","hello world");
        jsonMap.put("data",fundService.selectFundsByPage(map));

        try {
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(JSON.toJSONString(jsonMap));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/")
    public String redirect() {
        return "redirect:http://localhost:8080/fms/html/fund-product.html";
    }

    @RequestMapping(value = "/test",method = {RequestMethod.GET,RequestMethod.POST})
    public String test() {
        System.out.println("hello world");
        return "redirect: WEB-INF/jsp/index.jsp";
    }
}
