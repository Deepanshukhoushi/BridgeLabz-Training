package Day_12.OOPS_Practice.BankAccountExternal;

import Day_12.OOPS_Practice.BankAccount.BankAccount;

public class ExternalAccessDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(2000.0, "Savings", "BR303");

        account.display();
        account.deposit(200.0);
        account.withdraw(100.0);

        System.out.println("Balance via getter: " + account.getBalance());

        // account.balance = 9999;    // COMPILE ERROR - private
        // account.accountType = "X"; // COMPILE ERROR - protected, different package
        // account.branchCode = "X";  // COMPILE ERROR - default, different package
    }
}
