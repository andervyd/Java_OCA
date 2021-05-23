package by.andervyd.encapsulation_and_super_protected;

public class Human {
    private String name;
    private int age;
    final String sex;
    private boolean clever;

    public Human(String sex) {
        this.sex = sex;
    }

    public StringBuilder getName() {
        StringBuilder name = new StringBuilder(this.name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 ) {
            this.age = age;
        }
    }

    public boolean isClever() {
        return clever;
    }

    public void setClever(boolean clever) {
        this.clever = clever;
    }

    @Override
    public String toString() {
        return "Human | name: " + name
                + ", age: " + age
                + ", sex: " + sex;
    }
}


class Runner {
    public static void main(String[] args) {

        Human human = new Human("male");
        human.setName("Bob");
        human.setAge(32);

        System.out.println(human);
    }
}
