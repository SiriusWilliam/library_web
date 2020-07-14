package com.sirius.dao;

import com.sirius.domain.UserLogin;

import java.util.ArrayList;
import java.util.Date;

public interface UserLoginDao {
    /*查询*/
    // 根据用户名查询
    UserLogin selectUserLoginByUserName(String username);
    // 根据最后登录时间区间查询
    ArrayList<UserLogin> selectUserLoginByTimeSection(Date left, Date right);
    // 根据id查询
    UserLogin selectUserLoginById(Integer id);
    // 登录查询
    UserLogin loginCheck(String username, String password);
    // 盐值查询
    String selectSalt(String username);
    /*修改*/
    // 根据用户名修改密码
    int updatePasswordByName(String username, String password, String salt);
    // 修改对象
    int updateUserLogin(UserLogin oldUserLogin, UserLogin newLogin);
    // 根据用户名修改登录时间
    int updateLastTimeByName(String name, Date date);
    // 根据对象修改用户时间
    int updateLastTimeByUserLogin(UserLogin target, Date date);
    // 根据id修改密码
    int updatePasswordById(Integer id, String password, String salt);
    // 根据对象修改密码
    int updatePasswordByUserLogin(UserLogin userLogin, String password, String salt);
    /*添加*/
    // 添加UserLogin
    int insertUserLogin(UserLogin userLogin);
}