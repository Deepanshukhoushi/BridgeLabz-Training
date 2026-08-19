package Day_13.Coding_Excercises;

class Account {
    private double balance;

    Account(double balance) {
        this.balance = balance;
    }

    protected double getBalance() {
        return balance;
    }
}

class CurrentAccount extends Account {
    CurrentAccount(double balance) {
        super(balance);
    }

    void show() {
        // System.out.println(balance); // COMPILE ERROR - balance is private
        System.out.println("Balance: " + getBalance());
    }
}

public class AccessModifierPractice {
    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount(5000.0);
        ca.show();
    }
}
