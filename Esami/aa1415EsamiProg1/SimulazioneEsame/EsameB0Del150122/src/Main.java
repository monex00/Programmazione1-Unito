public class Main {
    public static void main( String[] args){
        /*
        int[][] mat = {{3,4,1}, {1,2,3}, {3,4,2}};
        System.out.println(Solutions.exUno(mat) == true);

        int[][] mat1  = {{3,4,1}, {3,2,1}, {3,2,2}};
        System.out.println(Solutions.exUno(mat1) == false);

        int[][] mat2 = {{3,4,1}};
        System.out.println(Solutions.exUno(mat2) == false);


         */


        int[] vet = {3,4,1,1,2,3,3,2,4};
        vet = Solutions.exDue(vet);

        for( int i = 0 ; i< vet.length; i++){
            System.out.print(vet[i]);
        }


    }
}
