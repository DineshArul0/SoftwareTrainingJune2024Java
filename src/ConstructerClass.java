public class ConstructerClass {
String browser="";
    public ConstructerClass(){
        System.out.println("I am constructer");
        //browser
    }
    public ConstructerClass(String name){
        System.out.println("I am parameterized constructer");
        System.out.println("The given name is : "+name);
    }

    public ConstructerClass(String name,String name1){

    }
    public ConstructerClass(String name,int num){

    }

    public static void main(String args[]){
        //ConstructerClass constructerClass=new ConstructerClass();
        ConstructerClass constructerClass=new ConstructerClass("Mohan");
    }
}
