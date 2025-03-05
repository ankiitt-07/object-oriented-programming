class Device{
    private int deviceId;
    private String status;

    public Device(int deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus(){
        System.out.println("Device id : "+deviceId);
        System.out.println("Status : "+status);
    }
}

class Thermostate extends Device{
    private String tempratureSetting;

    public Thermostate(int deviceId, String status,String tempratureSetting) {
        super(deviceId, status);
        this.tempratureSetting = tempratureSetting;
    }

    @Override
    public void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting : "+tempratureSetting);
    }

}
public class SmartHomeDevices {
    public static void main(String[] args) {
        Device device = new Thermostate(123, "Good", "Hot");
        device.displayStatus();
    }
}
