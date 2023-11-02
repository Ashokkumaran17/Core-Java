package Basic_java_program.OOPS_Concepts;

class pgm_Language{
    public void scripting_pgm(){
        System.out.println("Scripting language is Java script");
    }
}
//Another example using interface
interface conv_flow{
    public void user_name();
}

public class Anonymous_class_pgm {
    public static void main(String[] args){
        pgm_Language my_lan = new pgm_Language(){
        @Override
        public void scripting_pgm(){
            System.out.println("Scripting language is Python script");
        }
        };
        my_lan.scripting_pgm();

        //create the object  user interface
        conv_flow my_obj = new conv_flow() {
            @Override
            public void user_name() {
                System.out.println("User name is Ashok");
            }
        };
        my_obj.user_name();



    }
}
