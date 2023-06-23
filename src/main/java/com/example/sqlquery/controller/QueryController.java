package com.example.sqlquery.controller;

import cn.hutool.core.map.MapUtil;
import com.example.sqlquery.common.Result;
import com.example.sqlquery.domain.User;
import com.example.sqlquery.dto.SqlQuery;
import com.example.sqlquery.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 诉衷情の麻雀
 * @Description: TODO
 * @DateTime: 2023/6/23 14:14
 **/

@RestController
@CrossOrigin
@RequestMapping(("/query"))
public class QueryController {
    @Autowired
    UserService userService;

    @PostMapping("/test")
    public Result addQuery(@RequestBody SqlQuery sqlQuery) {
        List<User> list = userService.selectBySql(sqlQuery.getSql());
        return Result.success(MapUtil.builder().put("list", list).put("sql", sqlQuery).map()); //链式调用
    }


    @GetMapping("/test/{sql}")
    public Result test(@PathVariable("sql") String sql){
        User byId = userService.getById(1);
        sql = "id=1 or 1=1";
        List<User> list = userService.selectBySql(sql);
        return Result.success(MapUtil.builder().put("list", list).put("byId", byId).put("sql", sql).map());
    }
}
