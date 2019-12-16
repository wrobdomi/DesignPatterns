package com.dominik;

public class Service implements ServiceInterface {
    @Override
    public void operation() {
        System.out.println("Hello from service method !");
    }
}
