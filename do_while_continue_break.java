package Basic_java_program;

public class do_while_continue_break {
    public static void main (String[] args) {
        int i = 1;
        int total = 0;
        do {
            if (i == 7) {
                i++;
                continue;

            }
            if (i == 9) {
                break;
            }
            total = total + i;
            System.out.println(i);
            i++;

        }
        while (i <= 10);
        System.out.println("total is: " + total);

    }
}
