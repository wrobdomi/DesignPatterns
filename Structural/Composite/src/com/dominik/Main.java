package com.dominik;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Component c1 = new LeafOne();
        Component c2 = new LeafOne();
        Component c3 = new LeafTwo();
        Component c4 = new LeafTwo();
        Composite root = new Composite();
        root.add(c1);
        root.add(c3);
        root.add(c2);
        root.add(c4);

        Composite another = new Composite();
        Component c5 = new LeafOne();
        Component c6 = new LeafTwo();
        another.add(c5);
        another.add(c6);

        root.add(another);

        root.execute();

    }
}
