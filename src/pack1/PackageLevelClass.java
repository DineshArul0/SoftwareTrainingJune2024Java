package pack1;

public class PackageLevelClass {
    AccessModifiers accessModifiers=new AccessModifiers();
    void method(){
        String str=accessModifiers.publicString;
        str=accessModifiers.protectedString;
        str=accessModifiers.defaultString;

    }
}
