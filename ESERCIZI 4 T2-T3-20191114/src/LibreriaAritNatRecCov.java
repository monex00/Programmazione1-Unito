public class LibreriaAritNatRecCov {

    public static int piu(int x, int y) {
        int r = 0;
        if ( y == 0 ){
            r = x;
        }else{
            r = piu(x, y - 1) + 1;
        }
        return r;
    }

    public static int meno(int m , int s ) {
        int r = 0;
        if (s == 0){
            r = m;
        }else{
            r = meno(m , s - 1) - 1 ;
        }
        return r;
    }

    public static int per(int x, int y) {
        if (y == 0) {
            return 0;
        }else {
            return piu(per(x, y - 1), x);
        }
    }

    public static int div(int d, int s) {
        if (d < s){
            return 0;
        }else {
            return div(meno(d,s) , s) + 1;
        }
    }

    public static int resto(int d , int s) {
        if(d < s){
            return d;
        }else{
            return resto(meno(d, s), s);
        }
    }

    public static int pot(int b , int e ) {
        if (e <= 0){
            return 1;
        }else {
            return  per(pot(b, e - 1), b);
        }
    }
}
