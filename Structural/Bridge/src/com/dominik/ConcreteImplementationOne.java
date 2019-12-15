package com.dominik;

public class ConcreteImplementationOne implements Implementation {
    @Override
    public void operatioOne() {
        System.out.println("operationOne: Hello from Concrete Impl Two !");
    }

    @Override
    public void operationTwo() {
        System.out.println("operationTwo: Hello from Concrete Impl Two !");
    }
}
