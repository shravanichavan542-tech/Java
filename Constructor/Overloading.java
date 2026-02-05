/*Create a Book class with the following fields: title, author, and price.
Implement:

A default constructor.

A constructor with only title and author.

A constructor with all three fields.
Demonstrate constructor overloading and print book details.*/


package Constructor;

 class Book
{
    String title,author;
    double price;

    Book()
    {
         title="unknown";
         author="unknown";
         price=0.0;   
    }
    Book(String title,String author)
    {
         this.title=title;
         this.author=author;
    }
   Book(String title,String author,double price)
    {
         this.title=title;
         this.author=author;
         this.price=price;
    }
  
    void displayDetails()
    {
        System.out.println("Book Details");
        System.out.println("Book Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);
        System.out.println();
    }
}
class Overloading
{
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("Wings of Fire","A.p.j abdul kalam");
        Book b3=new Book("Java","Joshua Bloch",250);
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();

    }
}