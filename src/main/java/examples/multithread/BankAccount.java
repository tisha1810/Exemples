package examples.multithread;


import java.util.Scanner;

public class BankAccount implements Runnable {

    private double balance = 1000.00;

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        if (validator(balance, amount)) {
            getMoney(amount);
            System.out.println("Operation complete, your balance: " + getBalance());
        } else {
            System.out.println("Operation corrupt, not enough costs!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void getMoney(double amount) {
        balance -= amount;
    }

    public boolean validator(double balance, double amount) {
        return !(balance < amount);
    }
}
