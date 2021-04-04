import java.util.Random;
import java.util.Scanner;

public class Matrici_01 {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner input = new Scanner(System.in);
        int[][] mat = new int[10][10];
        int[][] seconda = new int[10][9];
        for (int i = 0; i < mat.length; i++) {
            for (int k = 0; k < mat[i].length; k++) {
                mat[i][k] = ran.nextInt(100);
                System.out.printf("%3d", mat[i][k]);
                seconda[i][k] = mat[i][k];
            }
            System.out.println();
        }
        int[] somma = new int[10];
        int minore = 4000;
        for (int i = 0; i < mat.length; i++) {
            for (int k = 0; k < mat[i].length; k++) {
                somma[i] = somma[i] + mat[i][k];
            }
            if (somma[i] < minore) {
                minore = somma[i];
            }
        }
        for (int i = 0; i < mat.length; i++) {
            System.out.println(somma[i]);
        }

        System.out.println(minore);

        int y = 0;
        int k=0;
        System.out.println("Quale colonna togliere? ");
        y = input.nextInt();
        for (int i = 0; i < mat.length; i++) {
            k=0;
            for (int j = 0; j < mat[i].length; j++) {
                if(j!=y){
                    seconda[i][k]=mat[i][j];
                    k++;

                }

            }
        }
    }
}