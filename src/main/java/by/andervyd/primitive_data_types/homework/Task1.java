package by.andervyd.primitive_data_types.homework;

public class Task1 {
    public static void main(String[] args) {

        byte binByte = 0b1100;
        byte octByte = 014;
        byte decByte = 12;
        byte hexByte = 0xC;

        System.out.println(binByte + " " + octByte + " " + decByte + " " + hexByte);

        short binShort = -0b10100010100;
        short octShort = -02424;
        short decShort = -1300;
        short hexShort = -0x514;

        System.out.println(binShort + " " + octShort + " " + decShort + " " + hexShort);

        int binInt = 0b000000;
        int octInt = 0;
        int decInt = 0;
        int hexInt = 0x0;

        System.out.println(binInt + " " + octInt + " " + decInt + " " + hexInt);

        long binLong = 0b111010110111100110100010101L;
        long octLong = 0726746425L;
        long decLong = 123456789L;
        long hexLong = 0x75BCD15L;

        System.out.println(binLong + " " + octLong + " " + decLong + " " + hexLong);
    }
}
