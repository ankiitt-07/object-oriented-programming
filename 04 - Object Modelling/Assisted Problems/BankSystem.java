import java.util.ArrayList;

class Bank {
    private String name;
    private ArrayList<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(Customer customer, double initialBalance) {
        Account newAccount = new Account(this, customer, initialBalance);
        accounts.add(newAccount);
        customer.addAccount(newAccount);
        System.out.println("Account opened for " + customer.getName() + " at " + name + " with balance: " + initialBalance);
    }

    public String getName() {
        return name;
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account account : accounts) {
            System.out.println("Bank: " + account.getBank().getName() + ", Balance: " + account.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

class Account {
    private Bank bank;
    private Customer customer;
    private double balance;

    public Account(Bank bank, Customer customer, double balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Bank bank1 = new Bank("State Bank");
        Bank bank2 = new Bank("National Bank");

        Customer customer1 = new Customer("Jerry");
        Customer customer2 = new Customer("Ankit");

        bank1.openAccount(customer1, 5000);
        bank2.openAccount(customer1, 3000);
        bank1.openAccount(customer2, 7000);

        System.out.println();
        customer1.viewBalance();
        System.out.println();
        customer2.viewBalance();
    }
}
