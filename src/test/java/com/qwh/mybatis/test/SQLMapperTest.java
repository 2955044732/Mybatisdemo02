package com.qwh.mybatis.test;

import com.qwh.mybatis.mapper.SQLMapper;
import com.qwh.mybatis.pojo.User;
import com.qwh.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @auther qwh
 * @create 2023-04-2023/4/19 20:49
 */
public class SQLMapperTest {
    @Test
    public void getUserByLikeTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> like = mapper.getUserByLike("a");
        System.out.println(like);
    }
    @Test
    public void deteleUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        Boolean deleteUser = mapper.deleteUser("1,2,3");
        System.out.println(deleteUser);
    }
    @Test
    public void getUserBytableName(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> User = mapper.getUserByTableName("t_user");
        System.out.println(User);
    }
    @Test
    public void insertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        User user = new User(null, "heiheihei", "1hhhh23", 23, "男", "123@163.com");
        Boolean insertUser = mapper.insertUser(user);
        System.out.println(insertUser);
    }
}
