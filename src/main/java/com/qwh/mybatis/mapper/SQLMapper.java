package com.qwh.mybatis.mapper;

import com.qwh.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @auther qwh
 * @create 2023-04-2023/4/19 20:14
 */
public interface SQLMapper {
    /**
     * 根据用户模糊查询用户信息
     */
    List<User> getUserByLike(@Param("username") String username);
    /**
     * 批量删除
     */
    Boolean deleteUser(@Param("ids") String ids);
    /**
     * 查询表的数据
     */
    List<User> getUserByTableName(@Param("tableName") String tableName);
    /**
     * 添加用户信息
     */
    Boolean insertUser(User user);
}
