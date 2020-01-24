public class SimulazioneAlternativaConSoluzioni {
	/** ESERCIZIO 2.
     * Scrivere un metodo ricorsivo dicotomico e2 con 
     * le seguenti caratteristiche:
     * -) e2 ha un parametro formale di tipo array di
     * interi, e un parametro s di tipo int.
     * -) e2 restituisce true quando:
     *    a) l'array non e' nullo e
     *    b) almeno uno degli elementi e' > s.       */
	public static boolean e2(int[] x, int s) {
		boolean risultato = (x != null);
		if (risultato) {
			risultato = x.length==0;
			if(!risultato) 
				risultato = e2(x, 0, x.length, s);
		}
		return risultato;
	}

	public static boolean e2(int[] x, int l, int r, int s) {
		if (l + 1 == r)
			return (x[l] > s);
		else {
			int m = (l + r) / 2;
			return e2(x, l, m, s) || e2(x, m, r, s);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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

	
	
	
	
	
	
	
	
	
	
	
	
	
	/* Soluzione possibile. 
	 * 1) P(0) e' 
	 *     "Alla sua uscita, parity(a,0) 
     *      rende vero a[0]==(0%2==0)".
	 * 
	 * 2) P(i-1) ==> P(i) e'
	 *    "Alla sua uscita, parity(a,i-1) 
     *     rende vero a[i-1]==((i-1)%2==0)"
     *    ==> "Alla sua uscita, parity(a,i) 
     *         rende vero a[i]==(i%2==0)".
     *                  
	 * 3) Osserviamo che:
	 * --) per definizione, parity(a,0) esegue a[0]=true 
	 * e poi termina.
	 * Quindi:
	 *       a[0] == true == (0%2==0).
	 * 
	 * 4) Per ipotesi induttiva assumiamo P(i-1) vero:
	 *  
	 *    "Alla sua uscita, parity(a,i-1) 
     *     rende vero a[i-1]==((i-1)%2==0)"	 
     *          
     * e' vero. 
     * 
     * --- Caso 1) Assumiamo che i-1 sia pari.
     * Quindi, per ipotesi, e' vero:
     * 
     *      a[i-1]==((i-1)%2==0)
     *      
     * nel punto (A) che e' seguito dalla assegnazione  
     * 'a[i] = !a[i-1]'. Siccome i-1 e' pari, allora i 
     * e' dispari e possiamo scrivere:
     * 
     *      a[i] == !a[i-1]
     *           == !((i-1)%2==0)
     *           == !true
     *           == false
     *           == (i%2==0).
     *      
     * vero nel punto (B) che e' esattamente P(i).	 
     *  
     * --- Caso 2) Assumiamo che i-1 sia dispari.
     * Quindi, per ipotesi, e' vero:
     * 
     *      a[i-1]==((i-1)%2==0)
     *   
     * nel punto (A) che e' seguito dalla assegnazione 
     * 'a[i] = !a[i-1]'. Siccome i-1 e' dispari, allora 
     * i e' pari e possiamo scrivere:
     * 
     *      a[i] == !a[i-1]
     *           == !((i-1)%2==0)
     *           == !false
     *           == true
     *           == (i%2==0).
     *      
     * vero nel punto (B) che e' esattamente P(i).  */	 
}
