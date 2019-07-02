package com.bj186.fms.controller;

import com.alibaba.fastjson.JSON;
import com.bj186.fms.entity.PurchasedFunds;
import com.bj186.fms.pojo.Fund;
import com.bj186.fms.pojo.User;
import com.bj186.fms.pojo.UserFundOrder;
import com.bj186.fms.service.FundService;
import com.bj186.fms.service.UserService;
import com.bj186.fms.utils.MD5Creater;
import com.bj186.fms.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FundController {

    @Autowired
    private FundService fundService;
    @Autowired
    private UserService userService;


    /**
     * 查看所有的基金
     * @return 基金列表
     */
    @RequestMapping("/showallfunds")
    public String selectAllFunds() {
        List<Fund> fundList = fundService.selectAll();
        System.out.println("fundList: " + fundList.toString());
        return JSON.toJSONString(fundList);
    }

    /**
     * 通过restful风格来查看一页基金
     * @param page 需要访问的页面编号
     * @param limit 每一页的数量
     * @return 返回基金主页面
     */
    @ResponseBody
    @RequestMapping("/showfundsbypage/{page}/{limit}")
    public ModelAndView selectFundsByPage(@PathVariable("page") int page,@PathVariable int limit) {
        System.out.println("我在这里: /showfundsbypage/page/limit");
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        map.put("limit",limit);
        List<Fund> fundList = fundService.selectFundsByPage(map);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:http://localhost:8080/html/fund-product.html");
        modelAndView.addObject("fundList",fundList);
        return modelAndView;
    }

    /**
     * 查看一页基金
     * @param request http请求
     * @param response http响应
     */
    @RequestMapping("/showfundsbypage")
    public void selectFundsByPage2(HttpServletRequest request, HttpServletResponse response) {      Map<String,Object> map = new HashMap<>();
        int limit = Integer.parseInt(request.getParameter("limit"));
        int page = (Integer.parseInt(request.getParameter("page")) - 1) * limit;
        map.put("page", page);
        map.put("limit", limit);

        //进行Date转换
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Fund> fundList= fundService.selectFundsByPage(map);
        for (int i = 0; i < fundList.size() ; i++) {
            fundList.get(i).setCreateTime(sdf.format(TimeUtil.StringToDate(fundList.get(i).getCreateTime())));
        }
        //设置返回前端的数据
        Map<String,Object> jsonMap = new HashMap<>();
        jsonMap.put("code",0);
        jsonMap.put("count",fundList.size());
        jsonMap.put("msg","数据返回成功");
        jsonMap.put("data",fundList);
        try {
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(JSON.toJSONString(jsonMap));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 查看一页基金
     * @param request http请求
     * @param response http响应
     */
    @RequestMapping("/showPurchasedFundsbypage")
    public void selectPurchasedFundsByPage(HttpServletRequest request, HttpServletResponse response) {
        Map<String,Object> paramMap = new HashMap<>();
        int limit = Integer.parseInt(request.getParameter("limit"));
        int page = (Integer.parseInt(request.getParameter("page")) - 1) * limit;
        paramMap.put("page", page);
        paramMap.put("limit", limit);
        paramMap.put("userID",1);
        //获取所有的已购买的基金订单
        List<PurchasedFunds> purchasedFundsList = fundService.selectPurchasedFundsByPage(paramMap);
        //为数据设置购买基金的用户名称
        String userName = userService.selectUserNameByID(1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //设置用户名并进行时间转换
        for (int i = 0; i < purchasedFundsList.size() ; i++) {
            purchasedFundsList.get(i).setUserName(userName);
            purchasedFundsList.get(i).setCreateTime(sdf.format(TimeUtil.StringToDate(purchasedFundsList.get(i).getCreateTime())));
        }
        //保存返回值的map
        Map<String,Object> jsonMap = new HashMap<>();
        jsonMap.put("code",0);
        jsonMap.put("count",purchasedFundsList.size());
        jsonMap.put("msg","获取已购买的基金数据成功");
        jsonMap.put("data",purchasedFundsList);
        try {
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(JSON.toJSONString(jsonMap));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 进入基金主页面
     * @return 返回基金主页面地址
     */
    @RequestMapping("/")
    public String redirect() {
        return "redirect:http://localhost:8080/html/fund-product.html";
    }


    /**
     * 处理页面跳转, 跳转到购买页面
     * @param fundID 基金编号
     * @param map 数据map
     * @return 返回json数据
     */

    @RequestMapping(value="/toHtml",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String getPaymentUrl(Integer fundID, ModelMap map) {
        System.out.println("\nI am here in getPaymentUrl()!\n");
        map.put("fundID",fundID);
        map.put("code",200);
        map.put("msg","页面跳转成功");
        map.put("url","http://localhost:8081/html/fund-purchase.html");
        return JSON.toJSONString(map);
    }

    /**
     * 查询单个基金信息
     * @return
     */
    @RequestMapping(value = "/fund-payment",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> fundPurchase(Integer fundID) {
        Fund fund = fundService.selectFundByID(fundID);
        Map<String,Object> map = new HashMap<>();
        map.put("fundID",fundID);
        map.put("fundName",fund.getFundName());
        map.put("fundInfo",fund.getFundType());
        map.put("feesRate",fund.getFeesRate());
        map.put("code",200);
        map.put("msg","进入基金购买页面");
        map.put("url","http://localhost:8081/html/fund-purchase.html");
        return map;
    }

    /**
     * 查询单个基金信息
     * @return
     */
    @RequestMapping(value = "/fund-payment2",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> fundSale(Integer fundID) {
        Fund fund = fundService.selectFundByID(fundID);
        Map<String,Object> map = new HashMap<>();
        map.put("fundID",fundID);
        map.put("fundName",fund.getFundName());
        map.put("fundInfo",fund.getFundType());
        map.put("feesRate",fund.getFeesRate());
        map.put("code",200);
        map.put("msg","进入基金购买页面");
        map.put("url","http://localhost:8081/html/fund-sale2.html");
        return map;
    }

    /**
     * 提交购买订单
     * @param fundID 基金编号
     * @param jsonStr 前端传过来的数据
     * @return 返回Json数据
     */
    @RequestMapping(value = "/fund-commit",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> fundPurchaseCommit(Integer fundID,String jsonStr) {
        //保存返回数据的map
        Map<String,Object> map = new HashMap<>();
        //保存参数的map
        Map<String,Object> paramMap = new HashMap<>();
        //获取前端传递过来的数据
        Map maps = (Map)JSON.parse(jsonStr);
        System.out.println("jsonStr" + jsonStr);
        paramMap.put("userID",1);
        paramMap.put("fundID",fundID);
        paramMap.put("amount",maps.get("number"));
        paramMap.put("fees",maps.get("fees"));
        //向数据库中插入一条订单
        fundService.insertUserFundOrder(paramMap);

        int fundOrderID = fundService.selectOrderByUserID(1);
        //并把将要跳转的页面返回给前端,进行跳转
        map.put("url","http://localhost:8081/html/fund-purchase2.html");
        map.put("number",maps.get("number"));
        map.put("fees",maps.get("fees"));
        map.put("fundID",fundID);
        map.put("code",0);
        map.put("msg","数据加载成功!");
        map.put("count",2);
        map.put("fundOrderID",fundOrderID);
        return map;
    }

    /**
     * 支付基金订单
     * @param fundOrderID 基金订单编号
     * @return Json数据
     */
    @RequestMapping(value = "/fund-commit2",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> fundPayOrder(Integer fundOrderID) {
        UserFundOrder userFundOrder = fundService.selectFundOrderByID(fundOrderID);
        //保存返回数据的map
        Map<String,Object> map = new HashMap<>();
        List<UserFundOrder> orderList = new ArrayList<>();
        orderList.add(userFundOrder);
        map.put("data",orderList);
        map.put("code",0);
        map.put("msg","订单数据加载成功!");
        map.put("count",1);
        return map;
    }

    /**
     * 执行基金购买交易的具体操作
     * @param userID 用户编号
     * @param transactionPassword 交易密码
     * @param fundOrderID 基金的订单编号
     * @return 返回json数据
     */
    @RequestMapping(value = "/fund-commit3",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> fundPayOrderCommit(Integer userID, @RequestParam String transactionPassword, @RequestParam Integer fundOrderID) {
        Map<String,Object> map = new HashMap<>();
        String encrptTransactionPassword = MD5Creater.getMd5(transactionPassword);
        String databaseUserPassword = MD5Creater.getMd5(userService.selectTransactionPassword(userID));

        if(databaseUserPassword.equals(encrptTransactionPassword)) {
            //获取用户余额
            User user = userService.selectUserByID(userID);
            double balance = user.getBalance();
            //获取订单金额
            UserFundOrder userFundOrder = fundService.selectFundOrderByID(fundOrderID);
            double amount = userFundOrder.getAmount();
            double fees = userFundOrder.getFees();
            //进行交易
            if(balance > amount && userFundOrder.getStatus()==0) {
                balance -= amount;
                balance -= fees;
                user.setBalance(balance);
                userService.updateUser(user);
                userFundOrder.setStatus(1); //交易后,订单设为失效
                fundService.updateFundOrder(userFundOrder);
            } else {
               map.put("msg","余额不足,请重试");
               map.put("code", -1);
            }
            map.put("code",200);
            map.put("msg","交易密码验证成功!");
            map.put("url","http://localhost:8081/html/fund-purchase3.html");
        } else {
            map.put("code", -1);
            map.put("msg","交易密码错误,请重试");
            map.put("url","http://localhost:8081/html/error-500.html");
        }
        return map;
    }

    /**
     * 提交出售订单
     * @param fundID 基金编号
     * @param jsonStr 前端传过来的数据
     * @return 返回Json数据
     */
    @RequestMapping(value = "/fund-sale-commit",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> fundSaleCommit(Integer fundID,String jsonStr) {
        //保存返回数据的map
        Map<String,Object> map = new HashMap<>();
        //保存参数的map
        Map<String,Object> paramMap = new HashMap<>();
        //获取前端传递过来的数据
        Map maps = (Map)JSON.parse(jsonStr);
        System.out.println("jsonStr" + jsonStr);
        paramMap.put("userID",1);
        paramMap.put("fundID",fundID);
        paramMap.put("amount",maps.get("number"));
        paramMap.put("fees",maps.get("fees"));
        //向数据库中插入一条订单
        fundService.insertUserFundOrder(paramMap);

        int fundOrderID = fundService.selectOrderByUserID(1);
        //并把将要跳转的页面返回给前端,进行跳转
        map.put("url","http://localhost:8081/html/fund-sale3.html");
        map.put("number",maps.get("number"));
        map.put("fees",maps.get("fees"));
        map.put("fundID",fundID);
        map.put("code",0);
        map.put("msg","数据加载成功!");
        map.put("count",2);
        map.put("fundOrderID",fundOrderID);
        return map;
    }

    /**
     * 执行基金售出交易的具体操作
     * @param userID 用户编号
     * @param transactionPassword 交易密码
     * @param fundOrderID 基金的订单编号
     * @return 返回json数据
     */
    @RequestMapping(value = "/fund-sale-commit2",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> fundSalePayOrderCommit(Integer userID, @RequestParam String transactionPassword, @RequestParam Integer fundOrderID) {
        Map<String,Object> map = new HashMap<>();
        String encrptTransactionPassword = MD5Creater.getMd5(transactionPassword);
        String databaseUserPassword = MD5Creater.getMd5(userService.selectTransactionPassword(userID));

        if(databaseUserPassword.equals(encrptTransactionPassword)) {
            //获取用户余额
            User user = userService.selectUserByID(userID);
            double balance = user.getBalance();
            //获取订单金额
            UserFundOrder userFundOrder = fundService.selectFundOrderByID(fundOrderID);
            double amount = userFundOrder.getAmount();
            double fees = userFundOrder.getFees();
            //进行交易
            if(balance > amount && userFundOrder.getStatus()==0) {
                balance += amount;
                balance -= fees;
                user.setBalance(balance);
                userService.updateUser(user);
                userFundOrder.setStatus(1); //交易后,订单设为失效
                fundService.updateFundOrder(userFundOrder);
            } else {
                map.put("code", -1);
            }
            map.put("code",200);
            map.put("msg","交易密码验证成功!");
            map.put("url","http://localhost:8081/html/fund-purchase3.html");
        } else {
            map.put("code", -1);
            map.put("msg","交易密码错误,请重试");
            map.put("url","http://localhost:8081/html/error-500.html");
        }
        return map;
    }
}
