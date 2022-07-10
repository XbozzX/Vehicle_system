public class Car extends Vehicle {
    //Create all the field
    private int totalWheel;
    private int totalDoor;
    private char typeOfGear;
    private boolean handSteering;

    //Create the constructor
    public Car(int sizeOfBody, String name, int speed, int totalWheel, int totalDoor, char typeOfGear, boolean handSteering){
        super(1, sizeOfBody, name, speed); // from Vehicle class
        this.totalWheel = totalWheel;
        this.totalDoor = totalDoor;
        this.typeOfGear = typeOfGear;
        this.handSteering = handSteering;
    }

    //Create the getter
    public boolean gethandSteering(){
        return this.handSteering;
    }
    public char getTypeOfGear(){
        return this.typeOfGear;
    }


    //Create the car state
    public void Is_handSteering(){
        System.out.println("Is_handSteering.called()");
    }

    public void changingGear(){
        System.out.println("changingGear.called()");
    }

}
