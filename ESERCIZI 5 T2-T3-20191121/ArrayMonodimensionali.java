public class ArrayMonodimensionali{
    //Controllo se gli array sono uguali
    public static boolean eqAr(int[] x, int[] y){
        int i = 0;
        boolean uguali = x!=null && y!=null && x.length == y.length;
        while(uguali && i<x.length ){
            uguali = x[i] == y[i];
            i = i + 1;
        }
        return uguali;
    }
    //Covariante: indice decresce con il decrescere del problema
    // controllo che gli elementi siano uguali
    public static boolean eqARCov1(int[] x, int[] y){
        boolean uguali = x!=null && y!=null && x.length == y.length;
        if(uguali){
            uguali = eqARCov1(x, y, x.length);
        }
        return uguali;
    }

    private static boolean eqARCov1(int[] x, int[] y ,int i){
        if( i == 0) {   // 0 elementi da controllare
            return true;//restituisco un elemento neutro in maniera tale da non influire sugli and
        }else{
            return x[i - 1] == y[i - 1] && eqARCov1(x, y, i - 1); 
                // x[0] == y[0] &&
                // x[1] == y[1] &&
                // x[2] == y[2] &&
                // ...
                // x[i-2] == y[i-2]
            }
        }

        public static boolean eqARCov2(int[] x, int[] y){
            boolean uguali = x!=null && y!=null && x.length == y.length;
            if(uguali){
                uguali = eqARCov2(x, y, x.length - 1);
            }   
            return uguali;
        }
    
        private static boolean eqARCov2(int[] x, int[] y ,int i){
            /*
            if( i == -1){
                return true
            }
            */

            if( i == 0) {
                return x[i] == y[i];
            }else{
                return x[i] == y[i] && eqARCov2(x, y, i - 1); 
                // x[0] == y[0] &&
                // x[1] == y[1] &&
                // x[2] == y[2] &&
                // ...
                // x[i-1] == y[i-1]
                    
                }
            }  

        //Controvariante: indice cresce con il decrescere della difficoltà
        // controllo che gli elementi siano uguali

        public static boolean eqARContro(int[] x, int[] y){
            boolean uguali = x!=null && y!=null && x.length == y.length;
            if(uguali){
                uguali = eqARContro(x, y, 0);
            }   
            return uguali;
        }

        private static boolean eqARContro(int[] x, int[] y, int i){
            if( i == x.length ){
                return true;
            }else{
                return x[i] == y[i] && eqARContro(x, y, i + 1);  
            }
        }

        public static int sommaEleAr(int[] x){
            int i = 0;
            int somma = 0;
            while (i < x.length ){
                somma = somma + x[i];
                i = i + 1;
            }
            return somma;
        }

        public static int sommaEleArCov1(int[] x){
            return sommaEleArCov1(x, x.length);
        }
        private static int sommaEleArCov1(int[] x, int i){
            if (i == 0){
                return 0;
            }else{
                return x[i - 1] + sommaEleArCov1(x, i -1);
            }
        }

        public static int sommaEleArCov2(int[] x){
            return sommaEleArCov2(x, x.length - 1);
        }
        private static int sommaEleArCov2(int[] x, int i){
            if (i == 0){
                return x[i];
            }else{
                return x[i] + sommaEleArCov2(x, i -1);
            }
        }

        public static int sommaEleArContro(int[] x){
            return sommaEleArContro(x, 0);
        }
        private static int sommaEleArContro(int[] x, int i){
            if (i == x.length - 1 ){
                return x[i];
            }else{
                return x[i] + sommaEleArContro(x, i + 1);
            }
        }

}