package by.andervyd.while_and_do_while;

public class WhileExample {
    public static void main(String[] args) {

        int money = 100;
        while (money > 0) {
            System.out.println("Money: " + money + "$");
            money -= 10;
        }
        System.out.println("Money: " + money + "$");

        System.out.println("==================");

        int moreMoney = 1000;
        boolean isCheckMoney = true;
        while (isCheckMoney) {
            if (moreMoney == 510) {
                isCheckMoney = false;
            }
            System.out.println("Money: " + moreMoney + "$");
            moreMoney -= 10;
        }
        System.out.println("Money: " + moreMoney + "$");
    }
}
