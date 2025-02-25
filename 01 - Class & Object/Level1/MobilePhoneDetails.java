import java.util.Scanner;

class MobilePhone{
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand,String model,double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return brand;
    }
    public void setModel(String model){
        this.model = model;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double Price){
        this.price = price;
    }

    public void diplayDetails(){
        System.out.println("--------Mobile Phone Details--------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println();
    }

}
public class MobilePhoneDetails {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("Apple", "iPhone 16", 68200.90);
        System.out.println();
        mobilePhone.diplayDetails();
    }
}
