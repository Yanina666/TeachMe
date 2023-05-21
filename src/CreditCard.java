import java.util.Scanner;

public class CreditCard {
   private String account;
   private double balance;


    Scanner enter = new Scanner(System.in);

//    public String getAccount() {
//        return account;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//

    public void setAccount(String account) {
        this.account = account;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    void getCardInfo()
    {
        System.out.println("Your account number is: " +  account);
        System.out.println("Your account balance is: " + balance);
    }

    public void refillSomeMoney() {
        System.out.println("How much do you refill: ");
        double a = enter.nextDouble();
        System.out.println("Your balance after operation: " + (balance + a));
    }

    public void withdrawSomeMoney()
    {
        System.out.println("How much do you withdraw: ");
        double a = enter.nextDouble();
        System.out.println("Your balance after operation: " + (balance - a));
    }
}
