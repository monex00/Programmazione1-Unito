/**
 * ESAME PROGRAMMAZIONE 1 
 * Matricola:
 * 
 * Cognome:
 * 
 * Nome:
 *
 * Corso:
 * 
 * ISTRUZIONI DA ESEGUIRE NELL'ORDINE. 
 * 0) Compilare i campi Matricola, Cognome,.... 
 * 1) Ridenominare questo file in accordo col formato:
 * 
 * Cognome_Matricola_PrimoNomeBattesimo.java 
 * 
 * 2) Quando richiesto, scrivere direttamente in questo file le soluzioni agli 
 * esercizi proposti. 
 * 3) Scrivere ora, se non lo si e' ancora fatto: nome, cognome, matricola, 
 * corso, numero del PC sul foglio distribuito.
 * 
 * PER CONSEGNARE/PER RITIRARSI. 
 * Chiamare un docente.
 */

public class AppelloDiSettembre {
	/**
	 * ESERCIZIO 1 (Massimo 8 punti -- da consegnare elettronicamente).
	 * 
	 * Scrivere un metodo iterativo exUno con le seguenti caratteristiche:
	 *
	 * a) exUno ha un parametro formale m di tipo reference ad array di array
	 * di boolean. Si assuma che gli elementi m[i] di m, di seguito chiamati
	 * 'righe' di m, abbiano identica lunghezza;
	 *
	 * Una possibile istanza di m puo' essere: 
	 *   m -> { {true,false,false,true},{true,true,true,true}, {false,false,false,false}, {false,true,false,true}} 
	 *                    m[0]                   m[1]                    m[2]                     m[3] 
	 * nella quale m ha 4 righe, numerate da 0 a 4, ciascuna con 4 elementi.
	 *
	 * b) exUno restituisce un array a di interi con tanti elementi quante sono
	 * le righe di m tale che a[i] contenga il numero di occorrenza di true
	 * nella i-esima riga m. 
	 * exUno non deve produrre alcun tipo di errore run-time.
	 * 
	 * Esempio. 
	 * Se m e' come sopra allora exUno restituisce:
	 *     a--> {2, 4, 0, 2}. 
	 * Se m = null, e' ragionevole restituire a = null.
	 * 
	 * Scrivere la soluzione all'esercizio immediatamente dopo questo commento,
	 * mantenendo la classe compilabile.
	 */
	
	/**
	 * ESERCIZIO 2 (Massimo 8 punti -- da consegnare elettronicamente).
	 * 
	 * Scrivere un metodo exDue che, dato un intero k, se k>0, allora exDue
	 * restituisca un array di interi di lunghezza k, tale che 
	 * a[i-1] contenga il risultato della sommatoria 2+4+6+8...+(2*i), per ogni 0<=i<k. 
	 * Se, invece, k<=0, allora exDue deve restituire null.
	 * 
	 * Il metodo exDue deve richiamare un solo metodo ricorsivo exDueSupporto.
	 * exDueSupporto deve avere esattamente tre parametri nel seguente ordine: 
	 * --) k che determina il numero di chiamate ricorsive, 
	 * --) a di tipo reference ad array di interi che conterra' il risultato, 
	 * --) i indice ricorsivo.
	 * 
	 * ESEMPIO. 
	 * exDue(-1) --> null. 
	 * exDue( 0) --> null. 
	 * exDue( 1) --> { 2 }.
	 * exDue( 2) --> { 2, 2 + 4 }. 
	 * exDue( 3) --> { 0, 2 + 4, 2 + 4 + 6 }.
	 * 
	 * Scrivere la soluzione all'esercizio immediatamente dopo questo commento,
	 * mantenendo la classe compilabile.
	 */

	/**
	 * ESERCIZIO 3 (Massimo 7 punti -- da consegnare a mano). Dimostrare per
	 * induzione su n che, per ogni n >= 0 e' vero il predicato 
	 *   P(b, n) = "exTre(b, b^n) == n + 1", 
	 * dove il metodo ricorsivo exTre e' definito da:
	 */

	 public static int exTre(int b, int x) { 
		  if (x > 1) 
			  return 1 + exTre(b, x/b); // divisione intera
		  else 
			  return 1; 
		  }
	  
	 /* Svolgere su foglio l'esercizio secondo la seguente traccia:
	 *
	 * 1) Formulare e dimostrare la base dell'induzione [voto: 1 punto + 2 punti] 
	 * 2) Formulare e dimostrare il passo induttivo, mettendo in evidenza 
	 * l'ipotesi induttiva [voto: 2 punti + 2 punti];
	 */

	/**
	 * ESERCIZIO 4 (Massimo 9 punti -- da consegnare a mano).
	 * 
	 * Scrivere sul foglio consegnato lo stato della memoria della JVM quando si 
	 * cominci l'interpretazione dell riga di commento // (C), avendo il frame del metodo g 
	 * allocato dalla chiamata contrassegnata con (B) nel sorgente di f.
	 */

	public static void g(int[][] m, int r) {
		boolean stop = false;
		for (int c = 0; c < m[r].length && !stop; c++)
			if (6 == m[r][c]) {
				m[r] = new int[2];
				stop = true;
			} else
				m[r] = null;
		// (C)
	}

	public static void f(int[][] m) {
		g(m, 0); 
		g(m, 1); // (B)
	}

	/*************************************************/
	public static void main(String[] args) {
		int[][] m = { { 4, 5 }, { 6, 7} };
		f(m); // (A)
	}
}
