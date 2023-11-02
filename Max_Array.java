package Basic_java_program;

public class Max_Array {
    public static  void  main(String[] args) {
        int[] myNum = {10, 180, 50, 140, 20, 160, 30};
        int max_arr = myNum[0];
        for (int i = 1; i< myNum.length;i++) {
            if (myNum[i]> max_arr) {
                max_arr = myNum[i];

            }

        }
        System.out.println("Max num is:" + max_arr);
    }
}
