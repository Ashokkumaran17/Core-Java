package Basic_java_program.OOPS_Concepts;

public class private_access_modifier {
    private int age = 33;
    private String name = "Kumar";
    public void display(){
        System.out.println("your name is "+ name +" and your age is "+ age);

    }
    public static void main(String[] args){
        private_access_modifier my_obj = new private_access_modifier();
        my_obj.display();
    }
}

