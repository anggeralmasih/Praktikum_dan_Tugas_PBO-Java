package com.Angger.Modul2.Inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
        A superclass = new A();
        B subclass = new B();

        System.out.println("SuperClass : ");
        superclass.x = 10;
        superclass.y = 50;
        superclass.printXY();

        //member superclass dapat diakses oleh subclassnya
        System.out.println();
        System.out.println("SubClass   : ");
        subclass.x = 30;
        subclass.y = 40;
        subclass.printXY();

        //member tambahan pada subclass
        subclass.z = 10;
        subclass.sumValue();
    }
}
