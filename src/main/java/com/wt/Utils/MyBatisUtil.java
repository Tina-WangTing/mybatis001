package com.wt.Utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;


public class MyBatisUtil {
  private static SqlSessionFactory factory;
      static{//静态代码块中 factory只会实例化一次
          try {
              InputStream   is = Resources.getResourceAsStream("mybatis.xml");
               factory=new SqlSessionFactoryBuilder().build(is);
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
      public static SqlSession createS qlSession(){
         return factory.openSession(true);
      }
       public static void closeSqlSession(SqlSession sqlSessison ){
          if(null!=sqlSessison){
              sqlSessison.close();
          }
       }
}


