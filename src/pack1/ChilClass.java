package pack1;

public class ChilClass extends InheritanceClass{

    public static void main(String[] args){
        ChilClass chilClass=new ChilClass();
        chilClass.method();
    }
    void method(){
        System.out.println(publicString);
        System.out.println(protectedString);
    }
}
