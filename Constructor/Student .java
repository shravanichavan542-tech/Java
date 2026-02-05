/*Create a Java program to model a 'Student' using constructors. The program should initialize student details using both default and parameterized constructors. Display the student information using a method."
🔹 Requirements:
Create a class Student with the following fields:
int id
String name double percentage
Implement the following constructors:
Default constructor: Sets default values to fields (e.g., id = 0, name = "Unknown", percentage = 0.0).
Parameterized constructor: Accepts id, name, and percentage as parameters.
Include a method displayDetails() that prints the student’s information.
In the main method:
Create one object using the default constructor.
Create another object using the parameterized constructor.  Call displayDetails() for both objects.*/ 

package Constructor;
class Student {
    int id;
    String name;
    double percentage;

    // Default Constructor
    Student() {
        id = 0;
        name = "Unknown";
        percentage = 0.0;
    }

    // Parameterized Constructor
    Student(int id, String name, double percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name of the student: " + name);
        System.out.println("Id: " + id);
        System.out.println("Percentage: " + percentage);
        System.out.println("---------------------------");
       
    }
}

 class TestStudent  
 { 
    public static void main(String[] args) {
        Student s1 = new Student(); // Default constructor
        s1.displayDetails();
        Student s2 = new Student(101, "Shravani", 88.0); // Parameterized constructor
        s2.displayDetails();
    }
}
