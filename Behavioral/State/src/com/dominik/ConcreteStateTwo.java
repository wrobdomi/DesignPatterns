package com.dominik;

public class ConcreteStateTwo implements State {

    private Context context;

    public void setContext(Context context){
        this.context = context;
    }

    @Override
    public void doOperationOne() {
        System.out.println("Doing operation One in ConcreteStateTwo instance !");
    }

    @Override
    public void doOperationTwo() {
        System.out.println("Doing operation Two in ConcreteStateTwo instance !");
    }

}
