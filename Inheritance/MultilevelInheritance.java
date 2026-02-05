/*Write a Java program to demonstrate Multilevel Inheritance by creating the following class hierarchy:
Class Person:
Data Members: name, age
Method: getDetails() – Accepts name and age from the user
Method: displayDetails() – Displays name and age
Class Employee (extends Person):
Data Members: employeeId, designation
Method: getEmployeeDetails() – Accepts employeeId and designation
Method: displayEmployeeDetails() – Displays employeeId and designation
Class Manager (extends Employee):
Data Member: department
Method: getManagerDetails() – Accepts department name
Method: displayManagerDetails() – Displays department name
In the main() method, create an object of the Manager class. Use it to accept and display all the details (Person → Employee → Manager) to demonstrate Multilevel Inheritance.*/

import java.util.*;

 class Person
{
   int age;
   String name;
   Scanner sc =new Scanner(System.in);
   void getDetails()
   {
   
    System.out.println("Enter Person Name:");
    name=sc.nextLine();
    System.out.println("Enter Age:");
    age=sc.nextInt();
   }
    void displayDetails()
   {
    
    System.out.println("Name:"+name);
    System.out.println("Age:"+age);
   }
}
class Employee extends Person
{
    int emp_id;
    String designation;
    public void getEmployeeDetails()
    {
        
        System.out.println("Enter Employee Id:");
        emp_id=sc.nextInt();
        System.out.println("Enter Employee Designation:");
        designation=sc.next();

    }
    public void displayEmployeeDetails()
    {
   
    System.out.println("Employee Id :"+emp_id);
    System.out.println("Designation:"+designation);
    }
}
class Manager extends Employee
{
  
    String department;
    public void getManagerDetails()
    {
        
        System.out.println("Enter Department Name:");
        department=sc.next();
        

    }
    public void displayManagerDetails()
    {
   
    System.out.println("Department Name:"+department);
    }
}

public class MultilevelInheritance {
    
    public static void main(String args[])
    {
        Manager obj =new Manager();
 8       obj.getDetails();
        obj.getEmployeeDetails();
        obj.getManagerDetails();
        System.out.println("-----------------------------------------------");
        obj.displayDetails();
        obj.displayEmployeeDetails();
        obj.displayManagerDetails();
    }
}
