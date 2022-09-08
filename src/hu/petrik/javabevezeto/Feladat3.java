package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = -1;
        while (num < 0)
        {
            System.out.print("Adjon meg egy pozitív valós számot: ");
            num = sc.nextDouble();
        }
        double lowerNum = Math.floor(num);
        double higherNum = Math.ceil(num);
        double closerToNum = Math.round(num);
        double decimal = num-lowerNum;

        System.out.printf("A megadott szám a %.0f és a %.0f egész számok között van, és ezek közül a %.0f számhoz van közelebb.", lowerNum, higherNum, closerToNum);
        System.out.printf("\nA szám egész része: %.0f", lowerNum);
        System.out.printf("\nA szám törtrésze: %f", decimal);
    }
}
