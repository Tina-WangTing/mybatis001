package com.wt.dao;

import com.wt.Utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.wt.pojo.User;

import java.util.List;

public class UserDaoFindTest {

    @Test
    public void findUserList() {

        SqlSession sqlSession = MyBatisUtil.createSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            List<User> userList = userDao.findUserList(2, "王");
            for (User user : userList) {
                System.out.println(user.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }


    }
}
