package com.dominik;

public class BaseDecorator implements Component {

    private Component component;

    public BaseDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void execute() {
        this.component.execute();
    }
}
