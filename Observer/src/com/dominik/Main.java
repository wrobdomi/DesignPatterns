package com.dominik;

public class Main {

    public static void main(String[] args) {

        Observer ob1 = new ConcreteObserver();
        Observer ob2 = new ConcreteObserver();

        ConcreteSubject cs = new ConcreteSubject();
        cs.addObserver(ob1);
        cs.addObserver(ob2);

        cs.notifyObservers();

    }
}
