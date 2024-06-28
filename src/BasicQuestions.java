import java.util.Scanner;

public class BasicQuestions {

    public static void main(String[] args){
        int a=25, b=37, c=29;

        System.out.println("the Smallest Number is: "+(a<b?a<c?a:c:b<c?b:c));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
       // String input = scanner.nextLine();
       /// middleCharacter(input);
        //Newly Added
        //Commented
        //New Comment
        //added just
        //added from master

        String str = "aeiou12";
        int vowelscount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(ch = str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelscount++;
            }
        }
        System.out.println("the number of vowles in the string is:" + vowelscount);

    }

    public static void middleCharacter(String str) {
        int length = str.length();
        if (length == 0) {
            System.out.println("The string is empty.");
            return;
        }

        int middle = length / 2;
        if (length % 2 == 0) {
            System.out.println("The middle character in even string: " + str.charAt(middle - 1));
        } else {
            System.out.println("The middle characters in odd string: " + str.charAt(middle - 1) + str.charAt(middle));
        }
    }
}
