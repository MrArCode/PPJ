package PPJ_17_Artur;

import java.util.Random;
import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] tab = generateArray(5);
        System.out.println(Arrays.toString(tab));
    }


    public static int[] generateArray(int width) {
        int[] tab = new int[width];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
        }
        return tab;
    }

    public static int[][] generateArray(int height, int width) {
        int[][] tab = new int[height][width];
        Random random = new Random();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tab[i][j] = random.nextInt(101);
            }
        }
        return tab;
    }

    public static int[][][] generateArray(int length, int height, int width) {
        int[][][] tab = new int[length][height][width];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                for (int k = 0; k < width; k++) {
                    tab[i][j][k] = random.nextInt(101);
                }
            }
        }
        return tab;
    }
}
