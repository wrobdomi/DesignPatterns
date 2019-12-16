package com.dominik;

public class ConcreteComponent implements Component{

    @Override
    public void execute() {
        System.out.println("This is default behaviour of the component...");
    }
}
