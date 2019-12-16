package com.dominik;

public class Main {

    public static void main(String[] args) {

        Element e1 = new Element(1, "Green");
        Element e2 = new Element(10, "Green");
        Element e3 = new Element(45, "Yellow");
        Element e4 = new Element(100, "Yellow");
        Element e5 = new Element(210, "Red");
        Element e6 = new Element(180, "Red");

        ElementsContext ec = new ElementsContext();
        ec.addElement(e1);
        ec.addElement(e2);
        ec.addElement(e3);
        ec.addElement(e4);
        ec.addElement(e5);
        ec.addElement(e6);

        ec.doOperations();

    }

}
