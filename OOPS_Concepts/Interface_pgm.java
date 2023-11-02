package Basic_java_program.OOPS_Concepts;
interface Area{
    void show_area(int a);
    void show_cube(int a);
}
class Cube implements Area{
    public void show_area(int a){
        System.out.println("Area is "+ a*a);
    }
    public void show_cube(int a){
        System.out.println("Cube is "+ a*a*a);
    }
}
public class Interface_pgm {
    public static void main(String[] args){
        Cube obj = new Cube();
        obj.show_area(2);
        obj.show_cube(4);

    }
}
