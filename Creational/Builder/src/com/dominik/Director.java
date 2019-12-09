package com.dominik;

public class Director {

    private Builder builder;

    public Director(Builder b){
        this.builder = b;
    }

    public void changeBuilder(Builder b){
        this.builder = b;
    }

    public void make(String type){
        builder.reset();
        if(type.equals("A")){
            builder.buildStepA(1);
        }
        if(type.equals("B")){
            builder.buildStepB(1);
        }
        if(type.equals("AB")){
            builder.buildStepA(1);
            builder.buildStepB(1);
        }
    }


}
