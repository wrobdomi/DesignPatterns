package com.dominik;

public class ConcreteHandler1 extends BaseHandler {

    @Override
    public void handle(MyRequeset mr) {
        System.out.println("Hello from handler 1");
        if(mr.requestData > 0){
            System.out.println("Passing to next handler");
            this.nextHandler.handle(mr);
        }
        else{
            System.out.println("Handled in handler 1");
        }

    }
}
