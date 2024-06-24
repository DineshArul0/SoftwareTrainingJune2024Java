public class DifferentMethods {

    // methods with no return type void
    // String int or double void

    public void returnnothing(){
        System.out.println("It returns Nothing");
    }

    //retun String

    public String returnString(){
        System.out.println("I have Returned a String : Name");
        return "Dinesh";
    }

    public double returnnumber(){
        System.out.println("I have Returned a Double Value : age");
        return 12.0;
    }

    //parameterizing
    public String paraString(String name){
        name="####"+name+"####";
        /*






         */
        return name;
    }


    public static void main(String args[]){
        DifferentMethods object=new DifferentMethods();
//        object.returnnothing();
//        String result=object.returnString();
//        double resultage=object.returnnumber();

        //System.out.println("The returned value of String Name is :"+result);
        //System.out.println("The returned value of Double  Age is :"+resultage);

        String Name=object.paraString("Selva");
        System.out.println(Name);
        Name=object.paraString("Avinash");
        System.out.println(Name);

    }


}
