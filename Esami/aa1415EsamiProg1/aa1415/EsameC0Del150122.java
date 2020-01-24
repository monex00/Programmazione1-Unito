/**
 *  ESAME PROGRAMMAZIONE 1 ESTRATTO
 */

public class EsameC0Del150122 {

	/**
	 * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * 
	 * Scrivere un metodo exUno che: 
	 * (i) prenda due array a e b di interi come parametri, 
	 * (ii) restituisca true se esiste almeno un elemento in a inferiore ad ogni 
	 * elemento di b, false altrimenti.
	 * 
	 * ESEMPI.
	 * Con a == {3,4,1} e b == {1,2,3} il risultato e' false perche'
	 * nessun elemento di a e' inferiore a tutti gli elementi di b. 
	 * Con a == {3,0,1} e b == {1,2,3} il risultato e' true perche'
	 * a contiene 0 che e' inferiore a tutti gli elementi di b. 
	 */

	/*
	 * Scrivere qui le soluzioni all'ESERCIZIO 1.
	 */
	
	/**
	 * ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * 
	 * Scrivere un metodo ricorsivo exDue che: 
	 * (i) prenda un array a di interi come parametro,
	 * (ii) alteri a in modo da scambiare ogni elemento di posizione pari con
	 * l'elemento della successiva posizione, se questa esiste.
	 * Se lo si ritiene necessario, definire un metodo di supporto richiamato 
	 * da exDue.
	 * 
	 * ESEMPIO.
	 * Con a == {1,2,3,4,5,6} il risultato e' {2,1,4,3,6,5}. 
	 * Con a == {1,2,3,4,5} il risultato e' {2,1,4,3,5}. 
	 */

	/*
	 * Scrivere qui le soluzioni all'ESERCIZIO 2.
	 */

	/**
	 * ESERCIZIO 4 (Massimo 6 punti -- da consegnare a mano).
	 * 
	 * O per induzione, o riscrivendo il predicato
	 *    false||a[0]||...||a[i-1] == r
	 * dimostrare che il seguente metodo restituisce in r la disgiunzione 
	 * degli elementi in a. 
	 */
	public static boolean disg(boolean[] a) {
		boolean r = false;
		int i = 0;
		while (i < a.length) {
			r = r || a[i];
			i = i + 1;
		}
		return r;
	}

	/**
	 * ESERCIZIO 5 (Massimo 7 punti -- da consegnare a mano).
	 * 
	 * Usando i metodi main, x e y, scrivere lo stato della memoria 
	 * della JVM giusto prima della disallocazione del frame di attivazione del metodo y, 
	 * creato conseguentemente alla chiamata alla riga contrassegnata con ***.
	 */
	public static void y(boolean[] b, boolean[] a) {
		for (int i = b.length - 1; i >= 0; i--)
			b[i] = b[i] || a[i];
	}

	public static void x(boolean[] a) {
		boolean[] b = new boolean[a.length];
		for (int i = a.length - 1; i > 0; i--)
			b[i - 1] = a[i];
		b[b.length - 1] = true;
		y(b, a); // ***
	}

	/******************************************/
	public static void main(String[] args) {
		boolean[] a = { true, false, true, true, false };
		x(a); // +++
	}
}
