package Basic_java_program.OOPS_Concepts;
//create a class
class MyClass {

    int age;
    String name ;
    //create a Method
    public void display_the_message(){
        System.out.println("My Name is "+ name +" and my Age is "+ age);
    }
    //create a method with return
    public int show_value(int n1, int n2){
        return n1 + n2 ;
    }
    public void welcome(String name){
        System.out.println("Hi, Welcome to " + name);

    }
}
public class Class_method_object {

    public static void main(String[] args){
        //create object
        MyClass obj = new MyClass();
        obj.name = "Ashok Kumar";
        obj.age = 32;
        obj.display_the_message();
        int x= obj.show_value(12,10);
        System.out.println("total is: "+ x);
        obj.welcome("Java");

    }
}
