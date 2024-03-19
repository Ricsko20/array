import java.util.Scanner;

public class tomb2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Add meg, hogy hány adatot akarsz eltárolni ");
        int hossz = scaner.nextInt();
        double[] tomb = new double[hossz];

        for(int i = 0; i < hossz; i++) {
            double szam = scaner.nextDouble();
            tomb[i] = szam;
        }

        for(int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);
        }
    }
}
