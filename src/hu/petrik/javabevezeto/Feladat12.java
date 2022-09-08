package hu.petrik.javabevezeto;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.print("Adjon meg egy összeget 1 Ft és 1000 Ft között: ");
        int cost = sc.nextInt();
        if(cost != 0){
            int _200s = cost / 200;
            cost -= 200*_200s;
        }
        if(cost != 0){
            int _100s = cost / 100;
            cost -= 100 * _100s;
        }
        if(cost != 0)
        {
            int _50s = cost / 50;
            cost -= 50 * _50s;
        }
        if(cost != 0)
        {
            int _20s = cost / 20;
            cost -= 20 * _20s;
        }
        if(cost != 0)
        {
            int _10s = cost / 10;
        }



        int _5s = cost / 5;



    }
}
