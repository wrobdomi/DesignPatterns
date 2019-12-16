package com.dominik;

public class Flyweight {

    private String repeatingState;

    public Flyweight(String repeatingState) {
        this.repeatingState = repeatingState;
    }

    public String getRepeatingState() {
        return repeatingState;
    }

    public void operation(int uniqueState) {
        System.out.println("Unique state: " + uniqueState + " Repeating state: " + repeatingState);
    }

}
