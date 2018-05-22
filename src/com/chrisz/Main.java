package com.chrisz;

public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2050);

        boolean wakeUp = bark(true, -1);
        System.out.println(wakeUp);

        boolean leapYear = isLeapYear(2000);
        System.out.println(leapYear);

    }

    // Challenge 1
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaByte = kiloBytes / 1024;
        int kiloBytesRemainder = kiloBytes % 1024;
        if (kiloBytes >= 0) {
            System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + kiloBytesRemainder + " KB");
        } else {
            System.out.println("Invalid Value");
        }

    }

    //Challenge 2
    public static boolean bark(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay >= 0 && hourOfDay <= 23) { //not out of range
                if (hourOfDay < 8 || hourOfDay > 22) {
                    return true;
                }
            }
        }
        return false;
    }

    //Challenge 3
    public static boolean isLeapYear(int year) {
        if (year >= 1 || year < 9999) {
            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            }
            if (year % 400 == 0) {
                return true;
            }
        }
        return false;
    }

}
