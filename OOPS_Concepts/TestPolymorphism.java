package Basic_java_program.OOPS_Concepts;
class Bike{
    void vehicle_name(String name){
        System.out.println("Vehicle name is: "+ name);
    }
}
class Splendor extends Bike {
    void run(){
        System.out.println("Splendor running at 60km");
    }
}

public class TestPolymorphism {
    public static  void main(String[] args){
        Splendor my_splendor = new Splendor();
        my_splendor.run();
        //Bike my_bike = my_splendor;
        Bike my_bike = new Splendor();
        my_bike.vehicle_name("pro+");

    }
}
