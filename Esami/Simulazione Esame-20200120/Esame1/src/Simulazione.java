public class Simulazione {
	/** ESERCIZIO 1. 
	 * Scrivere un metodo iterativo e1 con le seguenti 
	 * caratteristiche:
	 * -) e1 ha un parametro formale di tipo matrice 
	 * bidimensionale di interi che puo' essere solo 
	 * quadrata, o nulla.
	 * -) e1 restituisce true quando:
	 *    a) la matrice non e' nulla e
	 *    b) la somma degli elementi di ciascuna riga 
	 *    concide con la somma degli elementi della 
	 *    colonna corrispondente. */

	public static boolean e1(int[][] mat){
		boolean concindono = true;
		if(mat != null){
			int sommaRiga = 0;
			int sommaCol = 0;

			for( int i = 0; concindono && i<mat.length; i++){
				for(int j = 0; j<mat[i].length; j++){
					sommaRiga = sommaRiga + mat[i][j];
					sommaCol = sommaCol + mat[j][i];
				}
				concindono = sommaRiga == sommaCol;
			}

		}else{
			concindono = false;
		}

		return concindono;
	}
	
	/** ESERCIZIO 2. 
	 * Scrivere un metodo ricorsivo dicotomico e2 con 
	 * le seguenti caratteristiche:
	 * -) e2 ha un parametro formale di tipo matrice 
	 * bidimensionale di interi che puo' essere solo 
	 * quadrata, o nulla.
	 * -) e2 restituisce true quando:
	 *    a) la matrice non e' nulla e
	 *    b) la somma degli elementi di ciascuna riga 
	 *    concide con la somma degli elementi della 
	 *    colonna corrispondente. 
	 * Per il calcolo della somma degli elementi in 
	 * una riga, definire un metodo ricorsivo sommaR 
	 * co-variante. Per il calcolo della somma degli 
	 * elementi in una colonna, definire un metodo 
	 * ricorsivo sommaC contro-variante.           */

	public static int sommaR(int[] riga, int i){
		if(i == 0){
			return riga[i];
		}else{
			return sommaR(riga, i - 1) + riga[i];
		}
	}


	public static int sommaCol(int[][] mat, int nCol, int nRiga){
		if(nRiga + 1 == mat[nCol].length ){
			return mat[nRiga][nCol];
		}else{
			return sommaCol(mat,nCol, nRiga + 1) + mat[nRiga][nCol];
		}
	}

	public static boolean e2(int[][] mat){
		boolean res;
		if (mat != null){
			res = e2(mat,0,mat.length);
		}else{
			res = false;
		}
		return res;
	}

	private static boolean e2(int[][] mat, int l, int r){
		if(l + 1 == r){
			return sommaR(mat[l], mat[l].length - 1) == sommaCol(mat, l,0);
		}else{
			int m = (l + r) / 2;
			return e2(mat,l,m) && e2(mat, m, r);
		}
	}
	

	
	
	
	
	
	
	
	
	/** ESERCIZIO 3. 
     * Siano dati:
     * -) il metodo parity, qui sotto definito, 
     * da applicare esclusivamente ad un parametro 
     * attuale con almeno un elemento (a.length>=1)
     * -) il predicato P(i) seguente:
     *
     *  "Alla sua uscita, parity(a,i) rende vero 
     *    'per ogni k.se 0<= k <= i, \
     *                allora a[k]==(k%2==0)' ".
     *
     * 1) Scrivere il predicato P(0).
     * 2) Scrivere il predicato P(i-1) ==> P(i).
     * 3) Dimostrare che P(0) e' vero.
     * 4) Dimostrare che P(i-1) ==> P(i) e' vero, 
     * ragionando induttivamente.                */ 	
	static void parity(boolean[] a, int i) {
		if (i < a.length) {
			if (i == 0)
				a[i] = true;
			else {
				parity(a, i - 1); //(A)
				a[i] = !a[i - 1]; //(B)
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	/** ESERCIZIO 4. Disegnare lo stato della 
	 * memoria immediatamente prima della 
	 * disallocazione del record di attivazione 
	 * del metodo stack, quando i ha valore 2. */
	static void stack(int[][] x, int i) {
		if (i < x.length) {
			int[] l = new int[x[i].length];
			l[i] = x[i][i] + 1;
			x[i] = l;
			stack(x, i + 1); // (B)
		}
	}

	public static void main(String[] args) {
		int[][] y = {{0,0}, {0,0}};
		stack(y, 0); // (A)
	}
}