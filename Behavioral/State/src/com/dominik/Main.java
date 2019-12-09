package com.dominik;

public class Main {

    public static void main(String[] args) {

        State stateOne = new ConcreteStateOne();
        State stateTwo = new ConcreteStateTwo();

        Context context = new Context(stateOne);

        ((ConcreteStateOne) stateOne).setContext(context);
        ((ConcreteStateTwo) stateTwo).setContext(context);

        context.doOperationOne();
        context.doOperationTwo();

        context.changeState(stateTwo);

        context.doOperationOne();
        context.doOperationTwo();

    }
}
