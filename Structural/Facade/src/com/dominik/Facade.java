package com.dominik;

import complex.subsystem.ClassA;
import complex.subsystem.ClassB;
import complex.subsystem.ClassC;
import complex.subsystem.ClassD;

public class Facade {

    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();
    private ClassD classD = new ClassD();


    public void performOperation() {
        this.classA.doOperationA();
        this.classB.doOperationB();
        this.classC.doOperationC();
        this.classD.doOperationD();
    }

}
