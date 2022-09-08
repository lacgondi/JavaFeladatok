package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a terület szélességét méterben: ");
        double width = sc.nextDouble();
        System.out.println("Adja meg a terület magasságát méterben: ");
        double height = sc.nextDouble();
        double plateArea = Math.pow(0.2, 2);
        double platesNeeded = width*height/plateArea*1.1;
        System.out.printf("%.0f db csempe kell a munka elvégzéséhez", platesNeeded);
    }
}
