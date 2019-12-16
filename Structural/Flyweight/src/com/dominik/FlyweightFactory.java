package com.dominik;

import java.util.ArrayList;

public class FlyweightFactory {

    private static ArrayList<Flyweight> flyweights  = new ArrayList<Flyweight>();

    public static Flyweight getFlyweight(String repeatingState){
        for(Flyweight f : flyweights){
            if(f.getRepeatingState().equals(repeatingState)){
                return f;
            }
        }
        Flyweight newFlyweight = new Flyweight(repeatingState);
        flyweights.add(newFlyweight);
        return newFlyweight;
    }



}
