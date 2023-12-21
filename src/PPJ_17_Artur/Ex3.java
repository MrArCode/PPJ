package PPJ_17_Artur;

import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {
        int[] array = {3, 1, 2, 2, 4, 1, 5, 6, 6, 7, 7, 7};
        array = tabSort(array, array.length);

        System.out.println(Arrays.toString(array));
    }

    public static int[] tabSort(int[] tab, int len) {

        if (len <= 1) {
            int[] temp = new int[tab.length];
            int j = 0;

            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] != tab[i + 1]) {
                    temp[j++] = tab[i];
                }
            }

            temp[j++] = tab[tab.length - 1];

            // Tworzenie nowej tablicy wynikowej bez duplikatów
            int[] result = new int[j];
            System.arraycopy(temp, 0, result, 0, j);

            return result;
        }

        for (int i = 0; i < len - 1; i++) {
            if (tab[i] > tab[i + 1]) {
                int tmp = tab[i];
                tab[i] = tab[i + 1];
                tab[i + 1] = tmp;
            }
        }

        return tabSort(tab, len - 1);
    }
}
