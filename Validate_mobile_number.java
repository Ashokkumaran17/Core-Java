package Basic_java_program;
import java.io.*;
import java.util.regex.*;
public class Validate_mobile_number {
    public static void main(String[] args){
        String mobile_num = "9900887711";
        String mobile_pattern ="^\\d{10}$";
        //create pattern class
        Pattern comp_obj = Pattern.compile(mobile_pattern);
        //create Match class
        Matcher mat_obj = comp_obj.matcher(mobile_num);
        if (mat_obj.equals(mobile_num)){
            System.out.println("mobile num is matched");

        }else{
            System.out.println("mobile num is not matched");
        }

    }
}
