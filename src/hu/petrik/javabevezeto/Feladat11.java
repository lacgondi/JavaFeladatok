package hu.petrik.javabevezeto;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int num = -1;
        while (num < 0){
            out.print("Adjon meg egy pozitív egész számot: ");
            num = sc.nextInt();
        }

        int sum = 0;
        for (int i = num; i > 0 ; i--) {
            if(i % 2 == 1)
            {
                sum += i;
            }
        }
        out.printf("Az %d-nél nem nagyobb pozitív páratlan számok összege: %d", num, sum);
    }
}
