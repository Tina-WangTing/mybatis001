package com.wt.dao;


import com.wt.Utils.MyBatisUtil;
import com.wt.pojo.Provider;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.List;

public class ProviderDaoGetTest {
    @Test
    public void getByproNameAndByproDesc()throws Exception {
        SqlSession sqlSession =MyBatisUtil .createSqlSession();
        try {
            ProviderDao providerDao =sqlSession .getMapper(ProviderDao.class );

            String proName="";
            String proDesc="";
            List <Provider> providerList=
                    providerDao .getByproNameAndByproDesc(proName,proDesc) ;
            System .out .println(providerList.size());
            for (Provider provider:providerList){
                System .out .println(providerList.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtil .closeSqlSession(sqlSession );
        }
    }
}