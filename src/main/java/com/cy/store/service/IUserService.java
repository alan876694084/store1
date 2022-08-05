package com.cy.store.service;

import com.cy.store.entity.User;


public interface IUserService {
    /**
     * @description:用户模块业务层接口
     * @param user 用户的数据对象
            * @return: void
            * @author: SSG
            * @time: 2022/7/6 17:24
     */
    void reg(User user);
    // 根据参数user对象获取注册的用户名
    // 调用持久层的User findByUsername(String username)方法，根据用户名查询用户数据
    // 判断查询结果是否不为null
    // 是：表示用户名已被占用，则抛出UsernameDuplicateException异常

    // 创建当前时间对象
    // 补全数据：加密后的密码
    // 补全数据：盐值
    // 补全数据：isDelete(0)
    // 补全数据：4项日志属性

    // 表示用户名没有被占用，则允许注册
    // 调用持久层Integer insert(User user)方法，执行注册并获取返回值(受影响的行数)
    // 判断受影响的行数是否不为1
    // 是：插入数据时出现某种错误，则抛出InsertException异常

    User login(String username, String password);

    /**
     * 修改密码
     * @param uid 当前登录的用户id
     * @param username 用户名
     * @param oldPassword 原密码
     * @param newPassword 新密码
     */
    public void changePassword(Integer uid, String username, String oldPassword, String newPassword);

    /**
     * @description:获取当前登录的用户的信息
     * @param uid
            * @return: com.cy.store.entity.User
            * @author: SSG
            * @time: 2022/7/15 15:20
     */
    User getByUid(Integer uid);

    /**
     * @description:修改用户资料
     * @param uid
     * @param username
     * @param user
            * @return: void
            * @author: SSG
            * @time: 2022/7/15 15:21
     */
    void changeInfo(Integer uid, String username,User user);

    /**
     * 修改用户头像
     * @param uid 当前登录的用户的id
     * @param username 当前登录的用户名
     * @param avatar 用户的新头像的路径
     */
    void changeAvatar(Integer uid, String username, String avatar);
}
