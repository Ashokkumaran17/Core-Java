package Basic_java_program;

public class For_loop_continue_break {
    public static void main (String[] args) {
        int i = 1;
        for (i=1; i <=10; i++) {
            if (i == 7) {
                continue;
            }
            if (i == 9) {
                break;
            }
            System.out.println(i);

        }
    }
}
