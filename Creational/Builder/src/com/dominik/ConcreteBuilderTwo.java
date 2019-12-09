package com.dominik;

public class ConcreteBuilderTwo implements Builder {

    private ProductTwo pt;

    @Override
    public void reset() {
        this.pt = new ProductTwo();
    }

    @Override
    public void buildStepA(int a) {
        this.pt.setA(a);
    }

    @Override
    public void buildStepB(int b) {
        this.pt.setB(b);
    }

    public ProductTwo getProduct() {
        return this.pt;
    }
}
