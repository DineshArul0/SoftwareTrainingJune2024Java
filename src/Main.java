import DateAndTime.DateAndTime;
import ExceptionHandling.ExceptionHandling;

import java.io.FileNotFoundException;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)   {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      //  System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
             //   System.out.println("i = " + i);
        }

        DateAndTime dateAndTime=new DateAndTime();
        ExceptionHandling exceptionHandling=new ExceptionHandling();
//        String strdate=dateAndTime.addDays(5);
//        System.out.println(strdate);
//        System.out.println(dateAndTime.getAdultDOB());
//        System.out.println(dateAndTime.Addhours(4));
        exceptionHandling.ArithmeticExcetionn();
        exceptionHandling.fileoperations();
    }
}