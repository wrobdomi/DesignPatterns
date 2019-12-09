package com.dominik;

public class Context {

    private State state;

    Context(State initialState){
        this.state = initialState;
    }

    void changeState(State state){
        this.state = state;
    }


    void doOperationOne(){
        this.state.doOperationOne();
    }

    void doOperationTwo(){
        this.state.doOperationTwo();
    }


}
