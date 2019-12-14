package com.dominik;

public class ConcreteCreatorTwo extends Creator {
    @Override
    public Product createProduct() {
        return new ProductTwo();
    }
}
