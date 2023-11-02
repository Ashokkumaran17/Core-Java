package Basic_java_program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_IP_Address {
    public static void main(String[] args){
        String ip_addr = "10.41.45.21";
        String ip_pattern =("\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5]");
        String complete_ip_pattern =ip_pattern +"\\."+ip_pattern+"\\."+ip_pattern+"\\."+ip_pattern;
        //create pattern class
        Pattern ip_obj = Pattern.compile(complete_ip_pattern);
        //create matcher class
        Matcher ip_match_obj = ip_obj.matcher(ip_addr);
        boolean outp= ip_match_obj.matches();
        System.out.println(ip_match_obj.matches());
        if (outp == true){
            System.out.println("IP Address is valid");

        }else{
            System.out.println("IP Address is not valid");
        }

    }
}
