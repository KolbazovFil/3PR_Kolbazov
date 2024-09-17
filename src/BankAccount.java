public class BankAccount {
    private int accountNumber;
    private double balance;
    // Метод для получения номера счета
    public int getAccountNumber() {
        return accountNumber;
    }
    // метод получения номера счета
    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    // метод пополнения счета
    public void setBalance(double balance) {
        this.balance = balance;
    }
    // метод снятия средств
    public double getBalance() {
        return balance;
    }
}