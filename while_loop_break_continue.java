package Basic_java_program;

public class while_loop_break_continue {
    public static void main (String[] args) {
        int i = 1;
        int total = 0;
        while (i <= 10) {
            if (i == 7){
                i++;
                continue;

            }
            if (i == 9){
                break;
            }
            total = total  + i;
            System.out.println(i);
            i++;

        }
        System.out.println("total is: " + total);

    }
}
