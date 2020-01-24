/**
 * ESAME PROGRAMMAZIONE 1 ESTRATTO
 */

public class EsameADel150714 {

    /**
     * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
     * 
     * Si assuma di rappresentare le "matrici bidimensionali" usando gli array Java
     * secondo lo schema illustrato di seguito.
     *
     * Schema: Allocazione per riga di una "matrice" astratta usando array unidimensionali Java
     * ----------------------------------------------------------------------------------------
     * Lo schema e' descritto con il seguente esempio. 
     * Se M è una "matrice" 4x3 di numeri Reali Positivi o Nulli così fatta:
     *
     *         1 32.0  43.2 
     *    M =  0    4  4.21 
     *         0  4.3  6.32 
     *         0   21   3.2
     *
     * allora l'implementazione stabilisce che M sia allocata
     * in memoria nel seguente modo:
     *
     *     array Java: { 1.0, 32.0, 43.2, 0.0,  4.0, 4.21, 0.0, 4.3,  6.32, 0.0, 21.0, 3.20 }
     *                    ^                ^                ^                ^
     *                    |                |                |                |
     *                    |                |                |                \--------------- qui inizia la riga 3 di M
     *                    |                |                |          
     *                    |                |                \------------- qui inizia la riga 2 di M                                 
     *                    |                |
     *                    |                \-------------- qui inizia la riga 1 di M
     *                    | 
     *                    \----------- qui inizia la riga 0 di M
     *
     * quindi la "matrice", secondo lo schema, e' memorizzata negli elementi dell'array Java 
     * una riga dopo l'altra.  
     *
     * Assumendo che gli indici di riga e colonna usati per indicare gli elementi
     * della "matrice" partano da 0 (zero) e che le matrici siano di numeri
     * reali non negativi, sviluppare i metodi di classe richiesti nel seguito.
     *
     * a) Signature del metodo: 
     *
     *                 static float getElementAt(float[] mtx, int r, int c, int m, int n)
     *
     *    Il metodo ha come parametri: 
     *    - mtx: un reference ad un array Java che rappresenta una "matrice" secondo lo schema sopra descritto;
     *    - r: un indice di riga della "matrice";
     *    - c: un indice di colonna della "matrice";
     *    - m: la dimensione in righe della "matrice";
     *    - n: la dimensione in colonne della "matrice".
     *   
     *    Valore restituito: 
     *    il metodo restituisce l'elemento in riga 'r', colonna 'c' della "matrice"  prelevandolo
     *    dalla struttura dati array usata per memorizzarla (mtx).
     *    In caso di errore il metodo restituisce un numero negativo.
     *
     *    Esempio: sull'esempio sopra descritto la chiamata a 
     *    getElementAt(data, 2,1, 4,3), dove 'data' e' un reference all'array
     *    sopra disegnato, deve restituire il valore 4.3.
     *
     *    Il metodo deve verificare la validità dei valori 'r', 'c', 'm' e 'n' in maniera 
     *    che non si verifichino eccezioni di tipo "Out of bounds" o "Null pointer" durante l'esecuzione.
     *
     *
     * b) Signature del metodo: 
     *
     *                 static float[] maxInEachRow(float[] mtx, int m, int n)
     *
     *    Il metodo ha come parametri: 
     *    - mtx: un reference ad un array Java che rappresenta una "matrice" memorizzata 
     *      secondo lo schema descritto nel preambolo dell'esercizio;
     *    - m: la dimensione in righe della "matrice";
     *    - n: la dimensione in colonne della "matrice".
     * 
     *    Valore restituito: Il metodo calcola il massimo in ogni riga della "matrice",
     *    rappresentata dal parametro 'mtx' passato come argomento. 
     *    Il metodo restituisce un array con i massimi in caso di successo altrimenti
     *    restituisce il valore di reference 'null'.
     *
     *    Richieste implementative: il metodo deve  leggere gli elementi
     *    della "matrice" astratta usando 'getElementAt', NON deve pertanto in alcun
     *    modo accedere direttamente alla struttura dati array ad esempio usando mtx[<indice>].
     *    Il metodo può invece accedere direttamente alla dimensione dell'array riferito da 'mtx'
     *    usando 'mtx.length'.
     *
     *    Suggerimento: è possibile (NON E' NECESSARIO) usare un approccio modulare e 
     *    sviluppare un metodo di appoggio maxInRow(mtx, i, m, n) 
     *    per calcolare il massimo nella riga 'i'-esima della matrice 'mtx' (di dimensione 'm per n').
     *
     *    ESEMPIO: il metodo maxInEachRow se chiamato sulla matrice descritta nel preambolo del testo dell'esercizio
     *    deve restituire il seguente array di 4 elementi:  { 43.2, 4.21, 6.32, 21 }
     */ 
    
    /* 
     * Aggiungere i due metodi proposti come soluzione all'ESERCIZIO 1 appena al di sotto di 
     * questo commento, in modo che l'intera classe continui ad essere compilabile senza errori.
     */

    
    /**
    * ESERCIZIO 2 (Massimo 4+4 punti -- da consegnare a mano).
    * 
    * Sia dato il metodo:

       public static int f(int n) {
          int i = 0;
          int r = 1;
          while (i < n) {       // (*)
             r = 3 * r;
             i++;
         }
         return r;
       }

    * (1) Scrivere un predicato P(i, n) che possa descrivere una proprieta' invariante 
    *     ragionevole per il ciclo (*);
    * (2) Usando una qualsiasi delle tecniche conosciute, dimostrare che P(i, n) e' 
    *     effettivamente l'invariante di ciclo.
    */
    
    /**
     * ESERCIZIO 4 (Massimo 7 punti -- da consegnare a mano).
     * 
     * Usando i metodi main, x e y, scrivere lo stato della memoria 
     * della JVM giusto prima della disallocazione del frame di attivazione del metodo x.
     */
    public static void y(int l, int[][] a) {
       int[] b = new int[l];
       for (int i = 0; i < l; i++)
         b[i] = l;
       a[l] = b;
    }

    public static void x(int[][] a) {
       int i;
       for (i = 1; i < a.length; i++)
         y(i,a);                      // (B)
    }
    
    /******************************************/
    public static void main(String[] args) {
      int[][] a = new int[3][];
      x(a);                          // (A)
    }
    
}
