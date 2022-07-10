public class Proton extends Car{
    //Declare all the field
    private String modelNumber;

    //Create the constructor
    public Proton(int sizeOfBody, String name, int speed,int totalWheel, int totalDoor, char typeOfGear, boolean handSteering, String modelNumber){
        super(sizeOfBody, name, speed,totalWheel,totalDoor,typeOfGear,handSteering); // From Vehicle and Car class
        this.modelNumber = modelNumber;
    }

    //Override the Car state into proton state
    @Override
    public void Is_handSteering(){
        if (super.gethandSteering() == true){
            System.out.println("Hand Steering is Online");
        } else {
            System.out.println("Hand Steering is Offline. Autonomous Online");
        }
    }
    @Override
    public void changingGear(){
        if (super.getTypeOfGear() == 'A'){
            System.out.println("Gear= D1");
        } else if (super.getTypeOfGear() == 'M'){
            System.out.println("Gear= 1");
        }
    }

    //Override the Vehicle state into proton state
    @Override
    public void move(int speed){
        changingGear();
        System.out.println("car move in current speed " + speed);
    }
    @Override
    public void stop(int speed){
        changingGear();
        System.out.println("car stop in current speed " + speed);
    }

}
