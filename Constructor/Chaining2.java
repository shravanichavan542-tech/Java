//Using super() keyword;
/*Create a base class Person with fields name and age, and a constructor to initialize them.
Create a subclass Employee with an additional field employeeId and use super() to call the base class constructor. */
package Constructor;

class Person
{
     String name;
     int age;
     Person(String name,int age)
     {
         this.name=name;
         this.age=age;
     }
     void displayPersonDetails()
     {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
     }
}
class Employee extends Person
{
    int emp_id;
    Employee(String name,int age,int emp_id)
    {
       super(name,age);
       this.emp_id=emp_id;
    }
    void displayEmployeeDetails() {
        displayPersonDetails(); // Call method from superclass
        System.out.println("Employee ID: " + emp_id);
    }
}

public class Chaining2 {
    
 public static void main(String[] args) {
        Employee emp = new Employee("Shravani", 25, 1011);
        System.out.println("\n--- Employee Details ---");
        emp.displayEmployeeDetails();
    }
    

    
}
