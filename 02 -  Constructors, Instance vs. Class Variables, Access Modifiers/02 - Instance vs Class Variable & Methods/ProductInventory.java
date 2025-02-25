class Product{

    private String productName;
    private double productPrice;
    private static int totalProducts;

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public static int getTotalProducts() {
        return totalProducts;
    }
    public static void setTotalProducts(int totalProducts) {
        Product.totalProducts = totalProducts;
    }

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

}
public class ProductInventory {
    public static void main(String[] args) {
        Product p1 = new Product("P1", 15.9);
        Product p2 = new Product("P2", 24.9);

        p1.displayProductDetails();

        Product.displayTotalProducts();
    }
}
