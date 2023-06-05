package com.qwh.mybatis.mapper;

import com.qwh.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * @auther qwh
 * @create 2023-04-2023/4/19 19:32
 */
public interface SelectMapper {
    /**
     * 根据id查询用户信息
     */
    List<User> SelectUserById(@Param("id") Integer id);
    /**
     * 查询所有的用户信息
     */
    List<User> SelectAllUser();
    /**
     * 查询用户信息的总记录数
     */
    Integer getCount();
    /**
     * 根据id查询用户信息为一个map集合
     */
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);
    /**
     * 获取所有用户的信息为map集合
     */
    @MapKey("id")//<-----这是重点 ---->利用id将map重新组装为一个map
    Map<String,Object> getAllUserToMap();


}
