public class Main {
    public static void main(String[] args) {
        Account acc = new Account(100);
        acc.deposit(50);
        System.out.println("Balance: " + acc.getBalance());
    }
}
