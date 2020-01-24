public class SimulazioneAlternativa {
	/** ESERCIZIO 2.
     * Scrivere un metodo ricorsivo dicotomico e2 con 
     * le seguenti caratteristiche:
     * -) e2 ha un parametro formale di tipo array di
     * interi, e un parametro s di tipo int.
     * -) e2 restituisce true quando:
     *    a) l'array non e' nullo e
     *    b) almeno uno degli elementi e' > s.       */

	/** ESERCIZIO 3. 
     * Siano dati:
     * -) il metodo parity, qui sotto definito, da 
     * applicare esclusivamente ad un parametro 
     * attuale con almeno un elemento (a.length>=1)
     * -) il predicato P(i) seguente:
     *
     *  "Alla sua uscita, parity(a,i) 
     *   rende vero a[i]==(i%2==0)".
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
}
