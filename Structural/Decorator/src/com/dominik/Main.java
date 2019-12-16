package com.dominik;

public class Main {

    public static void main(String[] args) {

        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecoratorTwo cdt = new ConcreteDecoratorTwo(cc);
        ConcreteDecoratorOne cdo = new ConcreteDecoratorOne(cdt);

        cdo.execute();

    }
}
