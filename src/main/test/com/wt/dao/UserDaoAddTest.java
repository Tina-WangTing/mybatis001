package com.wt.dao;

import com.wt.Utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.wt.pojo.User;


public class UserDaoAddTest {

    @Test
    public void addUser() {
        SqlSession sqlSession = MyBatisUtil.createSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            User user = new User();
            user.setId(23);
            user.setUserName("张三");
            int i = userDao.addUser(user);
            System.out.println("受影响行数===" + i);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }

    }
}