package multithread;

public class Runner {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Thread threadOne = new Thread(bankAccount);
        System.out.println("Input amount:");
        Thread threadTwo = new Thread(bankAccount);
        threadOne.start();
        threadTwo.start();
    }
}
