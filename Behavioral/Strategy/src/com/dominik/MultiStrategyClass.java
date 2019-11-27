package com.dominik;

public class MultiStrategyClass {

    Strategy currentStrategy;

    public void setStrategy(Strategy s){
        this.currentStrategy = s;
    }

    public void applyStrategy(){
        this.currentStrategy.doSomething();
    }

}
