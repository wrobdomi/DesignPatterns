package com.dominik;

public class ConcreteImpl extends TemplateMethod {

    @Override
    public void step1() {
        System.out.println("Doing step 1 of the algorithm !");
    }

    @Override
    public void step2() {
        System.out.println("Doing step 2 of the algorithm !");
    }
}
