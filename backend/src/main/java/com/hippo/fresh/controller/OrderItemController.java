package com.hippo.fresh.controller;


import com.alibaba.fastjson.JSONObject;
import com.hippo.fresh.dao.OrderitemRepository;
import com.hippo.fresh.security.config.JWTConfig;
import com.hippo.fresh.security.utils.JWTTokenUtil;
import com.hippo.fresh.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/order")
public class OrderItemController {

    @Autowired
    private OrderitemRepository orderitemRepository;

    //返回用户所有订单中两级目录个数接口
    @PostMapping("/category")
    public ResponseUtils category(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();

        //从token中获取用户id
        String token = request.getHeader(JWTConfig.tokenHeader);
        Long userId = JWTTokenUtil.parseAccessToken(token).getId();

        String []categoryFirsts = {"电子数码","衣帽鞋服","日用品","书籍","食品"};
        String []categorySeconds={"手机","电脑","衣帽","鞋服","日用品","小说","零食","牛肉"};

        Map<String,Object> categoryFirstResult = new HashMap<>();
        Map<String,Object> categorySecondResult = new HashMap<>();
        //一级目录数量
        for(String categoryFirst:categoryFirsts){
            categoryFirstResult.put(categoryFirst,orderitemRepository.countCategoryFirst(userId,categoryFirst));
        }
        //二级目录数量
        for(String categorySecond:categorySeconds){
            categorySecondResult.put(categorySecond,orderitemRepository.countCategorySecond(userId,categorySecond));
        }

        jsonObject.put("categoryFirst",categoryFirstResult);
        jsonObject.put("categorySecond",categorySecondResult);
            return ResponseUtils.response(200, "用户订单商品目录数量统计成功", jsonObject);
    }


}
