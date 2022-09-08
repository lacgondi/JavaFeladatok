package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a medence átmérőjét: ");
        double diameter = sc.nextDouble();
        System.out.println("Adja meg a medence mélységét: ");
        double depth = sc.nextDouble();
        double volume = depth*Math.pow(diameter/2,2);
        System.out.printf("A medence térfogata %.3f m3", volume);
    }
}
