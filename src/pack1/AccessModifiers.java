package pack1;

public class AccessModifiers {

    public String publicString="publicString";
    private String privatestring="privateString";
    protected String protectedString="protectedString";
    String defaultString="defaultString";

    AccessModifiers accessModifiers=new AccessModifiers();

    public void method(){
     String str=accessModifiers.publicString  ;
     str=accessModifiers.defaultString;
     str=accessModifiers.protectedString;
     str=accessModifiers.privatestring;
    }
    class SubClass{
        AccessModifiers accessModifiers=new AccessModifiers();
        void method(){

        }
    }
}
