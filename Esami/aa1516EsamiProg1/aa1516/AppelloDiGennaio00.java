/**
 * ESAME PROGRAMMAZIONE 1
 * 
 * Matricola:
 * 
 * Cognome:
 * 
 * Nome:
 *
 * Corso:
 * 
 * ISTRUZIONI DA ESEGUIRE NELL'ORDINE. 
 * 0) Compilare i campi Matricola, Cognome, .... 
 * 1) Ridenominare questo file in accordo col formato:
 *          Cognome_Matricola_PrimoNomeBattesimo.java 
 * 2) Quando richiesto, scrivere direttamente in questo file le soluzioni agli esercizi proposti. 
 * 3) Scrivere ora, se non lo si e' ancora fatto: 
 *    nome, cognome, matricola, corso, numero del PC sul foglio distribuito.
 * 
 * PER CONSEGNARE/PER RITIRARSI. 
 * Chiamare un docente.
 */

public class AppelloDiGennaio00 {

  /** ATTENZIONE!
   *  Metodo privato che deve essere usato dalla soluzione dell'ESERCIZIO 1 e dell'ESERCIZIO 2. 
   */
   private static boolean test(int x) {
      return (x % 3 == 2); 
   }

  /**
   * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
   * Scrivere un metodo iterativo exUno con le seguenti caratteristiche: 
   * a) exUno ha un parametro formale a di tipo (reference ad un) array di interi;
   * b) il metodo riorganizza l'array a in modo che i valori per cui il metodo 
   *    test restituisce true siano spostati nella sua parte destra,
   *    cioe' nelle posizioni con indice in valore piu' alto.
   *    In termini formali: 
   *    nell'array riorganizzato, per ogni coppia di posizioni i e j, 
   *    se i<j e test(a[j])==false, allora anche test(a[i])==false;
   * c) nell'operare la riorganizzazione, il metodo puo' modificare l'array a
   *    solo attraverso operazioni di scambio di valore tra elementi adiacenti. 
   *    Pertanto, per spostare un valore nella parte destra di a, possono essere 
   *    necessarie piu' operazioni di scambio, usando una tecnica simile a quella
   *    impiegata nell'algoritmo di Bubble sort.
   *    
   * ESEMPI. 
   * Se b-->{0, 2, 5, 1, 4} allora exUno(b) riorganizza l'array in {0, 1, 4, 5, 2} oppure 
   * {0, 1, 4, 2, 5} (il risultato dipende da scelte algoritmiche fatte).
   * Se b-->{2, 5, 8} allora exUno(b) riorganizza l'array in {8, 5, 2} oppure {2, 5, 8}.
   * 
   * DOVE SCRIVERE exUno. 
   * Il metodo exUno va scritto immediatamente al di fuori di questo commento.  
   * L'aggiunta del metodo exUno deve mantenere compilabile la classe.
   */

  /**
   * ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
   * 
   * Scrivere un metodo ricorsivo exDue con le seguenti caratteristiche: 
   * a) exDue lavora su un array a passato per riferimento;
   * b) exDue restituisce l'array a, modificato in modo che: 
   *    1) tutti e soli gli elementi di a per cui il metodo test dato e' vero siano incrementati di 1,
   *    2) la visita dell'array a DEVE procedere suddividendo a in sotto-array di lunghezza essenzialmente
   *    identica, in analogia alla ricerca dicotomica.
   * 
   * ESEMPI.
   * Se b-->{0, 2, 5, 1, 4} allora exDue(b) restituisce b-->{0, 3, 6, 1, 4}. 
   * Se b-->{2, 5, 8} allora exUno(b) restituisce b-->{3, 6, 9}.
   * Se b-->{2} allora exUno(b) restituisce b-->{3}.
   * Se b-->{1} allora exUno(b) restituisce b-->{1}.
   * Se b-->{} allora exUno(b) restituisce b-->{}.
   * 
   * DOVE SCRIVERE exDue. 
   * Il metodo exDue va scritto immediatamente al di fuori di questo commento. 
   * L'aggiunta del metodo exDue deve mantenere compilabile la classe.
   */

  /**
   * ESERCIZIO 3 (Massimo 3 + 1 + 2 + 2 + 2 punti -- da consegnare a mano).
   * Dato il metodo exTre con precondizione n >= 0 e postcondizione: 
   *                (r == 1 || r == 2) ,
   * sviluppare, uno alla volta, i seguenti passi:
   * 1) scrivere formalmente un predicato, basato su (r == 1 || r == 2), che permetta di 
   *    dimostrare per induzione la correttezza parziale di exTre ,
   * 2) scrivere esplicitamente il caso base per la dimostrazione per induzione,
   * 3) scrivere esplicitamente il caso induttivo per la dimostrazione per induzione,
   * 4) dimostrare che il caso base della dimostrazione per induzione e' vero,
   * 5) dimostrare che il caso induttivo della dimostrazione per induzione e' vero.
   */

   public static int exTre(int n) {
      int r = 1;
      int i = 0;
      while (i < n) {
         r = 2 / r;   // divisione intera
         i = i + 1;
      }
      return r;
   }

   /**
    * ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
    * 
    * Scrivere lo stato della memoria della JVM alla riga col commento // (B),
    * ovvero giusto prima della disallocazione del frame relativo ad x, quando 
    * il valore di j nel main e' pari ad 1.
    */
    public static void x(int l, boolean[][] a) {
       boolean[] b = new boolean[2];
       int i;
       for (i = 0; i < l; i++)
          b[i] = (i % 2 == 0);
       a[l] = b;
       // (B)
    }

   /******************************************/
    public static void main(String[] args) {
       boolean[][] a = new boolean[2][];
       int j;
       for (j = a.length; j > 0 ; j--)
          x(j - 1, a); // usare (A) come indirizzo di rientro
    }
}
