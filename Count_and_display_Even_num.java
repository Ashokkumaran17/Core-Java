package Basic_java_program;

public class Count_and_display_Even_num {
    public static void main(String[] args){
        System.out.println("Even num are: ");
        int total=0;
        int count=0;
        for (int i=1; i< 20; i++){
            if (i % 2 ==0){
                total += i;
                count+=1;
                System.out.println(i);
            }
        }
        System.out.println("Num of Even is "+ count);
        System.out.println("Total is "+ total);

    }
}
