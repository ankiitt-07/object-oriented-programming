import java.util.*;
class Circle{

    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
   
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){
        return  2*Math.PI*radius;
    }

}
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        int rad = sc.nextInt();

        Circle c = new Circle(rad);
        System.out.println("The area of the circle is " + c.getArea());
        System.out.println("The circumference of the circle is " + c.getCircumference());
        
    }
}
