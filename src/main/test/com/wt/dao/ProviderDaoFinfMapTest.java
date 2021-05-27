package com.wt.dao;

import com.wt.Utils.MyBatisUtil;
import com.wt.pojo.Provider;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ProviderDaoFinfMapTest {

    @Test
    public void findMapByCode() {
        SqlSession sqlSession = MyBatisUtil.createSqlSession();
        try {
            ProviderDao providerDao = sqlSession.getMapper(ProviderDao.class);
            List<String> codeslist = new ArrayList<String>();
            codeslist.add("BJ_GYS001");
            codeslist.add("GZ_GYS001");

            Map<String,Object> map = new HashMap<String,Object>();
            map.put("createdBy",1);
            map.put("codes",codeslist);
            List<Provider> providerList = providerDao.findMapByCode(map);
            System.out.println(providerList.size());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
    }
}