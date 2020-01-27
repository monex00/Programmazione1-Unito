public class main {
    public static void main(String[] args) {
        /*
         * Sia m->{{0, 1, 2, 3},
 *         {4, 5, 6, 7},
 *         {8, 1, 2, 3},
 *         {4, 5, 6, 9}}.
 *
 * Se a -> {0,1,2,3} allora exUno restituisce 2 perche' rMin == rMax == 0.

          * Se a -> {0,1,2,3} allora exUno restituisce 2 perche' rMin == rMax == 0.
 * Se a -> {4,5,6} allora exUno restituisce 29 perche' rMin == 1 e rMax == 3.
 * Se a -> {0,1,2,3,4} allora exUno restituisce 0 perche' a e' piu' lunga di qualsiasi riga.
 * Se a -> {1,2,3} allora exUno restituisce 0 perche' a, pur comparendo nelle righe 0 e 2 di

         */

        int [][] m = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 1, 2, 3}, {4, 5, 6, 9}};
        int[] a = {0, 1, 2, 3};
        int[] a1 = {4, 5, 6};
        int[] a2 = {0, 1, 2, 3, 4};
        int[] a3 = {1, 2, 3};

        System.out.println(AppelloDiGiugno00.exUno(m, a));
        System.out.println(AppelloDiGiugno00.exUno(m, a1));
        System.out.println(AppelloDiGiugno00.exUno(m, a2));
        System.out.println(AppelloDiGiugno00.exUno(m, a3));

    }
}
