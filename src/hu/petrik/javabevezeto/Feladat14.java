package hu.petrik.javabevezeto;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        out.print("Adj meg egy szöveget");
        String text = sc.nextLine();
        String choice = "asd";
        out.println("Nagy betűssé alakítás (n)");
        out.println("Kisbetűssé alakítás (k)");
        out.println("Hossz lekérdezése (h)");
        out.println("Összehasonlítás egy másik stringgel (c)");
        out.println("A string egy részének kiírása (i)");
        out.println("Kilépés (q)");
        out.print("Válassz egy opciót a zárójelben lévő karakter beírásával: ");
        while (choice.toLowerCase() != "q")
        {
            choice = sc.nextLine().toLowerCase();
            if(choice == "n")
            {
                out.println(text.toUpperCase());
            }
            else if(choice == "k")
            {
                out.println(text.toLowerCase());
            }
            else if(choice == "h")
            {
                out.println(text.length());
            }
            else if(choice == "c")
            {
                String secondText = sc.nextLine();
                out.printf("%s - Hossza: %d\n%s - Hossza: %d", text, text.length(), secondText, secondText.length());
            }
            else if(choice == "i")
            {
                out.print("Add meg, hogy hanyadik betűtől akarod kiíratni a szöveget");
                int a = sc.nextInt();
                out.print("Add meg, hogy hanyadik betűig akarod kiíratni a szöveget");
                int b = sc.nextInt();
                out.println(text.substring(a-1, b-1));
            }
        }
        System.exit(0);
    }
}
