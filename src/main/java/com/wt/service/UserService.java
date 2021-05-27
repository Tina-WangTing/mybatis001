package com.wt.service;

import org.apache.ibatis.annotations.Param;
import com.wt.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> findUserList(
            @Param("gender") Integer userList,
            @Param("userName") String userName) throws Exception;

}
