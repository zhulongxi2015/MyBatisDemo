package com.mybatis.test;

import com.mybatis.beans.User;
import com.mybatis.mapper.UserMapper;
import com.mybatis.tools.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

public class Client {
    public static void main(String[] args) {
        SqlSession session = DBTools.getSession();
        UserMapper userMapper =session.getMapper(UserMapper.class);
       /* User user=new User();
        user.setLogin("lonmgxi1");
        user.setName("longxi1");
        user.setPass("1234");
        user.setSex("男");
        user.setPhone("12335345");
        user.setEmail("43534@qq.com");*/
        try{
            User user=userMapper.selectUserById(3);
            System.out.println(user);
            session.commit();
        }
        catch (Exception e){
            e.printStackTrace();
            session.rollback();
        }

    }
}
