package com.proxy;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String s) {
        System.out.println("hello"+s);
    }
}
