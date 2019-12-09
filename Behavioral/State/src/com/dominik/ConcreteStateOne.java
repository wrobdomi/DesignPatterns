package com.dominik;

public class ConcreteStateOne implements State {

    private Context context;

    public void setContext(Context context){
        this.context = context;
    }

    @Override
    public void doOperationOne() {
        System.out.println("Doing operation One in ConcreteStateOne instance !");
    }

    @Override
    public void doOperationTwo() {
        System.out.println("Doing operation Two in ConcreteStateOne instance !");
    }
}
