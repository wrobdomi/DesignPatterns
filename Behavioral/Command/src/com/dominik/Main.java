package com.dominik;

public class Main {

    public static void main(String[] args) {

        LightReceiver lr1 = new LightReceiver();

        ConcreteCommandLightOff ccOff = new ConcreteCommandLightOff();
        ConcreteCommandLightOn ccOn = new ConcreteCommandLightOn();

        ccOff.setReceiver(lr1);
        ccOn.setReceiver(lr1);

        Invokator invokator = new Invokator();
        invokator.addCommand(ccOff);
        invokator.addCommand(ccOn);

        invokator.executeCommands();

    }
}
