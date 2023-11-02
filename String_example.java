package Basic_java_program;

class Sample_StringBuilder{
    public void Simple_concat(){
        String str_name = "Hello Ashok ";
        str_name += "Welcome to ";
        str_name += "Java";
        System.out.println(str_name);
    }
    public void Simple_tostring(int id ,String st_name){
        System.out.println("Emp ID is "+ id +" Full Name is "+ st_name);
    }


}


public class String_example {
    public static void main(String[] args) {
        byte ascii[] = { 69, 70,71,72 };
        String text = "Welcome";
        String blank = " ";
        String a_text = "to";
        String a_word = "Java Program";
        System.out.println("String name:" + text + blank + a_text + blank + a_word);
        String first_str = new String(ascii,0,2);
        System.out.println("first_String:" + first_str);

        //simple concat
        Sample_StringBuilder my_obj = new Sample_StringBuilder();
        my_obj.Simple_concat();
        //String Builder concepts
        StringBuilder obj = new StringBuilder();
        obj.append("Hello Ashok");
        obj.append(" Welcome to ");
        obj.append("Python");
        //System.out.println(obj);

        //To get Actual string
        String my_text = obj.toString();
        System.out.println(my_text);

        my_obj.Simple_tostring(101,"Ashok");


    }
}
