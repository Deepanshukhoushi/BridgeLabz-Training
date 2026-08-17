package Day_12.OOPS_Practice.BankAccount;

public class BankAccount {

    private double balance;
    protected String accountType;
    String branchCode;

    public BankAccount(double initialBalance, String accountType, String branchCode) {
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
        this.accountType = accountType;
        this.branchCode = branchCode;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance = balance + amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal rejected.");
            return;
        }
        balance = balance - amount;
        System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
    }

    public void display() {
        System.out.println("Account Type: " + accountType + " | Branch: " + branchCode + " | Balance: " + balance);
    }
}
