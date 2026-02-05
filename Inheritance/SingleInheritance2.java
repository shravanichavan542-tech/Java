/*Write a Java program to create a class called Shape with a method called getArea(). 
Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.*/
import java.util.*;
class Shape
{    
    int length,breadth,area;
  
    public void getDimensions()
    {  
       Scanner sc=new Scanner(System.in);  
       System.out.println("Enter Length and Breadth of the rectangle:");
       length=sc.nextInt();
       breadth=sc.nextInt();
    }
    public void getArea() {
        System.out.println("Area is undefined for generic shape.");
    }
}
class Rectangle extends Shape
{
    public void getArea()
    {
        area=length*breadth;
        System.out.println("Area of the rectangle:"+area);
           
    }
}
class SingleInheritance2
{
    public static void main(String args[])
    {
        Rectangle rec=new Rectangle();
        rec.getDimensions();
        rec.getArea();
    }
}