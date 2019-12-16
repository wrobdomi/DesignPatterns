package com.dominik;

public class Element {

    int uniqueState;
    Flyweight flyweight;

    public Element(int uniqueState, String repeatingState) {
        this.uniqueState = uniqueState;
        this.flyweight = FlyweightFactory.getFlyweight(repeatingState);
    }

    public void operation(){
        this.flyweight.operation(this.uniqueState);
    }

}
