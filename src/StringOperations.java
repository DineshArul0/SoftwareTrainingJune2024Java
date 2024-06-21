public class StringOperations {


    public static void main(String args[]){
        StringOperations object=new StringOperations();
        object.stringOperations();
    }
    void stringOperations(){
        //Strings
        String string="dfsdfsdf#fgfgs#ghghg121 $fghf#ghg";
        String[] strarray=string.split("#");
        String a=string.substring(0,3);
        String date="26/08/2024 12:34:34";
        //1 st approach split
        String[] dates=date.split(" ");
        String datealone=dates[0];

        //2nd approach sub string concept
        datealone=date.substring(0,10);
        System.out.println(datealone);

        char c=date.charAt(3);
        System.out.println(c);



        //
        for(String str:strarray){
            System.out.println(str);
        }


    }
}
