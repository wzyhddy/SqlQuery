package com.example.sqlquery.mapper;

import com.example.sqlquery.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author 27837
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-06-23 14:04:53
* @Entity com.example.sqlquery.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> selectBySql(String sql);
}




