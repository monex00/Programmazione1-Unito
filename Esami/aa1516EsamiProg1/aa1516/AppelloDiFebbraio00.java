/**
 * ESAME PROGRAMMAZIONE 1 MATTINO 
 * 
 * ISTRUZIONI DA ESEGUIRE NELL'ORDINE. 
 * 0) Scrivere ora, se non lo si è ancora fatto: 
 *     nome, cognome, matricola, corso, numero del PC sul foglio distribuito.
 * 1) Ridenominare questo file in accordo col formato:
 *      Cognome_Matricola_PrimoNomeBattesimo.java 
 * 2) Quando richiesto, scrivere direttamente in questo file le soluzioni agli esercizi proposti. 
 * 
 * PER CONSEGNARE/PER RITIRARSI. 
 * Chiamare un docente.
 */

public class AppelloDiFebbraio00 {

	/**
	 * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo exUno con le seguenti caratteristiche:
	 * a) exUno ha due parametri formali con nome a e b, rispettivamente,
	 *    entrambi di tipo (reference ad) array di interi;
	 * b) exUno restituisce un array r che soddisfi il seguente requisito:
	 *          per ogni i,
	 *          r[i] e' true se almeno uno tra gli elementi di posizione i 
	 *          in a e b e' multiplo di 3.
	 * Si osservi che i parametri attuali possono avere lunghezze differenti.
	 * Inoltre, exUno non deve generare alcun tipo d'errore.
	 *
	 * ESEMPI. 
	 * Se a -> {1,2,3,4}, b -> {2,5,1,9,10} allora r -> {false,false,true,true}
	 *
	 * DOVE SCRIVERE exUno. 
	 * Il metodo exUno va scritto immediatamente al di fuori di questo commento. 
	 * L'aggiunta del metodo exUno deve mantenere compilabile la classe.
	 */


	/** Metodo privato che DEVE ESSERE USATO dalla soluzione all'ESERCIZIO 2. */
	  private static boolean test(int x) {
	     return (x % 2 == 0);
	  }

	/**
	 * ESERCIZIO 2 (Massimo 8 punti -- da consegnare elettronicamente).
	 * 
	 * Scrivere un metodo exDue che, richiamando un metodo ricorsivo exDueRic, rispetti i requisiti riportati.
	 * a) exDue DEVE avere un singolo parametro formale di nome a
	 *    e di tipo reference ad un array di interi;
	 * b) se il riferimento a e' definito allora exDue restituisce il valore intero ottenuto
	 *    dal metodo ricorsivo exDueRic applicato ad a.
	 *    Altrimenti exDue restituisce -1;
	 * c) exDueRic: 
	 *    1) restituisce il prodotto di tutti gli elementi di a in posizione dispari per i quali 
	 *       il metodo test sia vero. Se nessun elemento soddisfa il test, allora exDueRic restituisce 1.
	 *    2) ad ogni chiamata ricorsiva, exDueRic procede nella visita dell'array a, suddividendolo in due 
	 *       parti la cui lunghezza differisca al piu' di una unita'.
	 *
	 * La chiamata a exDue non deve generare alcun tipo d'errore, controllando che il riferimento sia definito 
	 * ed evitando, ad esempio, errori del tipo out of bound.
	 * 
	 * ESEMPI.
	 * Se b->{10, 2, 5, 4, 2, 1} allora exDue(b) restituisce 8 ottenuto dal prodotto 2*4. 
	 * 
	 * DOVE SCRIVERE exDue. 
	 * Il metodo exDue va scritto immediatamente al di fuori di questo commento. 
	 * L'aggiunta del metodo exDue deve mantenere compilabile la classe.
	 */

	  /**
	   * ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano).
	   * Dato il metodo exTre, con n>=0 come precondizione,
	   * dimostrare per induzione su n la correttezza parziale di exTre rispetto alla postcondizione:
	   *         (n pari && exTre(n) == 0) || (n dispari && exTre(n) == 2)
	   * in accordo con i seguenti punti:
	   * 1) formulare esplicitamente e con precisione la base (2 pt.) 
	   * 2) formulare esplicitamente e con precisione il passo induttivo (2 pt.) 
	   * 3) dimostrare che il predicato al punto 1 è vero (3 pt.)
	   * 4) dimostrare che il predicato al punto 2 è vero (3 pt.)
	   */

	    public static int exTre(int n) {
	        if (n == 0)
	            return 0;
	        else
	            return 2 - exTre(n - 1);
	    }
	
	   /**
	    * ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
	    * 
	    * Scrivere lo stato della memoria della JVM alla riga col commento // (B),
	    * ovvero giusto prima della disallocazione del frame relativo ad x, quando 
	    * il valore di j nel main e' pari ad 1.
	    */
	    public static void x(int l, boolean[][] a) {
	       boolean[] b = new boolean[l];
	       int i;
	       for (i = l - 1 ; i >= 0 ; i--)
	          b[i] = !(l % 2 == 0);
	       a[l - 1] = b;
	       // (B)
	    }

	   /******************************************/
	    public static void main(String[] args) {
	       boolean[][] a = new boolean[2][];
	       int j;
	       for (j = 0; j < a.length ; j++)
	          x(j + 1, a); // usare (A) come indirizzo di rientro
	    }
}
