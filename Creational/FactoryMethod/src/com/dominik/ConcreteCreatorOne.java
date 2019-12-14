package com.dominik;

public class ConcreteCreatorOne extends Creator {
    @Override
    public Product createProduct() {
        return new ProductOne();
    }
}
