/**
 * ESAME PROGRAMMAZIONE 1 ESTRATTO
 */

public class EsameADel150611 {

 /**
  * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
  *
  * Scrivere i seguenti metodi di classe: 
  *
  * a) Signature:
  *
  *                static int[] newMatrix(int m, int n)
  *
  *    Funzione: il metodo alloca in memoria lo spazio necessario a memorizzare
  *    una matrice di valori di tipo 'int' e di dimensione 'm' righe e 'n' colonne. 
  *
  *    Valore restituito: il metodo restituisce un reference alla struttura dati
  *    che rappresenta la matrice.
  *     
  *    Richieste implementative:
  *    - la matrice deve essere rappresentata/implementata con un array 
  *      uni-dimensionale di interi;
  *    - gli elementi della matrice devono essere inizializzati al valore 0.
  * 
  *    Esempio: la chiamata 'newMatrix(4,3)' deve allocare in memoria un array
  *             così composto:
  *    
  *             ref -> { 0,0,0, 0,0,0, 0,0,0, 0,0,0 }
  *
  *    e deve restituire il reference, indicato sopra con 'ref', alla struttura allocata.
  *
  *    NOTA: l'array sopra rappresenta la seguente matrice:
  *
  *         0 0 0 
  *    M =  0 0 0 
  *         0 0 0 
  *         0 0 0
  *
  * b) Signature: 
  *
  *                 static void setElementAt(int[] mtx, int r, int c, int val, int m, int n)
  *
  *    Funzione: il metodo imposta l'elemento in riga 'r', colonna 'c' della matrice 'mtx'
  *    al valore 'val'.
  *
  *    Il metodo prende come parametri: 
  *    - un reference restituito da newMatrix (mtx) che indica la matrice sulla quale il metodo opera;
  *    - un indice di riga della matrice (r);
  *    - un indice di colonna della matrice (c);
  *    - un valore (val);
  *    - la dimensione in righe della matrice (m);
  *    - la dimensione in colonne della matrice (n).
  *
  *    Esempio: assumendo che 'ref' sia un reference valido (precedentemente restituito 
  *    da una chiamata a newMatrix) alla matrice M così composta:
  *
  *         0  0  0 
  *    M =  0  0  0
  *         0  0  0 
  *         0  0  0
  * 
  *    allora la chiamata 'setElementAt(ref,1,2,-40,4,3)'
  *    deve modificare M nel seguente modo:
  *
  *         0  0    0 
  *    M =  0  0  -40  <--- elemento M(1,2) di M
  *         0  0    0 
  *         0  0    0
  *
  *    pertanto la struttura array che rappresenta la matrice sopra
  *    dovrà  essere modificata come segue (si assume che la matrice sia memorizzata "per righe"):
  *    
  *        ref -> { 0,0,0, 0,0,-40 0,0,0, 0,0,0 }
  *
  *    Il metodo deve verificare la validità  dei valori 'r', 'c', 'm' e 'n' in maniera 
  *    che non si verifichino eccezioni di tipo "Out of bounds" o "Null pointer"
  *    durante l'esecuzione. 
  */
    
  /* 
   * Scrivere i due metodi soluzione all'ESERCIZIO 1 immediatamente al di sotto di 
   * questo commento.
   * 
   * ATENZIONE!!!
   * L'aggiunta dei due metodi DEVE mantenere compilabile la classe.
   * Se la classe non compila, l'intero compito verrà ritenuto insufficiente.
   */
        
  /**
   * ESERCIZIO 2 (Massimo 4+4 punti -- da consegnare a mano).
   * 
   * Si consideri il metodo:
       public static int f(int n){
           if (n == 0) 
               return 0;
           else 
               return 3 + f(n-1);
       }
    
   * (1) Trovare un'espressione E non ricorsiva, costruita utilizzando solo 
   *     semplici funzioni aritmetiche, che esprima il valore di f(n) per un generico 
   *     numero naturale n.
   * (2) usando una qualsiasi delle tecniche conosciute, dimostrare per induzione che, 
   *     per ogni valore di n scelto tra i numeri naturali, E = f(n).      
   */
   
  
  /**
   * ESERCIZIO 5 (Massimo 7 punti -- da consegnare a mano).
   * 
   * Usando i metodi main, x e y, scrivere lo stato della memoria 
   * della JVM giusto prima della disallocazione del frame di attivazione del metodo x, 
   * cioè prima dell'avvenuta assegnazione,
   * creato conseguentemente alla chiamata alla riga contrassegnata con +++.
   */
  public static void y(boolean[] b, boolean[] a) {

     for (int i = b.length - 1; i >= 0; i--)
     a[i] = b[i] || a[i];
  }

  public static boolean[] x(boolean[] b) {

     boolean[] d = new boolean[b.length];
     for (int i = 0; i < b.length; i++)
       d[i] = b[i];
     return d;  
  }
    
  /******************************************/
  public static void main(String[] args) {
    boolean[] a = { true , false , true};
    boolean[] b = { false, true};
    boolean[] c = new boolean[b.length];
    y(b,a);
    c = x(b); // +++
  }
}
