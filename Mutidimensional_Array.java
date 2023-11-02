package Basic_java_program;

public class Mutidimensional_Array {
    public static void main (String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7,8} };
        System.out.println(myNumbers[0][0]);
        System.out.println(myNumbers[1][0]);
        int total=0;
        System.out.println('\n');
        for (int i = 0; i < myNumbers.length;i++){
            for(int j = 0;j < myNumbers[i].length; j++){
                total = total + myNumbers[i][j];
                System.out.println(myNumbers[i][j]);
            }
        }
        System.out.println("Total is :" + total);
    }
}
