package Basic_java_program;

public class Array_pgm {
    public static void main (String[] args) {
        String Array[] = {"chennai","bangalore","pune","mumbai"};
        //length of array
        System.out.println("Array length is :" + Array.length);
        //length of the individual array
        System.out.println("Array[0] length is :" + Array[0].length());
        System.out.println("Array[1] length is :" + Array[1].length());
        System.out.println("Array[2] length is :" + Array[2].length());
        System.out.println("Array[3] length is :" + Array[3].length());
        //convert to uppercase
        System.out.println("Array[0]  :" + Array[0].toUpperCase());
        //Replace the last char
        System.out.println("Array[3]  :" + Array[3].replace('i','y'));
        //Replace first char
        System.out.println("Array[3]  :" + Array[3].replaceFirst(String.valueOf('m'),String.valueOf('B')));
        for (String i : Array) {
            System.out.println(i);
        }

    }

}
