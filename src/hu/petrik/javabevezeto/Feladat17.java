package hu.petrik.javabevezeto;

import static java.lang.System.*;

public class Feladat17 {
    public static void main(String[] args) {
        double arr1[] = new double[5];
        double arr2[] = new double[5];
        double arrSum[] = new double[5];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=(Math.random()*100)+1;
            arr2[i]=(Math.random()*100)+1;
            arrSum[i] = arr1[i] + arr2[i];
        }
        out.println("Array 1");
        for(double item: arr1)
        {
            out.printf("%.2f\t", item);
        }
        out.println("\nArray 2");
        for(double item: arr2)
        {
            out.printf("%.2f\t", item);
        }
        out.println("\nArray Sum");
        for(double item: arrSum)
        {
            out.printf("%.2f\t", item);
        }
    }
}
