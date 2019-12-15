package com.dominik;

public class Main {

    public static void main(String[] args) {

        Implementation iOne = new ConcreteImplementationOne();
        AbstractionTwo at = new AbstractionTwo(iOne);

        at.methodOne();
        at.methodTwo();
        at.methodFour();

        Implementation iTwo = new ConcrreteImplementationTwo();
        AbstractionOne ao = new AbstractionOne(iTwo);

        ao.methodOne();
        ao.methodTwo();
        ao.methodThree();
    }
}
