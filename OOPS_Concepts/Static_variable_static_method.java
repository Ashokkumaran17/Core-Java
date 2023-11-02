package Basic_java_program.OOPS_Concepts;
class Student{
    public String name;
    public static String studentClass;
    public void display_user_name(){
        System.out.println(name + " is Enrolled " + Student.studentClass);
        System.out.println("Display name1: " + name);
    }
    public static void info(){
        //We can access the static variable inside the static method
        System.out.println("Topi is "+ Student.studentClass);
        //We cannot access the variable inside the static method
        //System.out.println("Display name: " + name);
    }

}
public class Static_variable_static_method {
    public static void main(String[] args){
        Student.studentClass ="Java Selenium Advanced";
        System.out.println(Student.studentClass);
        Student stud1 = new Student();
        Student stud2 = new Student();
        stud1.name = "Ashok";
        stud2.name = "Kumar";
        System.out.println(stud1.name);
        System.out.println(stud2.name);
        stud1.display_user_name();

        stud1.info();


    }
}
