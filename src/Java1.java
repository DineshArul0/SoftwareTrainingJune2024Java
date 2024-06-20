public class Java1 {


    //For auto indendation ctrl+alt+l

    public static void main(String args[]) {
        Java1 java1 = new Java1();//object creation
//        java1.method1();
//        method2();
//        method3("Hello Universe");
//        method3("Hello Nation");
//        stringoperations("dinesh","ASDSDFDFEURTRTRdfdfdeebbbSS");
 //       conditionalopeators();
        ifelse();
    }

    void method1() {
        System.out.println("Hello java");
    }

    static void method2() {
        System.out.println("Hello world");
    }
    static  void method3(String str){
        System.out.println(str);
    }

    void variables(){
        String str="";
        String character="3";
        str="Deekay";
        String str2="Dinesh";
        int a=2;
        double b=2.4;
        boolean c=true;
        boolean d=false;
        String s=null;
        char e='#';
    }

    static void stringoperations(String str,String str2){
        boolean result=str.equals("Dinesh");
        System.out.println(result);
        String str1=str2.toLowerCase();
        System.out.println(str1);
        char c=str.charAt(4);
        System.out.println(c);
        System.out.println(str.charAt(3));
        String custom="World Greatest Leader";
        System.out.println(custom.charAt(6));
        System.out.println(custom.indexOf("G"));

        str.trim();
        str.strip();
        str.substring(0,3);
        str.split("-");

    }

    static void conditionalopeators(){
        int a=10;
        int b=12;
        boolean result=a<b;
        System.out.println(result);
        result=a>=b;
        System.out.println(result);
        result=a!=b;
        System.out.println(result);
        String str="Dinesh";
        String str2="Dinesh";
        result=str.equalsIgnoreCase(str2);
        System.out.println(result);

        /*
        <
        >
        ==
        <=
        >=
        !=
        int double char String equals or equalsIgnoreCase
         */
    }

    static void ifelse(){
        boolean value=true;
        double x=12.5;
        double y=12.4;
        if(value){
            System.out.println("the Value is true");
        }else{
            System.out.println("the Value is false");
        }
        if(x>y){
            System.out.println("the value of x is greater than y");
        } else if (x==y) {
            System.out.println("the value of x is equal to y");
        }
       else{
            System.out.println("the value of x is lesser than y");
        }
    }

//Variables
    /*
    DataTypes
    byte
    short
    int
    long
    double
    float
    char
    boolean
    String

     */

    //String Operations
    /*
    conditional Operators
    >
    <
    ==
    >=
    <=
    !=
    if else
    while
    for loop
     */




}
