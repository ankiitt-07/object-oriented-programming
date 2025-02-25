import java.util.ArrayList;

 class Cart {
    private final ArrayList<CartItem> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        items.add(item);
    }
    public void removeItem(CartItem item) {
        items.remove(item);
    }
    public double getTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

 class CartItem {
    private String itemName;
    private int quantity;
    private double price;

    public CartItem(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Cart cart = new Cart();

        CartItem cartItem1 = new CartItem("Blah", 10, 99.9);
        CartItem cartItem2 = new CartItem("Blue", 5, 99.9);
        CartItem cartItem3 = new CartItem("Black", 10, 199.9);

        cart.addItem(cartItem1);
        cart.addItem(cartItem2);
        cart.addItem(cartItem3);
        cart.removeItem(cartItem2);

        System.out.println(cart.getTotal());
    }
}
