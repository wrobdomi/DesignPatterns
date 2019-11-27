package com.dominik;

public class LightReceiver {

    private int lightState = 0;

    public void lightOn(){
        this.lightState = 1;
    }

    public void lightOff(){
        this.lightState = 0;
    }

    public int getLightState(){
        return this.lightState;
    }


}
