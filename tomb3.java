import java.util.Scanner;

public class tomb3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Add meg, hogy hány adatot akarsz eltárolni ");
        int hossz = scaner.nextInt();
        String[] tomb = new String[hossz];

        for(int i = 0; i < hossz; i++) {
            String szoveg = scaner.next();
            tomb[i] = szoveg;
        }

        for(int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);
        }
    }
}
