package com.qwh.mybatis.test;

import com.qwh.mybatis.mapper.SelectMapper;
import com.qwh.mybatis.pojo.User;
import com.qwh.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @auther qwh
 * @create 2023-04-2023/4/19 19:34
 */
public class SelectMapperTest {
    @Test
    public void selectUserById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> list = mapper.SelectUserById(4);
        System.out.println(list);
    }
    @Test
    public void selectAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> list = mapper.SelectAllUser();
        for (User user : list) {
            System.out.println(user);
        }
    }
    @Test
    public void getCount(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer count = mapper.getCount();
        System.out.println(count);
    }
    @Test
    public void getUserByIdToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> user = mapper.getUserByIdToMap(4);
        System.out.println(user.toString());
        //{password=123, sex=女, id=4, age=23, email=123123@qq.com, username=李四}
    }
    @Test
    public void getAllUserToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> user = mapper.getAllUserToMap();
        System.out.println(user);
    }
}
