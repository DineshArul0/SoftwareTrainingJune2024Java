public class MethodOverLoading {

    //add method
    //double int float --- int ,double -- double ,int

    public double add(int num1,int num2){
        double result=num1+num2;
        return result;
    }
    public double add(double num1,double num2){
        return num1+num2;
    }
    public double add(int num1,int num2,int num3){
        return num1+num2+num3;
    }



    public static void main(String args[]){
        MethodOverLoading methodOverLoading=new MethodOverLoading();
        System.out.println(methodOverLoading.add(12,13));
        System.out.println(methodOverLoading.add(13.5,6.3));
        System.out.println(methodOverLoading.add(4,5,6));
    }
}