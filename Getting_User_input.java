package Basic_java_program;
import java.util.Scanner;
public class Getting_User_input {
    public static  void  main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the user input1: ");
       String text1 = input.nextLine();
        System.out.println("Enter the user input2: ");
        String text2 = input.nextLine();
       //display the output
       System.out.println("Display the user input: " + text1 + ' ' + text2 );

        System.out.println("Enter the num1: ");
        int n1 = input.nextInt();
        System.out.println("Enter the num2: ");
        int n2 = input.nextInt();
        int total = n1 + n2;
        //display the output
        System.out.println("Display the output: " + total);
    }
}
