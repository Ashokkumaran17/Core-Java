package Basic_java_program;

public class Array_Sum {
    public static  void  main(String[] args) {
        int total=0;
        int[] myNum = {10, 20, 30, 40,50};
        for (int i : myNum){
            total = total + i;
        }
        System.out.println("Total is:" + total);
    }
}
