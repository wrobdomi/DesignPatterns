package com.dominik;

public class ConcreteFactoryOne implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ProductOneA();
    }

    @Override
    public ProductB createProductB() {
        return new ProductOneB();
    }
}
