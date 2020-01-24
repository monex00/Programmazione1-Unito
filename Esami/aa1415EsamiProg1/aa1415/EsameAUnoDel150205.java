/**
 * ESAME PROGRAMMAZIONE 1 ESTRATTO
 */

public class EsameAUnoDel150205 {

	/**
	 * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 *
	 * Assumiamo di rappresentare PER COLONNA matrici quadrate di interi
	 * usando gli "array di array" di Java. Ad esempio, una matrice quadrata:
	 *
	 * 1 2 7 3
	 * 0 3 8 2
	 * 9 0 6 1
	 * 0 3 0 4
	 *
	 * e' rappresentata PER COLONNA se e` definita come segue:
	 *
	 * static int[][] m = {{ 1, 0, 9, 0},
	 *                     { 2, 3, 0, 3},
	 *                     { 7, 8, 6, 0},
	 *                     { 3, 2, 1, 4}};
	 *
	 * Definire un metodo exUno che:
	 * (i) prenda come unico parametro formale, di nome m, una matrice quadrata di interi
	 * rappresentata PER COLONNA;
	 * (ii) restituisca 'true' se e solo se TUTTI gli elementi al di sotto della diagonale principale
	 * hanno valore 0, e se gli elementi della diagonale principale hanno un valore negativo o nullo.
	 *
	 * Esempio, se m rappresenta una matrice cosi` fatta:
	 *
	 * -1  2  5  9
	 *  0 -1  1  2
	 *  0  0  0  0
	 *  0  0  0  2
	 *
	 * allora il metodo deve restituire 'false' perche` sebbene tutti gli elementi al di sotto della diagonale
	 * siano nulli, ALMENO un elemento della diagonale (quello in posizione 3,3 che ha valore 2) e` positivo non nullo.
	 * Se m rappresenta una matrice cosi` fatta:
	 *
	 * -1  1  2  1
	 *  0 -3  7  0
	 *  0  0  0  2
	 *  0  4  0 -6
	 *
	 * allora il metodo deve restituire 'false', perche` sebbene TUTTI gli elementi della diagonale
	 * siano negativi o nulli, esiste un elemento non nullo al di sotto della diagonale,
	 * quello in posizione riga,colonna (3,1) cha ha valore 4.
	 * Se m rappresenta una matrice cosi` fatta:
	 *
	 * -1  1  2  1
	 *  0 -3  7  0
	 *  0  0  0  2
	 *  0  0  0 -6
	 *
	 * allora il metodo deve restituire 'true', perche` TUTTI gli elementi della diagonale
	 * sono negativi o nulli, e TUTTI gli elementi al di sotto della diagonale sono nulli.
	 *
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
	 * (i) prenda un array a di interi e tre parametri interi: i (inizio), 
	 * f (fine) e v (valore), 
	 * (ii) restituisca true se ogni elemento di a compreso tra i, incluso, 
	 * ed f, escluso, non sia divisore intero di v, false altrimenti.
	 * 
	 * ESEMPI. 
	 * Con a == {3,4,2,1,1,3,3,2,4}, i == 3, f == 7 e v == 8 il risultato e' true 
	 * perche' ciascuno tra 1, 1, 3 e 3 non divide 8. 
	 * Con a == {3,4,2,1,1,3,3,2,4}, i == 3, f == 8 e v == 8 il risultato e' false
	 * perche' 2 e' divisore intero di 8.
	 * 
	 * È opportuno definire un metodo di supporto richiamato da exDue e che
	 * verifichi effettivamente la proprieta' dell'intervallo.
	 */

    /* 
     * Scrivere qui sotto il metodo soluzione in modo che l'intera classe compili
     */


}
