package com.wt.dao;

import com.wt.Utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.wt.pojo.User;

public class UserDaoDelTest {
    @Test
    public void deleteUser(){
        SqlSession sqlSession=MyBatisUtil.createSqlSession();
        try {
            UserDao userDao=sqlSession.getMapper(UserDao.class);
            User user = new User();
            user.setId(16);
            sqlSession.getMapper(UserDao .class).deleteUser(user);
            int i= userDao.deleteUser(user);
            System.out.println("受影响行数==="+i);
        } catch (Exception e) {
            sqlSession.rollback();
        }finally{
            MyBatisUtil.closeSqlSession(sqlSession) ;
        }
    }


}