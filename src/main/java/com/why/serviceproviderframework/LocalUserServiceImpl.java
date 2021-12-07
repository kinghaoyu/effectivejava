package com.why.serviceproviderframework;

import com.sun.media.jfxmediaimpl.HostUtils;

/**
 * 服务实现类
 */
public class LocalUserServiceImpl implements UserService{

    public LocalUserServiceImpl(){
        System.out.println("LocalUserServiceImpl init...");
    }
    public void login() {
        System.out.println("本地用户登录成功");
    }

    public void register() {
        System.out.println("本地用户注册成功");
    }
}
