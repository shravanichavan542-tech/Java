/* "Create a class BankAccount to model a simple bank account using constructors. Implement both a default constructor and a parameterized constructor. Include methods to display account information and to deposit and withdraw money."
Requirements:
Create a class BankAccount with the following fields:
String accountHolderName
long accountNumber
double balance
Define:
A default constructor that sets default values ("Unknown", 0, 0.0)
A parameterized constructor that initializes all values
Implement methods:
displayAccountDetails() — to print all account info
deposit(double amount) — adds money to the balance
withdraw(double amount) — deducts money if balance is sufficient
In the main method (e.g., in a class named TestBank), create objects using both constructors and perform transactions.*/

package Constructor;

public class BankAccount 
{
   String accountHolderName;
   long accountNumber;
   double balance;
   BankAccount()
   {
    accountHolderName="unknown";
    accountNumber=0;
    balance=0.0;
   }
   BankAccount(String accountHolderName,long accountNumber,double balance)
   {
      this.accountHolderName=accountHolderName;
      this.accountNumber=accountNumber;
      this.balance=balance;
   } 
   void displayAccountDetails()
   {
    
    System.out.println("Account Holder Name:"+accountHolderName);
    System.out.println("Account Number:"+accountNumber);
    System.out.println("Account Balance:"+balance);
   }
}
class TestBank
{
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        BankAccount b2=new BankAccount("Shravani",101,20000);
        System.out.println("-----------------ACCOUNT-DETAILS---------------");
        b1.displayAccountDetails();
        System.out.println("----------------------");
        b2.displayAccountDetails();
    }
}

