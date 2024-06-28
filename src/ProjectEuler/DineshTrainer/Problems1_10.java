package ProjectEuler.DineshTrainer;

public class Problems1_10 {


    public void problem1(){
        int sum=0;
        for(int i=1;i<1000;i++){
            if(i%3==0 || i%5==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }

    public void problem2(){
        int sum=2;
        // 1,2,3,5,8
        int a=1;
        int b=2;
        int temp=0;
        while(a+b<4000000){
            temp=a+b;
            if(temp%2==0){
                sum=sum+temp;
            }
            a=b;
            b=temp;
        }
        System.out.println(sum);
        //Added comment from master
    }

    //System.out.println("");
}
