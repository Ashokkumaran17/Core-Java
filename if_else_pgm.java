package Basic_java_program;

public class if_else_pgm {
    public static  void  main(String[] args){
        int i = 1;
        int amount = 30;
        if (amount < 50) {
            System.out.println("It is true");

        } else if (amount == 50) {
            System.out.println("It is true");
        }else {
            System.out.println("It is false");
        }


        int total =0;
        for (i=1;i <=10; i++){
            if (i == 6) {
                break;
            }
            else {
                if (i == 4) {
                    continue;
                }
                total = total + i;
                System.out.println(i);

            }
        }
        System.out.println("total is: " + total);
    }
}
