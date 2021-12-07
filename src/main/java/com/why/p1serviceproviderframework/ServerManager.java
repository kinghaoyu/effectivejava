package com.why.p1serviceproviderframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *  服务提供者管理类
 */
public class ServerManager {
    private ServerManager(){}

    public static final Map<String, UserProvider> providersMap = new ConcurrentHashMap<String, UserProvider>();

    public static void registerProvider(String name, UserProvider provider){
        providersMap.put(name, provider);
    }

    public static UserService getService(String name){
        UserProvider provider = providersMap.get(name);
        if (provider == null){
            //表示没有此命名注册服务提供者
            throw new IllegalArgumentException("没有此名称的服务提供者， 名称： " + name);
        }
        //返回服务实现类
        return provider.getUserService();
    }
}
