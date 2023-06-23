package com.example.sqlquery.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sqlquery.domain.User;
import com.example.sqlquery.service.UserService;
import com.example.sqlquery.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 27837
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-06-23 14:04:53
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> selectBySql(String sql) {
        return userMapper.selectBySql(sql);
    }

}




