package Basic_java_program.Functions_Java;

public class Scope_pgm {
   //Global variable
    public static int n = 25;
    public static void main(String[] args){

        //Local variable
        int a = 10;
        System.out.println("Access the local variable:"+ a);
        System.out.println("Access the Global variable:"+ n);
    }


}
