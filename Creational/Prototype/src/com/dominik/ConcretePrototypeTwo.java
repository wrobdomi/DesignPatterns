package com.dominik;

public class ConcretePrototypeTwo implements Prototype{

    int fieldTwo;

    public ConcretePrototypeTwo(ConcretePrototypeTwo cpo) {
        this.fieldTwo = cpo.fieldTwo;
    }

    public ConcretePrototypeTwo(int ft) {
        this.fieldTwo = ft;
    }

    @Override
    public Prototype clonePrototype() {
        return new ConcretePrototypeTwo(this);
    }

    @Override
    public String toString() {
        return "ConcretePrototypeTwo{" +
                "fieldTwo=" + fieldTwo +
                '}';
    }
}
