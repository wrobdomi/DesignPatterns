package com.dominik;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("Observer updated !");
    }
}
