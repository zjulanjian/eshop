package com.bj186.fms.controller;

import com.alibaba.fastjson.JSON;
import com.bj186.fms.pojo.Fund;
import com.bj186.fms.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value={"/fund"}, method = {RequestMethod.POST,RequestMethod.GET})
public class FundController {

    @Autowired
    private FundService fundService;

    @PostMapping("/showAllFunds")
    public String selectAllFunds() {
        List<Fund> fundList = fundService.selectAll();
        System.out.println("fundList: " + fundList.toString());
        return JSON.toJSONString(fundList);
    }

    @RequestMapping(value = "/test",method = {RequestMethod.GET,RequestMethod.POST})
    public String test() {
        System.out.println("hello world");
        return "redirect: WEB-INF/jsp/index.jsp";
    }
}
