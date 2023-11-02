package Basic_java_program.File_Handle;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Read_file_with_scanner {
    public static void main(String[] args) throws FileNotFoundException {
        //File path
       String file_path = "C:\\sample.txt";
       //Pass the file path on File class
       File txt_file = new File(file_path);
            Scanner text = new Scanner(txt_file);
            int a_num = text.nextInt();
            System.out.println("A val is " + a_num);

            int b_num = text.nextInt();
            System.out.println("B val is " + b_num);
            while (text.hasNextLine()){
                   String text_output = text.nextLine();
                   System.out.println(text_output);
            }

            text.close();

    }
}
