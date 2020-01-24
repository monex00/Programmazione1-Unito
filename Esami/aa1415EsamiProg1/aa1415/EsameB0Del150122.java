/**
 *  ESAME PROGRAMMAZIONE 1 ESTRATTO
 */

public class EsameB0Del150122 {

	/**
	 * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * 
	 * Scrivere un metodo exUno che: 
	 * (i) prenda una matrice m di interi con almeno due righe come parametro, 
	 * (ii) restituisca true se in ogni riga, tranne la prima,
	 * esiste almeno un elemento che sia strettamente maggiore di quello corrispondente nella riga 
	 * precedente e false altrimenti.
	 * 
	 * ESEMPI.
	 * Con m == {{3,4,1},
	 *           {1,2,3},
	 *           {3,4,2}} 
	 * il risultato e' true perche' nella 2da riga 3>1 e nella 3za riga 3>1  
	 * Con m == {{3,4,1},
	 *           {3,2,1},
	 *           {3,2,2}} il risultato e' false perche'
	 * in nessuna delle righe esiste un elemento maggiore del corrispondente
	 * nella riga precedente.
	 * Ricordiamo che, ad esempio, un parametro m == {{3,4,1}} non e' ammesso.
	 */
	 
	/* 
	 * Scrivere qui la soluzione all'ESERCIZIO 1.
	 */

	/**
	 * ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * 
	 * Scrivere un metodo ricorsivo exDue che: 
	 * (i) prenda un array a di interi come parametro,
	 * (ii) alteri a in modo che ogni cella a[i] di posizione i pari sia 
	 * ricoperta con la cella successiva.
	 * Se lo si ritiene necessario, definire un metodo di supporto richiamato 
	 * da exDue.
	 * 
	 * ESEMPI.
	 * Con a == {3,4,1,1,2,3,3,2,4} il risultato e' 
	 * {4,4,1,1,3,3,2,2,4}. 
	 * Con a == {3,4,1,1,2,3,3,2} il risultato e' 
	 * {4,4,1,1,3,3,2,2}. 
	 */

	/* 
	 * Scrivere qui la soluzione all'ESERCIZIO 2.
	 */

	
	/**
	 * ESERCIZIO 4 (Massimo 6 punti -- da consegnare a mano).
	 * 
	 * Sia dato un array a con n > 0 elementi. 
	 * Per induzione, sul valore di n, dimostrare che
	 *    a[0]+...+a[n-1] == somma(a, n).
	 */
	public static int somma(int[] a, int n) {
		if (n > 0)
			return somma(a, n - 1) + a[n - 1];
		else
			return 0;
	}

	/**
	 * ESERCIZIO 5 (Massimo 7 punti -- da consegnare a mano).
	 * Usando i metodi main, x e y, scrivere lo stato della memoria 
	 * della JVM giusto prima della disallocazione del frame di attivazione del metodo y, 
	 * creato conseguentemente alla chiamata alla riga contrassegnata con ***.
	 */
	public static void y(boolean[] b, boolean[][] a, int i) {
		a[i] = b;
	}

	public static void x(boolean[][] a) {
		boolean[] b = new boolean[a[1].length];
		for (int i = 0; i < a[1].length; i++)
			b[i] = !a[0][i];
		y(b, a, 1); // ***
	}
	
	/******************************************/
	public static void main(String[] args) {
		boolean[][] a = { { true, false }, { true, false } };
		x(a); // +++
	}
}
