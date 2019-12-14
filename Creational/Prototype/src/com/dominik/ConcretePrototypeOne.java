package com.dominik;

public class ConcretePrototypeOne implements Prototype {

    int fieldOne;

    public ConcretePrototypeOne(ConcretePrototypeOne cpo) {
        this.fieldOne = cpo.fieldOne;
    }

    public ConcretePrototypeOne(int fo) {
        this.fieldOne = fo;
    }

    @Override
    public Prototype clonePrototype() {
        return new ConcretePrototypeOne(this);
    }

    @Override
    public String toString() {
        return "ConcretePrototypeOne{" +
                "fieldOne=" + fieldOne +
                '}';
    }
}
