package Basic_java_program.OOPS_Concepts;
class MyBike{
    private String name;
    private int speed;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;

    }
    public int getSpeed(){
        return speed;
    }
    public void SetSpeed(int speed){
        this.speed = speed;
    }
}
public class Encapsualtion_pgm {
    public static void main(String[] args){
       MyBike myobj = new MyBike();
       myobj.setName("RX 100");
       myobj.SetSpeed(100);
       System.out.println("Name is  "+ myobj.getName());
       System.out.println("Max Speed is "+ myobj.getSpeed());
    }
}
