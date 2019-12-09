package com.dominik;

public class Main {

    public static void main(String[] args) {

        Builder bOne = new ConcreteBuilderOne();
        Builder bTwo = new ConcreteBuilderTwo();

        Director d = new Director(bOne);
        d.make("AB");
        ProductOne pOne = ((ConcreteBuilderOne) bOne).getProduct();
        System.out.println(pOne);

        d.changeBuilder(bTwo);
        d.make("B");
        ProductTwo pTwo = ((ConcreteBuilderTwo) bTwo).getProduct();
        System.out.println(pTwo);

    }
}
