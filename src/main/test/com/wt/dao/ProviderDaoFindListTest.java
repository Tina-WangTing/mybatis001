package com.wt.dao;

import com.wt.Utils.MyBatisUtil;
import com.wt.pojo.Provider;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ProviderDaoFindListTest {

    @Test
    public void findListByCode() {
        SqlSession sqlSession =MyBatisUtil .createSqlSession();
        try {
            ProviderDao providerDao = sqlSession.getMapper(ProviderDao.class);
            List<String> codeslist = new ArrayList<String>();
            codeslist.add("BJ_GYS001");
            codeslist.add("GZ_GYS001");
            List<Provider> providerList = providerDao.
                    findListByCode(codeslist);
            System.out.println(providerList.size());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
    }
}