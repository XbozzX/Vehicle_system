public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(0,0,"Vehicle",0);
        vehicle.move(10);
        vehicle.stop(0);

        Car car = new Car(10,"Car",0,4,4,'M', true);
        System.out.println(car.getTypeOfGear());
        car.changingGear();
        car.Is_handSteering();

        Proton proton = new Proton(50,"Saga",0,4,4,'M',true,"A1");
        proton.Is_handSteering();
        System.out.println(proton.getTypeOfGear());
        proton.changingGear();
        proton.move(20);


    }
}