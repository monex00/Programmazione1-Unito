public class ArrayMonodimensionaliTest{
    public static void main(String[] args) {
        /*
        int[] x = {1, 2};
        int[] y = {1, 2};
        System.out.println(ArrayMonodimensionali.eqAr(x, y) == true);

        int[] x1 = {0, 2};
        int[] y1 = {1, 2};
        System.out.println(ArrayMonodimensionali.eqAr(x1, y1) == false);

        int[] x2 = {1, 0};
        int[] y2 = {1, 2};
        System.out.println(ArrayMonodimensionali.eqAr(x2, y2) == false);

        int[] x3 = {0, 0};
        int[] y3= {1, 2};
        System.out.println(ArrayMonodimensionali.eqAr(x3, y3) == false);

        int[] x4 = {0};
        int[] y4= {1, 2};
        System.out.println(ArrayMonodimensionali.eqAr(x4, y4) == false);

        int[] x5 = {1, 2};
        int[] y5= {0};
        System.out.println(ArrayMonodimensionali.eqAr(x5, y5) == false);

        int[] x6 = {1, 2};
        int[] y6= {}; //la struttura nello heap contiene solo il campo lenght
        System.out.println(ArrayMonodimensionali.eqAr(x6, y6) == false);

        int[] x7 = {1, 2};
        int[] y7= null ; //la struttura nello heap contiene solo il campo lenght
        System.out.println(ArrayMonodimensionali.eqAr(x7, y7) == false);

        int[] x8 = null;
        int[] y8= null; //la struttura nello heap contiene solo il campo lenght
        System.out.println(ArrayMonodimensionali.eqAr(x8, y8) == false);
        */

        //Scrivere alcuni test per eqArCov1
        //Scrivere alcuni test per eqArCov2
        /*
        int[] x = {1, 2};
        int[] y = {1, 2};
        System.out.println(ArrayMonodimensionali.eqARCov2(x, y) == true);
        */
        /*
        //Scrivere alcuni test per eqArContro
        int[] x = {1, 1};
        int[] y = {1, 2};
        System.out.println(ArrayMonodimensionali.eqARCov2(x, y) == false);
        */

        //somma di elementi in un array
        int[] x = {1, 5};
        System.out.println(ArrayMonodimensionali.sommaEleAr(x));
        System.out.println(ArrayMonodimensionali.sommaEleArCov1(x));
        System.out.println(ArrayMonodimensionali.sommaEleArCov2(x));
        System.out.println(ArrayMonodimensionali.sommaEleArContro(x));
    }
    
}