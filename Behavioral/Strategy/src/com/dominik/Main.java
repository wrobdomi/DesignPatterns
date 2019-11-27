package com.dominik;

public class Main {

    public static void main(String[] args) {

        Strategy s1 = new StrategyA();
        MultiStrategyClass msc = new MultiStrategyClass();

        msc.setStrategy(s1);
        msc.applyStrategy();

        Strategy s2 = new StrategyB();
        msc.setStrategy(s2);
        msc.applyStrategy();

    }
}
