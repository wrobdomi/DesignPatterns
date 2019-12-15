package com.dominik;

public class Adapter implements ClientInterface{

    private Service adaptee;

    public Adapter() {
        this.adaptee = new Service();
    }


    @Override
    public void doSomething() {
        this.adaptee.serviceMethod();
    }

}
