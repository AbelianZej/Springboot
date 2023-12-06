package com.example.springbootfirst.mapper;

import com.example.springbootfirst.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper

public interface UserMapper {
    @Select("select * from user where id = ${id}")
    List<User> findAll(int id);
}
