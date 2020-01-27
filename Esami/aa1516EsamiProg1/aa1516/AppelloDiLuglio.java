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
 *  *    nome, cognome, matricola, corso, numero del PC sul foglio distribuito.
 * 
 * PER CONSEGNARE/PER RITIRARSI. 
 * Chiamare un docente.
 */

public class AppelloDiLuglio {

/**
 * ESERCIZIO 1 (Massimo 8 punti -- da consegnare elettronicamente).
 * 
 * Scrivere un metodo iterativo exUno con le seguenti caratteristiche: 
 *
 * a) exUno ha un parametro formale di nome m di tipo 'reference ad array di array di interi'
 *    e un parametro formale di nome b di tipo intero;
 *    exUno puo' assumere che gli elementi m[i] di m, di seguito chiamati 'righe' di m, abbiano 
 *    uguale dimensione;
 *
 *    Esempio di valore reale per m passato a exUno ad una invocazione di metodo:
 *
 *    m -> { {0,7,2,3}, {4,9,6,5}, {8,1,2,3}, {4,5,6,9}, {3,8,4,9}, {2,7,4,2} }
 *             m[0]        m[1]       m[2]       m[3]       m[4]       m[5]
 *    m ha 6 righe, numerate da 0 a 5. Ciascuna riga ha 4 elementi.
 *
 * b) exUno restituisce un array di boolean che ha tanti elementi quante sono le righe di m
 *    e tale che se a e' il nome dell'array allora a[i]==true se e solo se la riga m[i] di m
 *    contiene b.
 *
 * Accertarsi che il metodo exUno tratti correttamente il caso di m vuota (m->{}) o m==null.
 * In questi casi exUno deve restituire rispettivamente un array vuoto o un reference
 * con valore null.
 * 
 * Esempio: se b==2 e m e' come nell'esempio sopra allora exUno deve restituire il seguente
 * array
 *           { true, false, true, false, false, true}
 *  
 * Scrivere la soluzione all'esercizio immediatamente dopo questo commento, mantenendo la classe
 * compilabile.
 */
    
/**
 * ESERCIZIO 2 (Massimo 8 punti -- da consegnare elettronicamente).
 * 
 * Scrivere un metodo exDue che, dato un intero k, se k >=0 restituisca un array di interi di lunghezza k + 1,
 * tale che a[i] contenga la somma 0+1+2+...+i, per ogni i <= k.
 * 
 * Il metodo exDue deve richiamare un solo metodo ricorsivo exDueSupporto. Quest'ultimo deve avere 
 * almeno due parametri:
 * --) il parametro k,
 * --) il parametro a di tipo reference ad array di interi che conterra' il risultato.
 * 
 * ESEMPIO.
 * exDue(-1) --> null.
 * exDue(0) --> { 0 }.
 * exDue(1) --> { 0, 0 + 1 }.
 * exDue(2) --> { 0, 0 + 1, 0 + 1 + 2 }.
 * exDue(3) --> { 0, 0 + 1, 0 + 1 + 2, 0 + 1 + 2 + 3 }.
 *  
 * Scrivere la soluzione all'esercizio immediatamente dopo questo commento, mantenendo la classe
 * compilabile.
 */

/**
 * ESERCIZIO 3 (Massimo 7 punti -- da consegnare a mano). 
 * Dimostrare per induzione su un opportuno parametro che, per ogni n >= 0
 * e' vero il predicato	P(n) = "exTre(2^n) == n",
 * dove il metodo ricorsivo exTre e' definito da:

	static int exTre(int n){
	if (n > 1)
   		 return 1 + exTre(n/2);    // la divisione e' intera
	else
    		return 0;
	}
 *
 * Svolgere su foglio l'esercizio secondo la seguente traccia:
 *
 * 1) Formulare e dimostrare la base dell'induzione [1 + 2 pt]
 * 2) Formulare e dimostrare il passo induttivo, mettendo in evidenza l'ipotesi induttiva [2 + 2 pt];
 */   

/**
 * ESERCIZIO 4 (Massimo 9 punti -- da consegnare a mano).
 * 
 * Scrivere sul foglio consegnato lo stato della memoria della JVM alla riga 
 * col commento // (C), ovvero giusto prima della disallocazione del frame del metodo f.
 */

  public static int f(int[] a, int i) {
    a[i - 1] = a[i - 1] - a.length;
    return a[i - 1];      // (C)
  }

  public static int g(int[][] m) {
    return f(m[0], m[0][m[1].length]); // (B)
  }

  /*************************************************/
  public static void main(String[] args) {
    int[][] m = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 }, { 9, 10, 11, 12, 13 } };
    System.out.println(g(m)); // (A)
  }	
}
