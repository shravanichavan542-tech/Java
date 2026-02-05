/*Create a Vehicle class with fields brand, model, and year.
Use constructor chaining (i.e., use this()) to initialize objects using multiple constructors:
One constructor should initialize only brand.
Another should initialize brand and model.The final one should initialize all three.
Print all details using a method.*/
package Constructor;

class Vehicle
{
    
    String brand;
    String model;
    int year;
    Vehicle(String brand)
    {
        this(brand,"unknown",0);
    }
    Vehicle(String brand,String model)
    {
        this(brand,model,0);
    }
      Vehicle(String brand,String model,int year)
    {
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    void displayDetails()
    {
        System.out.println("----Vehicle Details----");
        System.out.println("Vehicle Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Year:"+year);
        System.out.println();
    }

}

public class Chaining {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle("Toyota");
        Vehicle v2=new Vehicle("Honda","Civic");
        Vehicle v3=new Vehicle("Ford","Mustang",2022);
        v1.displayDetails();
        v2.displayDetails();
        v3.displayDetails();

    }
}
