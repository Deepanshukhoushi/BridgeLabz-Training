package com.annotationsandreflection.reflection.loggingproxyusingreflection;

import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {

        Greeting realObject = new GreetingImpl();

        Greeting proxyObject = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingInvocationHandler(realObject)
        );

        proxyObject.sayHello("Alice");
    }
}
