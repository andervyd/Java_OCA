package by.andervyd.string_all;

public class Poem {
    public static void main(String[] args) {

        String poem = new String("Some say the world will end in fire, Some say in ice." +
                "From what I have tasted of desire I hold with those who favour fire." +
                "But if it had to perish twice, I think I know enough of hate To say that for destruction ice" +
                "Is also great And would suffice.");
        String copyPoem = poem.toUpperCase();

        char letterOne;
        char letterTwo;

        for (int i = 0; i < poem.length(); i++) {
            letterOne = poem.charAt(i);
            letterTwo = copyPoem.charAt(i);
            if (letterOne != ',' && letterOne != '.' && letterOne != ' ' && letterOne == letterTwo) {
                System.out.println();
                System.out.print(letterOne);
                continue;
            }
            System.out.print(letterOne);
        }
    }
}
