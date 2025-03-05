import java.util.ArrayList;

class Vehicle{
    private int maxSpeed;
    private String fuelType;

    public Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo(){
        System.out.println("Max Speed : "+maxSpeed);
        System.out.println("FuelType : "+fuelType);
    }
}

class Car extends Vehicle{
    private int seatCapacity;
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
            super(maxSpeed, fuelType);
            this.seatCapacity = seatCapacity;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity : "+seatCapacity);
        System.out.println();
    }
    
}

class Truck extends Vehicle{
    private int maxLoad;

    public Truck(int maxSpeed, String fuelType,int maxLoad) {
        super(maxSpeed, fuelType);
        this.maxLoad =maxLoad;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Max Load : "+maxLoad);
        System.out.println();
    }

}

class Motorcycle extends Vehicle{
    private String bikeType;

    public Motorcycle(int maxSpeed, String fuelType, String bikeType) {
        super(maxSpeed, fuelType);
        this.bikeType = bikeType;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bike Type : "+bikeType);
        System.out.println();
    }
    
}
public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        Vehicle car = new Car(20, "Diesel", 4);
        Vehicle truck = new Truck(25, "Diesel", 300);
        Vehicle motorCycle = new Motorcycle(120, "Petrol", "Racing");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(motorCycle);

        for(Vehicle vehicle : vehicles){
            vehicle.displayInfo();
        }
    }
}
