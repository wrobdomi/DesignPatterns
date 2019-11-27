package com.dominik;

public class Main {

    public static void main(String[] args) {

        Strategy s1 = new ConcreteImpl();
        s1.algorithm();

    }
}
