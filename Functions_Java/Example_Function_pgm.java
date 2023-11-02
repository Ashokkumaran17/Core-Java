package Basic_java_program.Functions_Java;
import java.lang.String;
import java.util.Scanner;

public class Example_Function_pgm {
    static void my_func_call(){
        System.out.println("Welcome to Java Programs!!!");
    }
    static void my_string_func(String[] name){
        //Find the largest string
        String rev_str = " ";
        String max_str = name[0];
        for (int i=0; i< name.length;i++){
            if( name[i].length() > max_str.length()){
                max_str = name[i];
            }
        }
        System.out.println("Max_str name is:" + max_str);
        System.out.println("Max_str length is:" + max_str.length());
        //Reverse the string
        for (int i =0; i< max_str.length();i++){
            rev_str = max_str.charAt(i) + rev_str;
        }
        System.out.println("Reversed_str is:" + rev_str);

    }
    static void display_func(int[] arr_num){
        //Find the largest num
        int total =0;
        int max_num = arr_num[0];
        for (int i=0;i<arr_num.length;i++){
            if(arr_num[i]> max_num){
                max_num = arr_num[i];
            }
        }
        System.out.println("max_num is:" + max_num);
        //Find the Shortest num
        int min_num = arr_num[0];
        for (int i=0;i<arr_num.length;i++){
            if(arr_num[i] < min_num){
                min_num = arr_num[i];
            }
        }
        System.out.println("min_num is:" + min_num);
        for (int i=0;i<arr_num.length;i++){
            total = total + arr_num[i];

        }
        System.out.println("total is:" + total);

    }
    static void check_age(int age){
       if (age <18){
           System.out.println("Access denied.");
       }
       else {
           System.out.println("Access Granted");
       }
    }
    static int check_add(int n1, int n2){
        return n1 + n2;
    }
    static void my_full_name(String n1, String n2){
        String x = n1 +" "+ n2 ;
        System.out.println("Full name is: " + x);

    }
    public static void main(String[] args){
        //call the func
        my_func_call();
        //call the func with parameter
        String str_name[] = {"Chennai","Madurai","Tiruchirappalli","Kumbakonam"};
        my_string_func(str_name);
        int arr [] = {10,70,20,90,50,40};
        display_func(arr);
        check_age(15);
        check_age(25);
        int x = check_add(10,20);
        System.out.println("sum  is :" + x);
        my_full_name("Ashok","Kumar");


    }
}
