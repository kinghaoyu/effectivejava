package com.why.p1serviceproviderframework;

/**
 * 服务提供者具体实现类
 */
public class LocalUserProviderImpl implements UserProvider{

    public LocalUserProviderImpl(){
        System.out.println("LocalUserProviderImpl init...");
    }

    private UserService localUserService = new LocalUserServiceImpl();

    static{
        ServerManager.registerProvider("com.why.p1serviceproviderframework.LocalUserProviderImpl", new LocalUserProviderImpl());
    }

    public UserService getUserService() {
        return localUserService;
    }
}
