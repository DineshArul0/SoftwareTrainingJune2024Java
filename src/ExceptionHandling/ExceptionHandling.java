package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

    public void ArithmeticExcetionn(){
        int a=12,b=0,c;
        try {
            c=a/b;
        }catch (ArithmeticException e){
            System.out.println(e);
        }

        int[] arr={1,2,4};
        try{
            System.out.println(arr[10]);
        }catch (Exception e){
            System.out.println(e);
        }


        System.out.println("The COde Executed success");
        int d=12,e=6,f;
        f=d/e;
        System.out.println("The COde Executed success");
    }

    public void fileoperations()   {
        String path="";
        File file=new File(path);
        try{
            FileInputStream fis=new FileInputStream(file);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
