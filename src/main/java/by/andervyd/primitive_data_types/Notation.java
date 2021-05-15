package by.andervyd.primitive_data_types;

public class Notation {
    public static void main(String[] args) {

// HEX-16, DEC-10, OCT-8, BIN-2

        int decNumber = 60;          // Decimal
        int binNumber = 0b111100;    // Binary;       'b - B'
        int octNumber = 074;         // Octal
        int hexNumber = 0x3C;        // Hexadecimal;  'x - X' and 'c - C'

        System.out.println("BIN(2):  " + binNumber
                         + "\nOCT(8):  " + octNumber
                         + "\nDEC(10): " + decNumber
                         + "\nHEX(16): " + hexNumber);
/*      BIN(2):  60
        OCT(8):  60
        DEC(10): 60
        HEX(16): 60
*/
    }
}
