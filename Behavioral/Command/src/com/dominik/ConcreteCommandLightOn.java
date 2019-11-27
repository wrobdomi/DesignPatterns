package com.dominik;

public class ConcreteCommandLightOn implements Command {

    private LightReceiver lr;

    @Override
    public void execute() {
        System.out.println("Setting light on in concrete command off...");
        this.lr.lightOn();
        System.out.println("Light state is now " + this.lr.getLightState());
    }

    public void setReceiver(LightReceiver lr){
        this.lr = lr;
    }

}
