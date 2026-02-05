package Methods;
class Calculator
{  
    int add(int a,int b)
    {
         return a+ b;
    }
    double add(double a,double b)
    {
         return a + b;
    }
    int add(int a,int b,int c)
    {
         return a + b  +c;
    }
}


public class overloading {
    public static void main(String[] args) {
      Calculator calc=new Calculator();
       System.out.println("Sum of 2 integers: " + calc.add(10, 20));
       System.out.println("Sum of 2 doubles: " + calc.add(3.5, 4.0));
       System.out.println("Sum of 3 integers: " + calc.add(10, 20, 30));
    }
}
