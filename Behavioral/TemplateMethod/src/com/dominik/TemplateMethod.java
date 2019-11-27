package com.dominik;

public abstract class TemplateMethod implements Strategy {

    public void algorithm(){
        step1();
        step2();
    }

    public abstract void step1();
    public abstract  void step2();


}
