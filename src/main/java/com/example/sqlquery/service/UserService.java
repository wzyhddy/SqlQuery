package com.example.sqlquery.service;

import com.example.sqlquery.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 27837
* @description 针对表【user】的数据库操作Service
* @createDate 2023-06-23 14:04:53
*/
public interface UserService extends IService<User> {

    List<User> selectBySql(String sql);
}
