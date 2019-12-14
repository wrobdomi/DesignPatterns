package com.dominik;

public class ConcreteFactoryTwo implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ProductTwoA();
    }

    @Override
    public ProductB createProductB() {
        return new ProductTwoB();
    }
}
