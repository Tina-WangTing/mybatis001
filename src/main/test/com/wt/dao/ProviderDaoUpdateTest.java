package com.wt.dao;

import com.wt.Utils.MyBatisUtil;
import com.wt.pojo.Provider;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ProviderDaoUpdateTest {

    @Test
    public void updateProvider() throws Exception {
        SqlSession sqlSession=MyBatisUtil.createSqlSession();
        try {
            ProviderDao providerDao =sqlSession .getMapper(ProviderDao .class);
            Provider provider=new Provider() ;
            provider.setProName("王家ddddddddddd");
            provider.setProDesc("合作伙伴");
            provider.setId(16);
            int i = providerDao.updateProvider(provider);
            System.out.println("受影响行数==="+i);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtil .closeSqlSession(sqlSession );
        }
    }
}