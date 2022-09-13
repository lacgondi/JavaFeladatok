package hu.petrik.javabevezeto;

import java.util.Scanner;

import static java.lang.System.*;


public class Feladat16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            out.print("Adjon meg egy egész számot: ");
            arr[i] = sc.nextInt();
        }

        out.println("\nNormál sorrend");
        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i]+"\t");
        }
        out.println("\nFordított sorrend");
        for (int i = arr.length-1; i >= 0; i--) {
            out.print(arr[i]+"\t");
        }
        out.println("\nA tömb minden második eleme");
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0)
            {
                out.print(arr[i] + "\t");
            }
        }
        out.print("\nAdjon meg egy számot 1 és 5 között: ");
        int choice = sc.nextInt();
        out.println("A választott elem: "+arr[choice-1]);
    }
}
