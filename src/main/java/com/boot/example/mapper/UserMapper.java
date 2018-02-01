package com.boot.example.mapper;

import com.boot.example.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * date: 2018-2-1 21:06
 * author: snowxuyu
 * describe:
 */
@Mapper
public interface UserMapper {

    @Insert("insert into t_user (id, user_name, pass_word, address, phone) values (#{id}, #{userName}, #{passWord}, #{address}, #{phone})")
    int insert(User user);

    @Select("select * from t_user where user_name = #{userName}")
    User findByName(@Param("userName") String userName);
}
