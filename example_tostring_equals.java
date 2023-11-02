package Basic_java_program;
import java.io.*;
import java.lang.String;
public class example_tostring_equals {
    public static void main(String[] args){
        //example of tostring method
        String str_obj = new String("Hi,How Are you Ashok");
        System.out.println(str_obj.toString());
        //example of Equals method
        String text_a = new String("Welcome");
        String text_b = new String("Welcome");
        System.out.println("Using == operator"+ text_a + " == "+ text_b + " : " +(text_a == text_b));
        System.out.println("Using equals "+ text_a + " Equals "+ text_b + " : " +text_a.equals(text_b));
        //equalsIgnoreCase method
        String text_aa = new String("welcome");
        String text_bb = new String("Welcome");
        System.out.println("Using equalsIgnoreCase "+ text_aa + " Equals "+ text_bb + " : " +text_aa.equalsIgnoreCase(text_bb));

        //Compare method
        String text_aaa = new String("Welcome");
        String text_bbb = new String("Welcome");
        System.out.println("Using compare "+ text_aaa + " compare "+ text_bbb + " : " +text_aaa.compareTo(text_bbb));



    }
}
