package pack1;

public class ChilClass extends InheritanceClass{


    public static void main(String[] args){
        ChilClass chilClass=new ChilClass();
        chilClass.method2();
    }
     void  method(){
        System.out.println(publicString);
        System.out.println(protectedString);
        System.out.println("I am From Child Class");
    }
      void method2(){
        super.method();
    }
}
