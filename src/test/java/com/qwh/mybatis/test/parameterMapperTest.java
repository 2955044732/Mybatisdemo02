package com.qwh.mybatis.test;

import com.qwh.mybatis.mapper.ParameterMapper;
import com.qwh.mybatis.pojo.User;
import com.qwh.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther qwh
 * @create 2023-04-2023/4/18 20:19
 */
public class parameterMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        //获取接口的。class
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> list = mapper.selectAllUser();
        for (User user : list) {
            System.out.println(user.toString());
        }
    }
    @Test
    public void TestJDBC(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.selectUserByUsername("李四");
        System.out.println(user.toString());


    }
    @Test
    public void JDBC(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.login("王五","123");
        System.out.println(user.toString());

    }
    @Test
    public void JDBC1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String,String> map = new HashMap();
        map.put("username","张三");
        map.put("password","123");
        User user = mapper.loginByMap(map);
        System.out.println(user.toString());

    }
    @Test
    public void JDBC2(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Boolean user = mapper.insertUser(new User(null, "haha","qwe123",123,"男","123qwe@qq.com"));
        System.out.println(user);

    }
    @Test
    public void JDBC3(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.loginByParam("王五","123");
        System.out.println(user.toString());

    }
}
