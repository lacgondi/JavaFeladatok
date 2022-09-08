package hu.petrik.javabevezeto;

import java.util.Scanner;
import static java.lang.System.out;

public class Feladat10 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int parosCount=0;
        int paratlanCount = 0;
        while (sum <= 100){
            out.print("Adjon meg egy egész számot: ");
            int num = sc.nextInt();
            sum += num;
            if(num%2==0){
                parosCount++;
            }
            else{
                paratlanCount++;
            }
        }
        out.println("A számok összege meghaladta a 100-at -> "+sum);
        out.println("Páratlan: "+paratlanCount+", Páros: "+parosCount);
    }
}
