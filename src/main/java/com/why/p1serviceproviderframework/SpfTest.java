package com.why.p1serviceproviderframework;

public class SpfTest {
    public static void main(String[] args) throws ClassNotFoundException {
        String localUserProviderStr = "com.why.p1serviceproviderframework.LocalUserProviderImpl";

        Class.forName(localUserProviderStr);
        UserService service = ServerManager.getService(localUserProviderStr);
        service.login();
        service.register();
    }
}
