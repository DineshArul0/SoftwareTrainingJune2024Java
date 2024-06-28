package ProjectEuler.DineshTrainer;

public class Problems1_10 {


    public void problem1(){
        //Multiples of 3 or 5
        int sum=0;
        for(int i=1;i<1000;i++){
            if(i%3==0 || i%5==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }

    public void problem2(){
        //Even Fibonacci Numbers
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

    public void problem3(){
        //Largest Prime Factor
        long num=600851475143l;
        for(long i=num/2;i>0;i--){
            int count=0;
            if(num%i==0){
                for(long j=1;j<=i/2;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count==1){
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    public void problem4(){
        //Largest Palindrome Product

        int result=0;
        int largest=0;

        for(int i=999;i>=100;i--){
            for(int j=999;j>=100;j--){
                 result=i*j;
                 String actual=""+result;
                 StringBuilder builder=new StringBuilder();
                 String expected=builder.append(result).reverse().toString();
                if(actual.equals(expected)&& result>largest){
                    largest=result;
                    //System.out.println("i value "+ i + "j value "+j);
                }
            }
        }
        System.out.println(largest);
    }

    public  boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Check if original number is equal to its reversed version
        return originalNumber == reversedNumber;
    }
    //System.out.println("");
}
