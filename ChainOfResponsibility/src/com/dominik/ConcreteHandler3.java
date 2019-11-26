package com.dominik;

public class ConcreteHandler3 extends BaseHandler{

    @Override
    public void handle(MyRequeset mr) {
        System.out.println("Hello from handler 3");
        if(mr.requestData != 1){
            System.out.println("Passing to next handler");
            this.nextHandler.handle(mr);
        }
        else{
            System.out.println("Handled in handler 3");
        }

    }

}
