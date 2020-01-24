/**
 *  ESAME PROGRAMMAZIONE 1 ESTRATTO
 */

public class EsameA1Del150122 {

	/**
	 * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * 
	 * Scrivere un metodo exUno che: 
	 * (i) prenda una matrice m di interi come parametro, 
	 * (ii) restituisca true se esiste almeno una riga nella quale ogni elemento 
	 * sia strettamente minore del precedente, ammesso che il precedente esista, e 
	 * false altrimenti.
	 * 
	 * ESEMPI.
	 * Con m == {{3,4,1},{3,2,1},{3,4,2}} il risultato e' true perche'
	 * la seconda riga soddisfa la condizione. 
	 * Con m == {{3,4,1},{1,3,2},{3,4,2}} il risultato e' false perche'
	 * nessuna delle righe soddisfa la condizione. 
	 */

	/* 
	 * Scrivere qui la soluzione all'ESERCIZIO 1
	 */
	
	/**
	 * ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * 
	 * Scrivere un metodo ricorsivo exDue che: 
	 * (i) prenda un array a di interi ed un valore v come parametri,
	 * (ii) alteri a in modo che il valore di ogni a[i] sia raddoppiato se
	 * minore di v ed in posizione dispari.
	 * Se lo si ritiene necessario, definire un metodo di supporto richiamato 
	 * da exDue.
	 * 
	 * ESEMPI.
	 * Con a == {3,4,1,1,2,3,3,2,4} e v == 2 il risultato e' 
	 * {3,4,1,2,2,3,3,2,4}. 
	 * Con a == {3,4,1,1,2,3,3,2,4} e v == 5 il risultato e'
	 * {3,8,1,2,2,6,3,4,4}. 
	 */

	/* 
	 * Scrivere qui la soluzione all'ESERCIZIO 2
	 */
		
	/**
	 * ESERCIZIO 4 (Massimo 6 punti -- da consegnare a mano).
	 * 
	 * O per induzione, o riscrivendo il predicato
	 *    a[0]*...*a[i-1] == r
	 * dimostrare che il seguente metodo restituisce in r il prodotto 
	 * degli elementi in a. 
	 */
	public static int prodotto(int[] a) {
		int r = 1;
		int i = 0;
		while (i < a.length) {
			r = r * a[i];
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
			b[i] = b[i] && a[i];
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
