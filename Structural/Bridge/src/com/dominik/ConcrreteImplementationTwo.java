package com.dominik;

public class ConcrreteImplementationTwo implements Implementation {
    @Override
    public void operatioOne() {
        System.out.println("operationOne: Hello from Concrete Impl One !");
    }

    @Override
    public void operationTwo() {
        System.out.println("operationTwo: Hello from Concrete Impl One !");
    }
}
