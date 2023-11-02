package Basic_java_program.Functions_Java;

public class Method_Overloading_pgm {
    static int my_func_call(int x, int y){
        return x+ y;
    }
    static double my_func_call(double x, double y){
        return x+ y;

    }
    static float my_func_call(float x, float y){
        return x+ y;

    }
    public static void main(String[] args){
        int a = my_func_call(10,20);
        double b = my_func_call(10.6,20.5);
        float c = my_func_call(10.6f,11.6f);
        System.out.println("Integer val: " + a);
        System.out.println("Double val: " + b);
        System.out.println("Float val: "+ c);


    }
}
