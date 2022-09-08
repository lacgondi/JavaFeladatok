package hu.petrik.javabevezeto;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.print("Adja meg a háromszög 'a' oldalát: ");
        double a = sc.nextDouble();
        out.print("Adja meg a háromszög 'b' oldalát: ");
        double b = sc.nextDouble();
        out.print("Adja meg a háromszög 'c' oldalát: ");
        double c = sc.nextDouble();

        if(a + b > c || b + c > a || a + c > b)
        {
            double ker = a+b+c;
            out.printf("A háromszög területe %.0f", ker);
        }
        else
        {
            out.println("Hibás adatok");
        }

    }
}
