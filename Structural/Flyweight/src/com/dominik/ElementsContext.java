package com.dominik;

import java.util.ArrayList;

public class ElementsContext {

    private ArrayList<Element> elements = new ArrayList<Element>();

    public void addElement(Element e) {
        this.elements.add(e);
    }

    public void doOperations() {
        for(Element e: elements){
            e.operation();
        }
    }

}
