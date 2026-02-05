/*Title: Employee Management System using Hierarchical Inheritance
Objective:
Create a Java program that models different types of employees in a company using hierarchical inheritance. The base class should contain common attributes, and subclasses should define specific attributes and behavior.
 Requirements:
Create a base class Employee with the following:
Fields: name, id
Method: displayDetails() to display basic employee info.
Create subclasses that inherit from Employee:
FullTimeEmployee: with an additional field salary, and a method to calculate annual salary.
PartTimeEmployee: with additional fields hourlyRate and hoursWorked, and a method to calculate total pay.
Intern: with additional field stipend, and method to display intern details.
Each subclass should override displayDetails() to include its specific information.*/

// Title: Employee Management System using Hierarchical Inheritance

// No need for Scanner since data is hardcoded

// Base class
class Employee {
    int emp_id;
    String emp_name;

    Employee(String emp_name, int emp_id) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee ID: " + emp_id);
    }
}

// Subclass 1
class FullTimeEmployee extends Employee {
    long salary;

    FullTimeEmployee(String emp_name, int emp_id, long salary) {
        super(emp_name, emp_id);
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();  // Display name and ID from base class
        System.out.println("Salary: " + salary);
        System.out.println("Annual Salary: " + (salary * 12));
        System.out.println();
    }
}

// Subclass 2
class PartTimeEmployee extends Employee {
    int hourlyRate, hoursWorked;

    PartTimeEmployee(String emp_name, int emp_id, int hourlyRate, int hoursWorked) {
        super(emp_name, emp_id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();  // Display name and ID from base class
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Pay: " + (hourlyRate * hoursWorked));
        System.out.println();
    }
}

// Subclass 3
class Intern extends Employee {
    long stipend;

    Intern(String emp_name, int emp_id, long stipend) {
        super(emp_name, emp_id);
        this.stipend = stipend;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();  // Display name and ID from base class
        System.out.println("Stipend: " + stipend);
        System.out.println();
    }
}

// Main class
public class HierarchicalInheritance {
    public static void main(String[] args) {
        FullTimeEmployee fl = new FullTimeEmployee("Shravani", 2325, 90000);
        PartTimeEmployee pl = new PartTimeEmployee("Saksham", 23250, 200, 60);
        Intern it = new Intern("Aarya", 2323, 10000);

        System.out.println("Full-Time Employee Details:");
        fl.displayDetails();

        System.out.println("Part-Time Employee Details:");
        pl.displayDetails();

        System.out.println("Intern Details:");
        it.displayDetails();
    }
}
