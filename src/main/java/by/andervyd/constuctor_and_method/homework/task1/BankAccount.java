package by.andervyd.constuctor_and_method.homework.task1;

public class BankAccount {
    int id;
    String firstName;
    String lastName;
    String cardName;
    double balance;

    public BankAccount(int id, String firstName, String lastName, String cardName, double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardName = cardName;
        this.balance = balance;
    }

    void increaseInBalance(double money) {
        System.out.println("\nBalance: " + balance + "$");
        System.out.println("Replenishment for the amount: " + money + "$");
        balance += money;
        System.out.println("New balance: " + balance + "$");
    }

    void decreaseInBalance(double money) {
        System.out.println("\nBalance: " + balance + "$");
        System.out.println("Withdrawal for the amount: " + money + "$");
        balance -= money;
        System.out.println("New balance: " + balance + "$");
    }

    void showInfo() {
        System.out.println("id: " + id + ", name: " + firstName + " " + lastName
                + ", card name: " + cardName + ", balance: " + balance + "$");
    }
}

class BankAccountTest {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1, "Chen", "Lee", "visa gold", 2300);
        account.showInfo();

        account.increaseInBalance(700);
        System.out.println("----------------");
        account.decreaseInBalance(500);
    }
}
