public class InputRicorsivo {

    public static void stampaDispari(int n){
        if( n > 0 ){
            int m = SIn.readInt();
            if( (m % 2) != 0) {
                System.out.println(m);
            }
            stampaDispari(n - 1 );
        }
    }

    public static void stampaMaggioriS(int n, int s){
        if( n > 0 ){
            int m = SIn.readInt();
            if( m > s ) {
                System.out.println(m);
            }
            stampaMaggioriS(n - 1, s );
        }
    }

    public static void stampaMedia(int n){
        System.out.println(mediaRic(n,n));
    }

    private static float mediaRic(int n, int i){
        int m = SIn.readInt();
        if (n == 1){
            return m;
        }else if(n == i){
            return (m + mediaRic(n - 1, i)) / i;
        }
        return 0;
    }
}
