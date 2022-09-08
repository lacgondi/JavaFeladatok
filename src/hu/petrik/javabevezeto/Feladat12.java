package hu.petrik.javabevezeto;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.print("Adjon meg egy összeget 1 Ft és 1000 Ft között: ");
        int cost = sc.nextInt();
        int costEnd = cost;
        int _200s = 0;
        int _100s = 0;
        int _50s = 0;
        int _20s = 0;
        int _10s = 0;
        int _5s = 0;

        if(cost-200 != 0 && cost != 0){
             _200s = cost / 200;
            cost -= 200*_200s;
        }
        if(cost-100 != 0 && cost != 0){
            _100s = cost / 100;
            cost -= 100 * _100s;
        }
        if(cost-50 != 0 && cost != 0)
        {
            _50s = cost / 50;
            cost -= 50 * _50s;
        }
        if(cost-20 != 0 && cost != 0)
        {
            _20s = cost / 20;
            cost -= 20 * _20s;
        }
        if(cost-10 != 0 && cost != 0)
        {
            _10s = cost / 10;
            cost -= 10 * _10s;
        }
        if(cost-5 != 0 && cost != 0)
        {
            _5s = cost / 5;
            cost -= 10 * _5s;
        }
        out.printf("%d db 200 Ft-os, %d db 100 Ft-os, %d db 50 Ft-os, %d db 20 Ft-os, %d db 10 Ft-os, %d 5 Ft-os használatával lehet a legkevesebb érmével kifizetni d%", _200s, _100s, _50s, _20s, _10s, _5s, costEnd);







    }
}
