package com.wt.service.impl;

import com.wt.Utils.MyBatisUtil;
import com.wt.dao.UserDao;
import com.wt.pojo.User;
import com.wt.service.UserService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao =MyBatisUtil.createSqlSession().
            getMapper(UserDao.class);


    public List<User> findUserList(
            @Param("gender") Integer userList,
            @Param("userName") String userName) throws Exception {



        return userDao.findUserList(userList, userName);
    }

}
