package com.qwh.mybatis.mapper;

import com.qwh.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @auther qwh
 * @create 2023-04-2023/4/18 20:06
 */
public interface ParameterMapper {
    /**
     * 查询
     */
    List<User> selectAllUser();
    /**
     * 根据用户民查找用户信息
     */
    User selectUserByUsername(String username);
    /**
     * 登录
     */
    User login(String username,String password);
    /**
     * 登录2
     */
    User loginByMap(Map map);
    /**
     * 插入
     */
    Boolean insertUser(User user);
    /**
     * 登录@param
     */
    User loginByParam(@Param("username") String username,@Param("password") String password);


}
