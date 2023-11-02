package Basic_java_program.OOPS_Concepts;
class Cars{
    String car_name[] = {"Audi","Tata","Toyota","Hyundai","Mahindra","Suzuki"};
    int car_mileage[] = {48,58,60,70};
    int fuel_capacity[] = {50,100,150,200};
    int speed[] = {120,140,250,300};
    public void first_car_name(){
        System.out.println("car name is:" + car_name[0]);
        System.out.println("car Mileage is:" + car_mileage[2]);
        System.out.println("car Fuel capacity is:" + fuel_capacity[2]);
        System.out.println("car max speed is:" + fuel_capacity[3]);

    }
    void car_company(String name){
        System.out.println("Car company origin is : " + name);
    }


}
public class Class_method_object_2 {
    public static void main(String[] args){
        Cars obj = new Cars();
        obj.car_company("Japan");
        obj.first_car_name();

    }
}
