package com.dominik;

public class App {

    private AbstractFactory af;

    public App(AbstractFactory af) {
        this.af = af;
    }

    public void setAf(AbstractFactory af) {
        this.af = af;
    }

    public void performTaskA(){
        af.createProductA().doTask();
    }

    public void performTaskB(){
        af.createProductB().doTask();
    }
}
