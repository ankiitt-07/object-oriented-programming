class Order{
    private int orderId;
    private String orderDate;

    public Order(int orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void getOrderStatus(){
        System.out.println("Order Id : "+orderId);
        System.out.println("Order Date : "+orderDate);
    }
}

class ShippedOrder extends Order{
    private int trackingNumber;

    public ShippedOrder(int orderId, String orderDate, int trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Tracking Number : "+trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Delivery Date : "+deliveryDate);
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order shippedorder = new ShippedOrder(123, "4 March 2025", 143);
        Order deliveredOrder = new DeliveredOrder(123, "4 March 2025", 143, "5 March 2025");

       shippedorder.getOrderStatus();
       System.out.println();
       deliveredOrder.getOrderStatus();

    }
}
