package com.dominik;

public class ConcreteCommandLightOff implements Command {

    private LightReceiver lr;

     @Override
    public void execute() {
         System.out.println("Setting light off in concrete command off...");
         this.lr.lightOff();
         System.out.println("Light state is now " + this.lr.getLightState());
    }

    public void setReceiver(LightReceiver lr){
        this.lr = lr;
    }

}
