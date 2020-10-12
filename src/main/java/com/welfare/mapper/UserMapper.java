package com.welfare.mapper;

import com.welfare.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//注解表示mybatis mapper
@Mapper
@Repository
public interface UserMapper {

    List<User> queryUserList();

    User queryUserById(int id);

    int updateUser(User user);

    int addUser(User user);

    int deleteUser(int id);

}
