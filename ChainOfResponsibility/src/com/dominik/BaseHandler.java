package com.dominik;

public abstract class BaseHandler implements Handler{
    protected Handler nextHandler;

    @Override
    public void setNext(Handler h){
        this.nextHandler = h;
    }

}
