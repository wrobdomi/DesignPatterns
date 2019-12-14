package com.dominik;

public class Main {

    public static void main(String[] args) {

        AbstractFactory afOne = new ConcreteFactoryOne();

        App app = new App(afOne);
        app.performTaskA();
        app.performTaskB();

        AbstractFactory afTwo = new ConcreteFactoryTwo();
        app.setAf(afTwo);

        app.performTaskA();
        app.performTaskB();

    }
}
