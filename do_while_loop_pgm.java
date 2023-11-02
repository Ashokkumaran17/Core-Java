package Basic_java_program;

public class do_while_loop_pgm {
    public static void main (String[] args) {
        int i =1;
        int total = 0;
        do {
            total = total +i;
            i++;
        }
        while (i <= 10);
        System.out.println("total is: " + total);
    }
}
