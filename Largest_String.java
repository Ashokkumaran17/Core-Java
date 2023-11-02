package Basic_java_program;
import java.lang.String;
public class Largest_String {
    public static  void  main(String[] args) {
        String a_str[] = {"Mumbai","Chennai","Bangalore","Tiruchirappalli","Coimbatore"};
        String max_str = a_str[0];
        for (int i = 1; i < a_str.length;i++) {
            if (a_str[i].length() > max_str.length()) {
                max_str = a_str[i];
            }

        }
        System.out.println("Max_string is:" + max_str);
        System.out.println("Length of the Max_string is:" + max_str.length());

        //Reverse the string
        String rev_str = "";
        for (int i =0; i < max_str.length();i++) {
            rev_str = max_str.charAt(i) + rev_str;

        }
        System.out.println("Rev_string is:" + rev_str);
    }
}
