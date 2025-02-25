 class BankAccount {
    
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        }
        balance -= amount;
    }

}
public class SimulateAtm {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Anmol", "19920201", 9102.18);

        double currentBalance = bankAccount.getBalance();
        System.out.println(currentBalance);

        bankAccount.deposit(100);
        bankAccount.withdraw(5000);

        currentBalance = bankAccount.getBalance();
        System.out.println(currentBalance);
    }
}
