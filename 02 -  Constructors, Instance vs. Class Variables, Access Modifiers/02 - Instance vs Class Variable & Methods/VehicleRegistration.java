class Vehicle{

    private String ownerName;
    private String vehicleType;
    private static double registrationFee;

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public static double getRegistrationFee() {
        return registrationFee;
    }
    public static void setRegistrationFee(double registrationFee) {
        Vehicle.registrationFee = registrationFee;
    }

    public Vehicle(String ownerName, String vehicleType) {
        setOwnerName(ownerName);
        setVehicleType(vehicleType);
    }

    public void displayVehicleDetails(){
       
        System.out.println("Owner: " + getOwnerName());
        System.out.println("Vehicle Type: " + getVehicleType());
        System.out.println("Registration Fee: " + getRegistrationFee());
        System.out.println();
    }

    public static void updateRegistrationFee(double newRegistrationFee){
        setRegistrationFee(newRegistrationFee);
    }
}
public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle.setRegistrationFee(17052.90);

        Vehicle v1 = new Vehicle("Jerry", "audi r6");

        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(28545.70);
        v1.displayVehicleDetails();
    }
}
