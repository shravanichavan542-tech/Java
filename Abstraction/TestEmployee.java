package Abstraction;



abstract class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract double calculatesalary();

    void displayInfo() {
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);  // Call superclass constructor
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculatesalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hoursWorked, ratePerHour;

    PartTimeEmployee(int id, String name, double hoursWorked, double ratePerHour) {
        super(id, name);  // Call superclass constructor
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculatesalary() {
        return hoursWorked * ratePerHour;
    }
}

 class TestEmployee {
    public static void main(String[] args) {
        FullTimeEmployee fl = new FullTimeEmployee(101, "Shravani", 50000);
        PartTimeEmployee pl = new PartTimeEmployee(102, "Aarya", 120, 200);

        System.out.println("Full-Time Employee:");
        fl.displayInfo();
        System.out.println("Salary: " + fl.calculatesalary());
        System.out.println();

        System.out.println("Part-Time Employee:");
        pl.displayInfo();
        System.out.println("Salary: " + pl.calculatesalary());
    }
}

