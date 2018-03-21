package org.poem.service;

import org.poem.api.UserService;
import org.poem.basic.BaseDao;
import org.poem.dao.UserDao;
import org.poem.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author lxx
 * @version V1.0.0
 * @date 2018-3-21
 */

@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    public int updateNameById(String id, String name){
        System.out.println("1111111111111");
        return userDao.updateNameById(Long.parseLong(id), name);
    }
}
