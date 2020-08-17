/*Create the following class as stated:

A class called circle is designed as shown in the following class diagram. It contains:
• Two private instance variables: radius (of the type double) and color (of the type
String), with default value of 1.0 and "red", respectively.
• Two overloaded constructors - a default constructor with no argument, and a
constructor which takes a double argument for radius.
• Two public methods: getRadius() and getArea(), which return the radius and area of
this instance, respectively.*/

import java.util.Scanner;
class Circle {
   
    private final double radius;
    private final String color;
    
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    
    public double getRadius() 
    {
        return radius;
    }
   
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
public class CircleA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Circle c1 = new Circle();
        System.out.println("circle's radius "+ c1.getRadius() + " and area " + c1.getArea());
        System.out.println("Enter the radius");
        double r1= sc.nextDouble();
        Circle c2 = new Circle(r1);
        System.out.println("circle's radius"+ c2.getRadius() + " and area " + c2.getArea());
    }
}
