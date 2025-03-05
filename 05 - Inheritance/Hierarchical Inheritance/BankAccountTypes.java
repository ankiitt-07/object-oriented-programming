class BankAccount{
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountType() {
        System.out.println("General Bank Account");
    }

    public void displayDetails(){
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Balance : "+balance);
    }

}

class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType(){
        System.out.println("Account Type : Savings Account ");
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Interest Rate : "+interestRate);
    }
    
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit; 

    public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit + " per day");
    }
}

class FixedDepositAccount extends BankAccount {
    private int depositTerm; 

    public FixedDepositAccount(int accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}
public class BankAccountTypes {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(12345, 5000, 3.5);
        BankAccount checking = new CheckingAccount(67890, 3000, 1000);
        BankAccount fixedDeposit = new FixedDepositAccount(54321, 10000, 12);

        savings.displayAccountType();
        savings.displayDetails();
        System.out.println();

        checking.displayAccountType();
        checking.displayDetails();
        System.out.println();
        
        fixedDeposit.displayAccountType();
        fixedDeposit.displayDetails();
    }
}
