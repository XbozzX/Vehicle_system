public class Vehicle {
    //Declare all the field
    private int body;
    private int sizeOfBody;
    private String name;
    private int speed;

    //Create the constructor
    public Vehicle(int body, int sizeOfBody, String name, int speed){
        this.body = body;
        this.sizeOfBody = sizeOfBody;
        this.name = name;
        this.speed = speed;
    }

    //Create the Vehicle state
    public void move(int speed){
        System.out.println("move.called() " + speed);
    }
    public void stop(int speed){
        System.out.println("stop.called() " + speed);
    }
}
