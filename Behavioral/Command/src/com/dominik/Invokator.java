package com.dominik;

import java.util.LinkedList;
import java.util.Queue;

public class Invokator {

    private Queue<Command> qc = new LinkedList<Command>();

    public void addCommand(Command c){
        this.qc.add(c);
    }

    public void executeCommands(){
        for(Command c : this.qc) c.execute();
    }


}
