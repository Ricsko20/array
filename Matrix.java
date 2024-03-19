import java.util.Scanner;
import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a kétdimenziós tömb méretét!");
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        Random random = new Random();

        int[][] tabla = new int[m1][m2];

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < m2; j++) {
                tabla[i][j] = random.nextInt(101); 
            }
        }

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
}
