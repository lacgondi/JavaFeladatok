package hu.petrik.javabevezeto;

import java.util.Locale;
import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a téglalap 'a' oldalát: ");
        double a = Double.parseDouble(sc.nextLine().replace(',', '.'));
        System.out.print("Kérem adja mega téglalap 'b' oldalát: ");
        double b = Double.parseDouble(sc.nextLine().replace(',', '.'));
        System.out.print("Kérem adja meg, hogy mit szeretne kiszámítani (K: kerület, T: terület): ");
        String choice = sc.nextLine();

        if(choice.equals("K"))
        {
            double ker = 2 * (a + b);
            System.out.println("A téglalap kerülete: "+ker);
        }
        else if(choice.equals("T")) {
            double area = a * b;
            System.out.println("A téglalap területe: "+area);
        }
        else
        {
            System.out.println("\nHibás műveletet adott meg");
        }
    }
}
