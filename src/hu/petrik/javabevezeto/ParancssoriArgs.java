package hu.petrik.javabevezeto;

public class ParancssoriArgs {
    public static void main(String[] args) {
        if (args.length < 2)
        {
            System.out.println("Nincs megadava forrás és cél");
        }
        else
        {
            String source = args[0];
            String destination = args[1];
            System.out.println(source + " -> " + destination);
        }
    }
}
