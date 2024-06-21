public class WhileAndForLoop {

    public static void main(String args[]){
        WhileAndForLoop object=new WhileAndForLoop();
        //object.whileloop();
        object.forloop();
    }

     void whileloop(){
        int count=0;
        while(count<3){
            System.out.println(count);
            count++;
        }
    }
    void forloop(){
        for(int i=0;i<3;i++){
            System.out.println(i);
        }
        //print the numbers from 0 - 20
        for(int i=0;i<21;i++){
            System.out.println(i);
        }

        //print the numbers between 11 -32
        for(int i=11;i<33;i++){
            System.out.println(i);
        }

        //print the numbers between 12- 50 3 12 15 18 21 24....
        for(int i=12;i<=50;i+=3){
            System.out.println(i);
        }
    }
}
