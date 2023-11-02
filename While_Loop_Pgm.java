package Basic_java_program;

public class While_Loop_Pgm {
    public static void main (String[] args) {
        int total = 0;
        int i = 1;
        while (i < 6) {
            total = total + i;
            i++;
        }
        System.out.println("total is:" + total);
    }
}
