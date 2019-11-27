package com.dominik;

public class Main {

    public static void main(String[] args) {

        MyRequeset mr = new MyRequeset();
        Handler hr1 = new ConcreteHandler1();
        Handler hr2 = new ConcreteHandler2();
        Handler hr3 = new ConcreteHandler3();
        hr1.setNext(hr2);
        hr2.setNext(hr3);
        hr1.handle(mr);

    }
}
