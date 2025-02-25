class CarRental{

    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    CarRental(){
        this.customerName = "";
        this.carModel = "";
        this.rentalDays =0;
    }

    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCarModel(){
        return carModel;
    }
    public void setCarModel(String carModel){
        this.carModel = carModel;
    }

    public int getRentalDays(){
        return rentalDays;
    }
    public void setRentalDays(int rentalDays){
        this.rentalDays = rentalDays;
    }

    public double getTotalCost(){
        return totalCost;
    }
    public void setTotalCost(double totalCost){
        this.totalCost = totalCost;
    }

    CarRental(String customerName , String carModel,int rentalDays,double totalCost){
        setCustomerName(customerName);
        setCarModel(carModel);
        setRentalDays(rentalDays);
        setTotalCost(totalCost);
    }

    public double rentalCost(){
        return totalCost*rentalDays;
    }

    public void displayDetails(){
        System.out.println("--------Car Rental system--------");
        System.out.println("Customer Name : "+customerName);
        System.out.println("Car Model : "+carModel);
        System.out.println("Rental days : "+rentalDays);
        System.out.println("Rental Cost : "+rentalCost());
    }
}
public class CarRentalSystem {
    public static void main(String[] args) {
        CarRental car = new CarRental("Jerry", "Hurricane", 5 , 500.50);
        car.displayDetails();
    }
}
