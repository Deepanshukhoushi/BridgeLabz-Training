package Day_12.OOPS_Practice.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000.0, "Savings", "BR101");
        account.display();

        account.deposit(500.0);
        account.withdraw(300.0);
        account.withdraw(5000.0);
        account.deposit(-100.0);

        BankAccount badAccount = new BankAccount(-500.0, "Current", "BR202");
        badAccount.display();

        System.out.println("Account Type: " + account.accountType);
        System.out.println("Branch Code: " + account.branchCode);

        // account.balance = 99999; // COMPILE ERROR - private
    }
}
