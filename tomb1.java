import java.util.Scanner;

public class tomb1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Add meg, hogy hány adatot akarsz eltárolni ");
        int hossz = scaner.nextInt();
        int[] tomb = new int[hossz];

        for(int i = 0; i < hossz; i++) {
            int szam = scaner.nextInt();
            tomb[i] = szam;
        }

        for(int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);
        }
    }
}
