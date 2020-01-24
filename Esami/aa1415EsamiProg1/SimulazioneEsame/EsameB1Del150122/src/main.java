public class main {
    public static void main(String[] args) {
        /*
        int[][] mat ={{2, 0, 0, 0}, {0, 2, 0, 0}, {0, 0, 2, 0}, {0, 0, 0, 1}};
        System.out.println(Simulazione.exUno(mat) == false);
         */

        int[] a = {3,4,6,6,2,3,3,4,4};
        System.out.println(Simulazione.exDue(a,5,8,2) == false);

        //Sia a == {3,4,1}. Allora a risultante e' {7,4,3,2}.
        int[] vet ={3,4,1,2};
        Simulazione.exxDue(vet);
        for(int i = 0; i< vet.length; i++){
            System.out.println(vet[i]);
        }
    }
}
