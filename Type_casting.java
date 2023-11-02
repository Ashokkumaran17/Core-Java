package Basic_java_program;

public class Type_casting {
    public static  void  main(String[] args){
        //Narrow Typecast
        //byte -->short-->char-->int-->long-->float-->double
        byte a_byte =127;
        int a_int= (int)(a_byte);
        short a_short = 10;
        float a_float = (float)(a_short);
        System.out.println("a_int :" + a_int);
        System.out.println("a_float:" + a_float);
        //Wide Typecast
        //double-->float-->long-->int-->char-->short-->byte
        double a_double = 8.98d;
        int aa_int = (int)a_double;
        System.out.println("a_double :" + a_double);
        System.out.println("aa_int :" + aa_int);


    }


}
