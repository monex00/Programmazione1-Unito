public class main {
    public static void main(String[] args) {
       // Se a -> {1,2,3,4}, b -> {2,5,1,9,10} allora r -> {false,false,true,true}
       /* int[] a = {1,2,3,4};
        int[] b = {2,5,1,9,10};

        boolean[] ret = AppelloDiFebbraio00.exUno(a,b);
        for(int i = 0;i < ret.length; i++){
            System.out.println(ret[i]);
        }

        */

       //  Se b->{10, 2, 5, 4, 2, 1} allora exDue(b) restituisce 8 ottenuto dal prodotto 2*4.

        int[] b = {1, 10, 5, 5, 3, 1};
        System.out.println(AppelloDiFebbraio00.exDue(b));

        System.out.println( AppelloDiFebbraio00.exTre(6));

    }
}
