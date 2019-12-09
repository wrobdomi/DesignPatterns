package com.dominik;

public class ConcreteBuilderOne implements Builder {

    private ProductOne po;

    @Override
    public void reset() {
        this.po = new ProductOne();
    }

    @Override
    public void buildStepA(int a) {
        this.po.setA(a);
    }

    @Override
    public void buildStepB(int b) {
        this.po.setB(b);
    }

    public ProductOne getProduct() {
        return this.po;
    }




}
