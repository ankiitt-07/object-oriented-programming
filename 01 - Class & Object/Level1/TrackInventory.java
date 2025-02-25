import java.util.*;

class Items{
    private int itemCode;
    private String itemName;
    private double price;

    public Items(int itemCode , String itemName, double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public int getItemCode(){
        return itemCode;
    }
    public void setItemCode(int itemCode){
        this.itemCode = itemCode;
    }

    public String getItemName(){
        return itemName;
    }
    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public double getTotalCost(int quantity){
        return price*quantity;
    }

    public void details(){
        System.out.println("--------Item Details--------");
        System.out.println("Item code : "+itemCode);
        System.out.println("Item Name : "+itemName);
        System.out.println("Item Price : "+price);
        System.out.println();
    }
    
}
public class TrackInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Item Code : ");
        int item = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Item Name : ");
        String name = sc.nextLine();
        System.out.print("Enter the price : ");
        double price = sc.nextDouble();
        System.out.println();
        Items item1 = new Items(item, name, price);
        item1.details();
        System.out.println("The price of "+name+" for quantity 10 is "+item1.getTotalCost(10));
    }
}
