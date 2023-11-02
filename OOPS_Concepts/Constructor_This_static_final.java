package Basic_java_program.OOPS_Concepts;
class MyCars {
    //Can be accessed via an object
    public void Model(String country){
        //this.country = country;
        System.out.println("Country name is: " + country);
    }
    //Can be accessed without creating an object
    static void fuel_capacity(int ltr){
        System.out.println("Fuel Capacity is: " + ltr);
    }
    public void Car_name(String name){
        //this.name = name;
        System.out.println("Car name is: " + name);
    }
    public void Car_speed(int speed){
        //this(220);
        System.out.println("Car speed is: " +  speed +" km");
    }

}

public class Constructor_This_static_final {
    final int x = 10;
    final double PI= 3.14;
    public static void main(String[] args){
        MyCars obj = new MyCars();

        obj.Model("US");
        MyCars.fuel_capacity(150);
        obj.Car_name("Audi");
        obj.Car_speed(300);
        Constructor_This_static_final obj2 = new Constructor_This_static_final();
        System.out.println("x val before : "+ obj2.x);
        System.out.println("PI val before : "+ obj2.PI);




    }
}
