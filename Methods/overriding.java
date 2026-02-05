package Methods;
class Animal
{
    void makeSound()
    {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal
{
     void makeSound()
     {
         System.out.println("Dog Barks");
     }
}
class Cat extends Animal
{ 
     void makeSound()
     {
         System.out.println("Cat meows");
     }
       
}
class Cow extends Animal
{
      void makeSound()
     {
         System.out.println("Cow moos");
     }
}

public class overriding {
    public static void main(String[] args) {
        Animal a;
        a=new Dog();
        a.makeSound();
         a=new Cat();
        a.makeSound();
         a=new Cow();
        a.makeSound();
    }
    
}
