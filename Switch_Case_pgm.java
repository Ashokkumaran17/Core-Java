package Basic_java_program;
import java.util.Scanner;
public class Switch_Case_pgm {
    public static  void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the option:");
        int option =input.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter the input1:");
                int num1 =input.nextInt();
                System.out.println("Enter the input2:");
                int num2 =input.nextInt();
                int Add = num1 + num2;
                System.out.println("Addition output is: " + Add);
                break;
            case 2:
                System.out.println("Enter the input1:");
                int n1 =input.nextInt();
                System.out.println("Enter the input2:");
                int n2 =input.nextInt();
                int Sub = n1 - n2;
                System.out.println("Sub output is: " + Sub);
                break;

            case 3:
                System.out.println("Enter the input1:");
                int n3 =input.nextInt();
                System.out.println("Enter the input2:");
                int n4 =input.nextInt();
                int Mul = n3 * n4;
                System.out.println("Mul output is: " + Mul);
                break;

            case 4:
                System.out.println("Enter the input1:");
                int n5 =input.nextInt();
                System.out.println("Enter the input2:");
                int n6 =input.nextInt();
                int Div = n5 / n6;
                System.out.println("Div output is: " + Div);
                break;
            default:
                System.out.println("Invalid input!!!");


        }


    }
}
