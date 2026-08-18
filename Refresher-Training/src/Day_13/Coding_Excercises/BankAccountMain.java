package Day_13.Coding_Excercises;

class BankAccount {
    String accountHolder;
    double balance;

    BankAccount() {
        this("Unknown", 0);
    }


    BankAccount(String accountHolder) {
        this(accountHolder, 0);
    }

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    void display() {
        super.display();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount("Deepanshu");
        BankAccount acc3 = new BankAccount("Harsh", 5000);

        SavingsAccount savAcc = new SavingsAccount("Harshit", 10000, 5.5);

        acc1.display();
        System.out.println();
        acc2.display();
        System.out.println();
        acc3.display();
        System.out.println();
        savAcc.display();
    }
}
