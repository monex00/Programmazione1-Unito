/**
 * ESAME PROGRAMMAZIONE 1 ESTRATTO
 */

public class EsameADel150915 {

    /**
     * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
     * 
     * Scrivere un metodo exUno: 
     * I.  che abbia due parametri formali a e b di tipo riferimento ad 
     *     array di interi e
     * II. che, controllata la validita' (reference validi) dei parametri attuali,
     *     corrispondenti ad a e b, restituisca true se esiste b[i] tale che, 
     *     per ogni a[j], si abbia a[j] < b[i]. In caso contrario, il risultato 
     *     e' false. In parole: il metodo deve restituire true se e solo se
     *     esiste almeno un elemento in b strettamente maggiore di ogni elemento in a.
     * 
     * ESEMPI.
     * Siano a == {1,3,2} e b == {2,3,4}. Il risultato e' true perche' in b c'e'
     * il valore 4 e ogni valore di a e' inferiore a 4.
     * Siano a == {1,3,0} e b == {2,3,3} il risultato e' false perche' non esiste in b 
     * un elemento strettamente maggiore di tutti gli elementi di a.
     */
    
    /*
     * Il metodo exUno va scritto immediatamente sotto ed al di fuori di questo commento.
     * L'aggiunta del metodo exUno deve mantenere compilabile la classe. 
     */
    
    /**
     * ESERCIZIO 2 (Massimo 8 punti -- da consegnare elettronicamente).
     * 
     * Scrivere un metodo ricorsivo exDue: 
     * (i) che abbia come parametro formale il riferimento ad un array di interi
     * (ii) e che, controllata la validita' del parametro attuale, 
     * alteri a nel seguente modo: ogni cella di posizione pari a[i] deve essere
     * modificata con la somma tra a[i] e a[i+1], ammesso che a[i+1] esista.
     * 
     * ESEMPIO.
     * Sia a == {3,4,1}. Allora a risultante e' {7,4,1}. 
     * Sia a == {3,4,1,2}. Allora a risultante e' {7,4,3,2}. 
     */

    /*
     * Il metodo exDue va scritto immediatamente sotto ed al di fuori di questo commento.
     * L'aggiunta del metodo exDue deve mantenere compilabile la classe. 
     */

    /**
    * ESERCIZIO 3 (Massimo 4+4 punti -- da consegnare a mano).
    * Dato il metodo exTre, usando uno dei metodi conosciuti,  
    * dimostrarne la correttezza PARZIALE, sapendo che al termine del
    * ciclo vale il predicato r == (x % 2 == 0).
    */
    
    public static boolean exTre(int x){
        int i = 0;
        boolean r = true;
        while (i < x) {
            r = !r;
            i++;
        }
        return r;
    }

    /**
     * ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
     * 
     * Scrivere lo stato della memoria della JVM alla riga col commento // (B),
     * prima della disallocazione del frame relativo ad x, quando idx == 1.
     */
    
    public static int idx;
    
    public static void x(int l, int[][] a) {
       int[] b = new int[l];
       int i;
       for (i = 0; i < l; i++)
         b[i] = i;
       a[idx] = b;
       // (B)
    }
  
    /******************************************/
    public static void main(String[] args) {
      int[][] a = new int[2][];
      for (idx = 0; idx < 2; idx++) 
         x(idx + 1, a);   // usare (A) come indirizzo di rientro
    }

}
