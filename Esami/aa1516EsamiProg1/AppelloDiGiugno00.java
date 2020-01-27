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
 * 3) Scrivere ora, se non lo si è ancora fatto: 
 *    nome, cognome, matricola, corso, numero del PC sul foglio distribuito.
 * 
 * PER CONSEGNARE/PER RITIRARSI. 
 * Chiamare un docente.
 */

public class AppelloDiGiugno00 {

/** Metodo privato: calcola l'elevamento del valore in x all'esponente y 
 *  e deve essere usato dalla soluzione di exUno 
 */
  private static int pow(int x, int y) {
    int ris = 1;
    while (y > 0 ) {
      ris = ris * x;
      y = y - 1;
    }
    return ris;
  }

/**
 * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
 * 
 * Scrivere un metodo iterativo exUno con le seguenti caratteristiche: 
 *
 * a) exUno ha un parametro formale m di tipo reference ad array di array di interi
 * ed un parametro formale a di tipo reference ad array interi; exUno puo' assumere che 
 * gli elementi m[i] di m, di seguito chiamati 'righe' di m, abbiano uguale dimensione;
 * 
 * b) exUno restituisce la somma pow(2, rMin) + pow(3, rMax) dove:
 *    - rMin, se determinabile, e' il piu' PICCOLO indice di riga di m tale che
 *      a[i]==m[rMin][i] per i=0,1,...,a.length-1 e a.length<=m[rMin].length
 *      ossia rMin individua, se esiste, la prima riga di m a partire dalla numero 0
 *      tale che i suoi primi a.length elementi coincidano con a;
 *    - rMax, se determinabile, e' il piu' GRANDE indice di riga di m tale che
 *      a[i]==m[rMax][i] per i=0,1,...,a.length-1 e a.length<=m[rMax].length
 *      ossia rMax individua, se esiste, la prima riga di m a partire dalla numero m.length-1
 *      tale che i suoi primi a.length elementi coincidano con a.
 *
 * In QUALSIASI ALTRO CASO exUno restituisce 0. 
 * 
 * ESEMPI:
 *
 * Sia m->{{0, 1, 2, 3}, 
 *         {4, 5, 6, 7},
 *         {8, 1, 2, 3},
 *         {4, 5, 6, 9}}.
 *
 * Se a -> {0,1,2,3} allora exUno restituisce 2 perche' rMin == rMax == 0.
 * Se a -> {4,5,6} allora exUno restituisce 29 perche' rMin == 1 e rMax == 3. 
 * Se a -> {0,1,2,3,4} allora exUno restituisce 0 perche' a e' piu' lunga di qualsiasi riga.
 * Se a -> {1,2,3} allora exUno restituisce 0 perche' a, pur comparendo nelle righe 0 e 2 di
 * m, non comincia in nessuna delle due alla colonna 0.
 * 
 * DOVE SCRIVERE exUno. 
 * Il metodo exUno va scritto immediatamente al di fuori di questo commento. 
 * L'aggiunta del metodo exUno deve mantenere compilabile la classe.
 */

/**
 * ESERCIZIO 2 (Massimo 8 punti -- da consegnare elettronicamente).
 * 
 * Scrivere un metodo exDue con le seguenti caratteristiche: 
 *
 * a) exDue ha un parametro formale m di tipo reference ad array di array di interi
 *    ed un parametro formale a di tipo reference ad array interi.
 *    exDue puo' assumere che gli elementi m[i] di m, nel seguito chiamati 'righe',
 *    abbiano identica dimensione;
 *
 * b) exDue restituisce true se e solo se gli elementi a[i] di a appaiono nell'ordine
 *    stabilito dall'indice i in almeno una riga m[r] di m, cioe' esiste un r tale che:
 *    a[i] == m[r][i] per i=0,1,...,a.length-1 e a.length <= m[r].length.
 *    Se a.length > m[r].length allora la condizione richiesta non puo' essere 
 *    ovviamente soddisfatta ed il risultato e' false.
 * 
 * c) exDue deve calcolare il risultato richiamando uno o piu' metodi ricorsivi. 
 *    Questo significa NON POTER USARE iterazioni per mezzo dei costrutti while o do-while.
 * 
 * ESEMPI:
 * 
 * Sia m->{{9, 1, 2, 0},
 *         {4, 5, 5, 4},
 *         {8, 1, 1, 8},
 *         {4, 5, 5, 6}}.
 *
 * Se a -> {4,5,5} allora exDue restituisce true perche' a compare sia nella riga 1
 * che nella riga 3, a partire dalla colonna 0.
 * Se a -> {4,5,5,4,6} allora exDue restituisce false perche' a  e' troppo lungo.
 * Se a -> {4,5,5,3} allora exDue restituisce false perche' a non coincide con alcuna riga.
 * Se a -> {5,5,4} allora exDue restituisce false perche' a e' sia nella riga 1 sia nella riga 3,
 * ma non vi compare a partire dalla colonna 0.
 * 
 * DOVE SCRIVERE exDue. 
 * Il metodo exDue va scritto immediatamente al di fuori di questo commento. 
 * L'aggiunta del metodo exDue deve mantenere compilabile la classe.
 */

/**
 * ESERCIZIO 3 (Massimo 3 + 1 + 2 + 2 + 2 punti -- da consegnare a mano). 
 * Siano dati il metodo exTre, ed il seguente predicato:
 * P(a,numEl) == "exTre(a, numEl) restituisce il numero di valori pari in a[0 .. numeEl - 1]"
 * Dimostrare per induzione sul valore di numEl che, per ogni array di interi a, 
 * exTre(a, a.length) restituisce la quantita' di valori pari in a.
 * 
 * Sviluppare alla volta i seguenti passi:
 * 1) scrivere formalmente un predicato P che permetta di dimostrare per induzione la correttezza 
 * parziale di exTre,
 * 2) scrivere esplicitamente il caso base per la dimostrazione per induzione,
 * 3) scrivere esplicitamente il caso induttivo per la dimostrazione per induzione,
 * 4) dimostrare che il caso base della dimostrazione per induzione e' vero,
 * 5) dimostrare che il caso induttivo della dimostrazione per induzione e' vero.
 */

   public static int exTre(int[] a, int numEl) {
   	if (numEl == 0)
   	  return 0;
   	else 
   	   if (a[numEl - 1] % 2 == 0)
   		 return 1 + exTre(a, numEl - 1);
   	   else 
   		 return exTre(a, numEl - 1);
   }
   
/**
 * ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
 * 
 * Scrivere lo stato della memoria della JVM alla riga col commento // (C),
 * ovvero giusto prima della disallocazione del frame del metodo f.
 */

  public static int f(int[] a, int i) {
    a[i] = a[i] - a.length;
    return a[i];      // (C)
  }

  public static int g(int[][] m) {
    return f(m[m.length - 1], m[0][m[1].length]); // (B)
  }

  /*************************************************/
  public static void main(String[] args) {
    int[][] m = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 }, { 9, 10, 11, 12, 13 } };
    System.out.println(g(m)); // (A)
  }
}
