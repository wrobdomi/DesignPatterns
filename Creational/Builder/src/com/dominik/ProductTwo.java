package com.dominik;

public class ProductTwo {

    private int a;
    private int b;

    public ProductTwo() {}

    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    @Override
    public String toString() {
        return "ProductTwo{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
