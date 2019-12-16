package com.dominik;

public class Proxy implements ServiceInterface{

    private Service service;

    public Proxy() {
        this.service = new Service();
    }

    @Override
    public void operation() {
        System.out.println("Checking access");
        System.out.println("Proxy access approved !");
        this.service.operation();
    }
}
