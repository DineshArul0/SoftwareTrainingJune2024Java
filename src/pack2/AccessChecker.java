package pack2;

import pack1.AccessModifiers;

public class AccessChecker {
    AccessModifiers accessModifiers=new AccessModifiers();

    void method(){
        String str=accessModifiers.publicString;
    }
}
