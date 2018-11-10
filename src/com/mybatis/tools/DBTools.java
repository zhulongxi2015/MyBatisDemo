package com.mybatis.tools;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class DBTools {
    public static SqlSessionFactory sqlSessionFactory;
    static {
        try{
            Reader reader= Resources.getResourceAsReader("mybatis.cfg.xml");
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}
