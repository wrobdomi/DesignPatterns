package com.dominik;

public class ConcreteDecoratorTwo extends BaseDecorator {

    public ConcreteDecoratorTwo(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        super.execute();
        this.extraActionTwo();
    }

    public void extraActionTwo() {
        System.out.println("Action from Decorator Two...");
    }

}
