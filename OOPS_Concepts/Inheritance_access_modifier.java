package Basic_java_program.OOPS_Concepts;
class Car{
    public void company(String car_name){
      System.out.println("Company name is: "+ car_name);
    }
    public void place(String company_place){
      System.out.println("Company place is: "+ company_place);
    }

}
//Car property is inheriting into vehicle
class Vehicle extends Car{
    protected int a =10;
    protected String name ="Ashok";
    //example of public access modifier.
    public void car_capacity(String capacity){
        System.out.println("Capacity is: "+ capacity);
    }
    //example of default access modifier
    void car_load_capacity(String load_capacity){
        System.out.println("Capacity is: "+ load_capacity);
    }
    //example of protected access modifier
    protected void car_tank_capacity(String tank_capacity){
        System.out.println("Capacity is: "+ tank_capacity);
    }
    //example of private access modifier
    private void car_engine_capacity(String engine_capacity){
        System.out.println("Capacity is: "+ engine_capacity);
    }


}
public class Inheritance_access_modifier {
    private int age_x = 33;
    private String name_x = "Kumar";
    public void display(){
        System.out.println("your name is "+ name_x +" and your age is "+ age_x);

    }
    public static void main(String[] args){

        //Access modifier:public, protected, default, private
        Car mycar = new Car();
        mycar.company("Audi");
        mycar.place("Chennai");

        //inherits
        Vehicle myvehicle = new Vehicle();
        myvehicle.company("Hyundai");
        myvehicle.place("Bangalore");
        myvehicle.car_capacity("4Sheet");

        //default access modifier
        myvehicle.car_load_capacity("500kg");
        //protected access modifier
        myvehicle.car_tank_capacity("500ltr");

        //Private access modifier
        Inheritance_access_modifier my_new_obj = new Inheritance_access_modifier();
        my_new_obj.display();


    }
}
