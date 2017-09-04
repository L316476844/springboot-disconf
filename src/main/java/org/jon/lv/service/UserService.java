package org.jon.lv.service;

import org.jon.lv.dao.UserMapper;
import org.jon.lv.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Package org.jon.lv.service.UserService
 * @Description: UserService
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/9/4 16:16
 * version V1.0.0
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectByPrimaryKey(Integer id){
       return userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void insert(User user){
        userMapper.insert(user);

        user.setId(null);
        userMapper.insert(user);
    }
}
