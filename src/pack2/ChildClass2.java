package pack2;

import pack1.AccessModifiers;
import pack1.InheritanceClass;

public class ChildClass2 extends InheritanceClass {
    AccessModifiers accessModifiers=new AccessModifiers();
    void method(){
        String str=publicString;
        str=protectedString;
        str=accessModifiers.publicString;
    }
}
