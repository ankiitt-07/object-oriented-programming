class BankAccount{

    public String accountNumber;
    protected String accountHolderName;
    private double balance;

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(){

    }
}

class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        setBalance(balance);
    }

    public void display() {
        System.out.println("--------Account Details--------");
        System.out.println("Savings Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + getBalance());
    }
}
public class BankAccountManagement {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("12345", "Jerry", 52410.7);

        acc.display();
    }
}
