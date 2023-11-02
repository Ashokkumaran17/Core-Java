package Basic_java_program.OOPS_Concepts;
class MyCar{
    void company_name(String name){
        System.out.println("company name is: " + name);
    }
}
class Polymorphism_pgm extends MyCar{
    void country_name(String country){
        System.out.println("Country name is: "+ country);
    }
    public static void main(String[] args){
        MyCar my_car = new Polymorphism_pgm();
         my_car.company_name("Audi");


    }
}
