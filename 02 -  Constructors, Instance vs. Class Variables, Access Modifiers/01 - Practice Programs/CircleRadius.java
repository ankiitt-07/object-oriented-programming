class Circle{
    
    private double radius;

    Circle(){
        this(1.0);
    }

    Circle(double radius){
        setRadius(radius);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
}
public class CircleRadius {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getRadius());
        c.setRadius(10);
        System.out.println(c.getRadius());

    }
    
}
