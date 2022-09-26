package JavaAdvanced.ad06DefiningClasses.lab.P03BankAccount;

public class BankAccount {
    private static double interestRate = 0.02;
    private static int nextID = 1;

    private int id;
    private double balance;

    public BankAccount() {
        this.id = nextID;
        nextID++;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterestRate(int years) {
        return BankAccount.interestRate * years * this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getId() {
        return this.id;
    }
}
