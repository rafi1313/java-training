import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Zadanie1 {
    public static void main(String[] args) {
        int[][] matrix = new int[7][6];
        Random rnd = new Random();
        //pętla uzupełniająca
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(11) - 5;
            }
        }
        //pętla wyświetlająca tablicę matrix
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        //wyświetlanie minimów
        System.out.println("Minima z kolumn:");
        int[] minima = new int[matrix.length];
        int[] minwynik = new int [matrix[0].length];
//        System.out.println(matrix[0].length);
        for (int i = 0; i < matrix[i].length; i++) {
            for (int x = 0; x < (matrix.length); x++) {
                minima[x] = matrix[x][i];
//                System.out.println(minima[x]);
            }
            Arrays.sort(minima);
        minwynik[i]=minima[0];
        }
        System.out.println(Arrays.toString(minwynik));
        //wyświetlanie maximów
        System.out.println("Maxima z kolumn:");
        int[] maxima = new int[matrix.length];
        int[] maxwynik = new int [matrix[0].length];
//        System.out.println(matrix[0].length);
        for (int i = 0; i < matrix[i].length; i++) {
            for (int x = 0; x < (matrix.length); x++) {
                maxima[x] = matrix[x][i];
//                System.out.println(minima[x]);
            }
            Arrays.sort(maxima);

            maxwynik[i]=maxima[maxima.length-1];
        }
        System.out.println(Arrays.toString(maxwynik));
    }
}
