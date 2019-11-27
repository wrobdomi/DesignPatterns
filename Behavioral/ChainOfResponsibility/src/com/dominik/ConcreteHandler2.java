package com.dominik;

public class ConcreteHandler2 extends BaseHandler{

    @Override
    public void handle(MyRequeset mr) {
        System.out.println("Hello from handler 2");
        if(mr.requestData < 3){
            System.out.println("Passing to next handler");
            this.nextHandler.handle(mr);
        }
        else{
            System.out.println("Handled in handler 2");
        }

    }

}
