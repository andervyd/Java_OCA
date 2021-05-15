package by.andervyd.primitive_data_types;

public class PrimitiveTypes {
    public static void main(String[] args) {

// NUMERIC:
        byte byteType = 5;
        short shortType = 455;
        int	intType = 3_000;         // add underscore '_'
        long longType = 5000L;	     // add "L" or "l"
        float floatType = 2.56f;     // add "f" or "F"
        double doubleType = 3.14;

// BOOLEAN:
        boolean booleanType = true;  // true or false

// CHARACTER:
        char charTypeLetter = 'A';
        char charTypeNumber = 65;   // ASCII values (65 => A)

        System.out.println("NUMERIC:"
                + "\n byteType: " + byteType
                + "\n shortType: " + shortType
                + "\n intType: " + intType
                + "\n longType: " + longType
                + "\n floatType: " + floatType
                + "\n doubleType: " + doubleType);

        System.out.println("\nBOOLEAN:"
                + "\n booleanType: " + booleanType);

        System.out.println("\nCHARACTER:"
                + "\n charTypeLetter : " + charTypeLetter
                + "\n charTypeNumber: " + charTypeNumber);
    }
}
