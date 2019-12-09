package com.dominik;

public class ProductOne {

    int a;
    int b;

    public ProductOne() {}

    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    @Override
    public String toString() {
        return "ProductOne{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
