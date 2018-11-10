package com.mybatis.mapper;

import com.mybatis.beans.User;

import java.util.List;

public interface UserMapper {
    public int insertUser(User user) throws Exception;
    public int updateUser(User user) throws Exception;
    public int deleteUser(int id) throws  Exception;
    public User selectUserById(int id) throws  Exception;
    public List<User> selectAllUser() throws  Exception;
}
