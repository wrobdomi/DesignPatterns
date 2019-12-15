package com.dominik;

public class Abstraction {

    private Implementation i;

    public Abstraction() {
        this.i = null;
    }

    public Abstraction(Implementation i) {
        this.i = i;
    }

    public void methodOne(){
        i.operatioOne();
    }

    public void methodTwo(){
        i.operationTwo();
    }

}
