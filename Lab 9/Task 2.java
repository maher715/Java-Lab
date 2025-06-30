
public class TestBank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountHolder("Muhammad Nasrullah Hoque Maher");
        acc.setAccountNumber("9876543210");
        acc.setBalance(10,000.00);

        acc.displayAccountInfo();
    }
}

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
