package by.andervyd.polymorphism_and_instance_of.homework;

public class Runner {
    public static void main(String[] args) {

        Animal[] animals =
                {new Lion("Symba"), new Penguin("Lee"), new Swordfish("Swong")};

        for (Animal animal : animals) {
            if (animal instanceof Lion) {
                System.out.println("\n==== Lion ====");
                animal.eat();
                animal.sleep();
                ((Lion) animal).run();
                ((Lion) animal).speak();
            } else if (animal instanceof Penguin) {
                System.out.println("\n==== Penguin ====");
                animal.sleep();
                animal.eat();
                ((Penguin) animal).speak();
                ((Penguin) animal).fly();
            } else if (animal instanceof Swordfish) {
                System.out.println("\n==== Swordfish ====");
                animal.eat();
                animal.sleep();
                ((Swordfish) animal).swim();
            }
        }

        System.out.println("\n==================");

        Speakable[] speakables =
                {new Penguin("Lee"), new Lion("Symba")};

        for (Speakable speakable : speakables) {
            if (speakable instanceof Penguin) {
                System.out.println("\n==== Penguin ====");
                speakable.speak();
                ((Penguin) speakable).eat();
                ((Penguin) speakable).sleep();
                ((Penguin) speakable).fly();
            } else if (speakable instanceof Lion) {
                System.out.println("\n==== Lion ====");
                speakable.speak();
                ((Lion) speakable).sleep();
                ((Lion) speakable).eat();
                ((Lion) speakable).run();
            }
        }
    }
}
