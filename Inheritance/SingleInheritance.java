import java.util.*;
class A
{
     void display_A()
     {
        System.out.println("display_A method of class A");
     }
}
class B extends A
{
    void display_B()
    {
        System.out.println("display_B method of class B");
    }
}
class SingleInheritance
{
    public static void main(String args[])
    {
        B obj=new B();
        obj.display_A();
        obj.display_B();
    }
}