/**
 * Libreria con operazioni aritmetiche definite tramite iterazioni di operazioni
 * piu' primitive.
 */
public class LibreriaAritmetica {
    public static int piu(int x, int y) {
        int r = 0;
        // completare
        r = x;
        while(y > 0){
             r = r + 1;
             y = y - 1;
        }
        return r;
    }

    public static int meno(int m // minuendo
            ,int s // sottraendo
    ) {
        int r = 0;
        // completare

        r = m;

        while ( s > 0 ){
            r = r - 1;
            s = s - 1;
        }
        return r;
    }

    public static int per(int x, int y) {
        int r = 0;
        // completare richiamando il metodo per il calcolo della somma

        while( y > 0){
            r = LibreriaAritmetica.piu(r, x);
            y = y - 1;
        }
        return r;
    }

    public static int div(int d // dividendo
            ,int s // diviSore >= 0
    ) {
        int r = 0;
        //completare richiamando il metodo per il calcolo della differenza

        while ( d > 0){
            d = LibreriaAritmetica.meno( d, s);
            r = r + 1;
        }
        return r;
    }

    public static int resto(int d // dividendo
            ,int s // diviSore >= 0
    ) {
        int r = 0;
        //completare richiamando il metodo per il calcolo della differenza
        return r;
    }

    public static int pot(int b // base
            ,int e // esponente
    ) {
        int r = 0;
        r = 1;
        while(e > 0){
            r = LibreriaAritmetica.per(r, b);
            e = e - 1;
        }
        return r;
    }
}