package Exception;

import java.util.Scanner;

class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String message)
    {
        super(message);
    }
}

public class BankAccount {

    double balance ;

    BankAccount(double initialBalance)
    {
        this.balance=initialBalance;
    }
    void withdrawl(double amount) throws InsufficientBalanceException
    {

        if(amount>balance)
        {
            throw new IllegalArgumentException("Insufficient balance for this withdrawl ");
        }
        if(amount<=0)  
        {
            throw new IllegalArgumentException("Withdrawl amount must be positive");
        }
        balance-=amount;
        System.out.println("Withdrawl successful.Remaining Balance:"+balance);
    }
    public double getBalance()
    {
        return  balance;
    }    
}
class BankTransaction 
{
    public static void main(String[] args) {
        BankAccount bank=new BankAccount(10000);
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter the withdrawl amount:");
        double amount=sc.nextDouble();
        bank.withdrawl(amount);
        }
        catch(IllegalArgumentException e){
            System.out.println("Error:"+e.getMessage());

        }
        catch(InsufficientBalanceException e){
            System.out.println("Error:"+e.getMessage());

        }
        catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }

        sc.close();
       
        
    }
}
