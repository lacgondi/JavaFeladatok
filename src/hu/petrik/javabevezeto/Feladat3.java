package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = -1;
        while (num < 0)
        {
            System.out.println("Adjon meg egy pozitív valós számot: ");
            num = sc.nextDouble();
        }
        double lowerNum = Math.floor(num);
        double higherNum = Math.ceil(num);
        double closerToNum = Math.round(num);
        String[] numToString = String.valueOf(num).split(",");

        System.out.printf("A megadott szám a %l és a %h egész számok között van, és ezek közül a %.0c számhoz van közelebb.", lowerNum, higherNum, closerToNum);
        System.out.printf("A szám egész része: %i", numToString[0]);
        System.out.printf("A szám törtrésze: %d", numToString[1]);
    }
}
