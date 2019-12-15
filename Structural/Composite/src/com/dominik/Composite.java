package com.dominik;

import java.util.ArrayList;

public class Composite implements Component{

    private ArrayList<Component> components = new ArrayList<Component>();

    public void add(Component c){
        this.components.add(c);
    }

    public void remove(Component c){
        this.components.remove(c);
    }

    @Override
    public void execute() {
        for(Component c: components){
            c.execute();
        }
    }


}
