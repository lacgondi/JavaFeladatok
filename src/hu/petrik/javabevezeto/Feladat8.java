package hu.petrik.javabevezeto;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int guess = 23;
        while (guess != 0 && guess != 1)
        {
            out.print("Adja meg a tippjét (0 - fej | 1 - írás): ");
            guess = sc.nextInt();
        }
        int outCome = (int)(Math.random()*2);
        if(outCome == guess){
            out.println("Nyertél");
        }
        else{
            out.println("Vesztettél");
        }
    }
}
