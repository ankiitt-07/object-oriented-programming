import java.util.List;
import java.util.ArrayList;

class Customer{
    private String name;
    private String address;
    private String phone;
    private final ArrayList<Order> orders;

    public Customer(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void placeOrder(Product[] products) {
        Order newOrder = new Order(this);
        for (Product p : products) {
            newOrder.addProduct(p);
        }
        orders.add(newOrder);
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Products: ");
        for (Order o : orders) {
            for (Product p : o.getProduct()){
                System.out.println(p.getProductName());
            }
        }
    }
}

class Order{
    private Customer customer;
    private final ArrayList<Product> product;

    public Order(Customer customer) {
        this.product = new ArrayList<>();
        this.customer = customer;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }
    public void addProduct(Product product) {
        this.product.add(product);
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

class Product{
    private String productName;
    private int productPrice;

    public Product(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}

public class EcommercePlateform {
    public static void main(String[] args) {
        Product p1 = new Product("P1", 100);
        Product p2 = new Product("P2", 200);
        Product p3 = new Product("P3", 300);

        Customer customer = new Customer("Harry", "NA", "990101");

        customer.placeOrder(new Product[] { p1, p3 });

        customer.displayDetails();
    }
}
