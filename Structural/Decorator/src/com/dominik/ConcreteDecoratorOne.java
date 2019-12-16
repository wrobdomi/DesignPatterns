package com.dominik;

public class ConcreteDecoratorOne extends BaseDecorator {

    public ConcreteDecoratorOne(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        super.execute();
        this.extraActionOne();
    }

    public void extraActionOne() {
        System.out.println("Action from Decorator One...");
    }
}
