class BankAccount{
    private String accountHolderName;
    protected double balance;

    static class SavingsAccount extends BankAccount{
        @Override
        void deposit(double amount){
            System.out.println("SavingsAccount deposit (overridden) called.");
            super.deposit(amount); // call parent implementation
        }
        double addInterest(){
            double interest = super.getBalance() * 0.05; // use super to access parent behavior
            super.setBalance(super.getBalance() + interest);
            return interest;
        }
    }

    static class CurrentAccount extends BankAccount{
        @Override
        void withdraw(double amount){
            System.out.println("CurrentAccount withdraw (overridden) called.");
            super.withdraw(amount); // call parent implementation
        }
        double serviceCharge(){
            double charge = 500.0;
            super.setBalance(super.getBalance() - charge);
            return charge;
        }
    }
    void deposit(double amount){ 
        if(amount>0){
            balance+=amount;
            System.out.println("Amount deposited: "+amount);
            } else{
                System.out.println("Invalid deposit amount.");
        }   
    }

    void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Amount withdrawn: "+amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    double getBalance(){
        return balance;
    }
    void setBalance(double balance){
        this.balance=balance;
    }
    String getAccountHolderName(){
        return accountHolderName;
    }
    void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
}
public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Choose account type: 1 for Savings, 2 for Current");
        int choice = sc.nextInt();
        BankAccount acc;
        if(choice == 1){
            acc = new BankAccount.SavingsAccount();
            System.out.println("Savings Account created.");
        } else {
            acc = new BankAccount.CurrentAccount();
            System.out.println("Current Account created.");
        }
         acc.setAccountHolderName("Chandan Gowda");
         acc.setBalance(20000.0);
         acc.deposit(500.0);

         acc.withdraw(200.0);
         System.out.println("Account holder name: "+acc.getAccountHolderName());
            System.out.println("Current balance: "+acc.getBalance());
        System.out.println("Final balance: "+acc.getBalance());
        sc.close();








    }
}