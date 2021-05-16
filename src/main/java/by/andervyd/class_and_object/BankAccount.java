package by.andervyd.class_and_object;

public class BankAccount {
    int id;
    String name;
    double balance;

    public static void main(String[] args) {

        BankAccount premiumAccount = new BankAccount();
        BankAccount goldAccount = new BankAccount();

        premiumAccount.id = 1;
        premiumAccount.name = "Premium";
        premiumAccount.balance = 10_000;
        System.out.println("Premium account"
                + "\nId:      " + premiumAccount.id
                + "\nName:    " + premiumAccount.name
                + "\nBalance: " + premiumAccount.balance);

        goldAccount.id = 2;
        goldAccount.name = "Gold";
        goldAccount.balance = 1_000;
        System.out.println("\nGold account"
                + "\nId:      " + goldAccount.id
                + "\nName:    " + goldAccount.name
                + "\nBalance: " + goldAccount.balance);
    }
}
