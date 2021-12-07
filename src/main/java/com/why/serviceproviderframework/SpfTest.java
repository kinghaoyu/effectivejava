package com.why.serviceproviderframework;

public class SpfTest {
    public static void main(String[] args) throws ClassNotFoundException {
        String localUserProviderStr = "com.why.serviceproviderframework.LocalUserProviderImpl";

        Class.forName(localUserProviderStr);
        UserService service = ServerManager.getService(localUserProviderStr);
        service.login();
        service.register();
    }
}
