package pack1.pack3;

import pack1.ChilClass;

import java.awt.event.HierarchyListener;

public class grandChild extends ChilClass {

    void method(){
        String str=protectedString;
        str=publicString;
        System.out.println("I am From grandChild");


        //Multi Level Inheritance
        //Parent
        //Child extends Parent
        //GrandChild extends Child


        //HierarchialInheritance
        //Parent
        // child1 extends Parent  //child2 extends Parent//child3 extends Parent

        //Multipe Inheritance is not supported in java
        //Parent1 // parent2 //parent3
        //child extends Parent1,Parent2,Parent3


    }

}
