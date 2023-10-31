package karthickjava;
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void displayOptions() {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() {
        int choice;
        do {
            displayOptions();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you,Have a Nice Day");
                    break;
                default:
                    System.out.println("Invalid choice, make it valid");
            }
        } while (choice != 4);
    }

    private void checkBalance() {
        System.out.println("Current Balance: Rs " + account.getBalance());
    }

    private void deposit() {
        System.out.print("Enter the deposit amount: Rs ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    private void withdraw() {
        System.out.print("Enter the withdrawal amount: Rs ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }
}

public class ATMMain {
    public static void main(String[] args) {
    	System.out.println("HELLO, WELCOME TO ATM!!");
    	System.out.println("CHOOSE YOUR CHOICE");
        BankAccount userAccount = new BankAccount(0); // Initialize with a balance of $1000
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
