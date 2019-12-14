package com.dominik;

public class Main {

    public static void main(String[] args) {

        Product product = null;

        String externalChoice = "one";

        ConcreteCreatorOne cco = new ConcreteCreatorOne();
        ConcreteCreatorTwo cct = new ConcreteCreatorTwo();

        if(externalChoice.equals("one")){
            product = cco.createProduct();
        }
        else if(externalChoice.equals("two")){
            product = cct.createProduct();
        }

        product.doSomething();


    }
}
