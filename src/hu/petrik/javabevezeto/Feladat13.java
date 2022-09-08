package hu.petrik.javabevezeto;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int random = (int) ((Math.random()*100)+1);
        int userInput;
        int counter = 0;

        do {
            out.print("Találd ki melyik számra gondoltam 1 és 100 között: ");
            userInput = sc.nextInt();
            counter++;
        }while (random != userInput);
        out.printf("Gratulálok! Sikerült kitalálnod a számot. %d próbálkozás után", counter);
    }
}
