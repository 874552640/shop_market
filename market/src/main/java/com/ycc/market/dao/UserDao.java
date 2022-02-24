package com.ycc.market.dao;

import com.ycc.market.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


public interface UserDao {
    int insertUser(User user);
}
