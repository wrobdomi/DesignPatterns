package com.dominik;

public class Main {

    public static void main(String[] args) {

        Prototype [] prototypes = new Prototype[]{
                new ConcretePrototypeOne(10),
                new ConcretePrototypeTwo(15)
        };

        Prototype [] clonedPrototypes = new Prototype[2];

        for(int i = 0; i < prototypes.length; i++){
            clonedPrototypes[i] = prototypes[i].clonePrototype();
        }

        System.out.println(clonedPrototypes[0]);
        System.out.println(clonedPrototypes[1]);

    }
}
