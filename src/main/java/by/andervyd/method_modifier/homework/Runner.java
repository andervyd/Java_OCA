package by.andervyd.method_modifier.homework;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\n==== Swordfish ====");
        Swordfish swordfish = new Swordfish("Lacy");
        swordfish.eat();
        swordfish.swim();
        swordfish.sleep();

        System.out.println("\n==== Penguin ====");
        Speakable penguin = new Penguin("Lee");
        penguin.speak();

        System.out.println("\n==== Lion Simba ====");
        Animal lionA = new Lion("Simba");
        lionA.eat();
        lionA.sleep();

        System.out.println("\n==== Lion Gordy ====");
        Mammal lionM = new Lion("Gordy");
        lionM.run();
        lionM.eat();
        lionM.sleep();
        lionM.speak();
    }
}
