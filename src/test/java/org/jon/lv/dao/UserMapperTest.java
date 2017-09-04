package org.jon.lv.dao;

import org.jon.lv.DisconfApplicationTest;
import org.jon.lv.domain.User;
import org.jon.lv.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Package org.jon.lv.dao.UserMapperTest
 * @Description: UserMapperTest
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/9/4 15:40
 * version V1.0.0
 */
public class UserMapperTest extends DisconfApplicationTest{

    @Autowired
    private UserService userService;

    @Test
    public void selectByPrimaryKey(){
        userService.selectByPrimaryKey(82003);
    }

    @Test
    public void insert(){
        User user = userService.selectByPrimaryKey(93828);

        user.setId(null);
        user.setName(user.getName()+"-1");

        userService.insert(user);
    }
}
