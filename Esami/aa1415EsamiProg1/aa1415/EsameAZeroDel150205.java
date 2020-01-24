/**
 * ESAME PROGRAMMAZIONE 1 ESTRATTO
 */

public class EsameAZeroDel150205 {

	/**
	 * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 *
	 * Assumiamo di rappresentare PER COLONNA matrici quadrate di interi
	 * usando gli "array di array" di Java. Ad esempio, una matrice quadrata:
	 *
	 * 1 0 0 0
	 * 2 3 8 3
	 * 4 5 6 0
	 * 7 8 9 3
	 *
	 * e` rappresentata PER COLONNA con un "array di array" se e' definita come segue:
	 *
	 * static int[][] m = {{1, 2, 4, 7},
	 *                     {0, 3, 5, 8},
	 *                     {0, 8, 6, 9},
	 *                     {0, 3, 0, 3}};
	 *
	 * Definire un metodo exUno che:
	 * (i) prenda come unico parametro formale, di nome m, una matrice quadrata di interi 
	 * rappresentata PER COLONNA;
	 * (ii) restituisca 'true' se e solo se TUTTI gli elementi al di sopra della diagonale
	 * principale hanno valore 0 e gli elementi della diagonale hanno un valore che e` un multiplo di 3.
	 *
	 * Esempio, se m rappresenta una matrice cosi` fatta:
	 *
	 * 1 0 0 0
	 * 2 3 0 0
	 * 6 4 0 0
	 * 1 0 2 3
	 *
	 * allora il metodo deve restituire 'false' perche` sebbene tutti gli elementi al di sopra della diagonale
	 * siano nulli, ALMENO un elemento della diagonale (quello in posizione 0,0 cha ha valore 1) non e` multiplo di 3.
	 * Se m rappresenta una matrice cosi` fatta:
	 *
	 * 9 0 0 1
	 * 0 3 0 0
	 * 3 0 0 0
	 * 0 0 0 6
	 *
	 * allora il metodo deve restituire 'false', perche` sebbene TUTTI gli elementi della diagonale
	 * siano multipli di 3, esiste un elemento non nullo al di sopra della diagonale,
	 * quello in posizione riga,colonna (0,3) cha ha valore 1.
	 * Se m rappresenta una matrice cosi` fatta:
	 *
	 * 9 0 0 0
	 * 0 3 0 0
	 * 2 2 0 0
	 * 1 9 8 6
	 *
	 * allora il metodo deve restituire 'true', perche` TUTTI gli elementi della diagonale
	 * sono multipli di 3, e TUTTI gli elementi al di sopra della diagonale sono nulli.
	 *
	 * Si assuma come condizione di input per il valore del parametro formale 'm'
	 * che rappresenti una matrice quadrata (pertanto non e`richiesto alcun controllo
	 * di questa condizione). E` pero` richiesto che il metodo si comporti correttamente
	 * per qualsiasi valore di 'm' che soddsfi la condizione di input.
	 */
	
    /* 
     * Scrivere qui sotto il metodo soluzione in modo che l'intera classe compili
     */

	/**
	 * ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * 
	 * Scrivere un metodo ricorsivo exDue che: 
	 * (i) prenda un array a di interi e tre parametri interi: i (inizio), f (fine) e v (valore),
	 * (ii) restituisca true se ogni elemento di a compreso tra i, incluso, ed f, escluso, sia divisore 
	 * intero di v, false altrimenti.
	 * 
	 * ESEMPI.
	 * Con a == {3,4,1,1,2,3,3,2,4}, i == 1, f == 5 e v == 8 il risultato e'  true perche' 4, 1, 1 e 2
	 * sono divisori interi di 8. 
	 * Con a == {3,4,1,1,2,3,3,2,4}, i == 1, f == 6 e v == 8 il risultato e' false perche' 3 non e'
	 * divisore intero di 8. 
	 * 
	 * È opportuno definire un metodo di supporto richiamato da exDue e che verifichi effettivamente 
	 * la proprieta' dell'intervallo.
	 */

    /* 
     * Scrivere qui sotto il metodo soluzione in modo che l'intera classe compili
     */	
	
	/**
	 * ESERCIZIO 3 (Massimo 6 punti -- da consegnare elettronicamente).
	 * 
	 * Dato il seguente metodo, rispondere alle seguenti domande:
	 * (1) Se inizio == 3 e a == { 0, 1, 2, 3, 4, 5, 6} cosa contiene a al termine 
	 * dell'istruzione contrassegnata con *** ?
	 * (2) modificare direttamente il metodo aggiungendo un contatore di tipo 
	 * appropriato che conti il numero di esecuzioni del corpo del ciclo, in modo che 
	 * il suo valore venga restituito come risultato del metodo. 
	 */
	public static void exTre(int[] a, int inizio) {
		if (inizio < a.length) {
			for (int i = inizio; i < a.length - 1; i++)
				a[i + 1] = a[i];
			a[inizio]++; // ***
		}
	}

    /* 
     * Aggiungere qui sotto la soluzione alla domanda (1) in modo che la classe compili
     */
}
