/**
 * ESAME PROGRAMMAZIONE 1 ESTRATTO
 */

public class EsameBUnoDel150205 {

    /**
	 * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 *
	 * Assumiamo di rappresentare PER COLONNA matrici quadrate di interi usando
	 * gli "array di array" Java. Ad esempio, una matrice quadrata:
	 *
	 * 1 2 7 0
	 * 2 3 0 8
	 * 4 5 6 2
	 * 7 8 9 3
	 *
	 * e` rappresentata PER COLONNA se e` definita come segue:
	 *
	 * static int[][] m = {{1, 2, 4, 7},
	 *                     {2, 3, 5, 8},
	 *                     {7, 0, 6, 9},
	 *                     {0, 8, 2, 3}};
	 *
	 * Definire un metodo exUno che:
	 * (i) prenda come unico parametro formale, di nome m, una matrice quadrata di interi
	 * rappresentata PER COLONNA;
	 * (ii) restituisca true se e solo se tutti gli elementi che NON appartengono alla diagonale
	 * sono uguali a 0 e gli elementi della diagonale principale hanno tutti lo stesso valore.
	 *
	 * Esempio, se m rappresenta una matrice cosi` fatta:
	 *
	 * 1 0 0 0
	 * 0 3 0 0
	 * 0 0 0 0
	 * 0 0 0 3
	 *
	 * allora il metodo deve restituire 'false' perche` anche se tutti gli elementi che non sono sulla diagonale
	 * sono nulli, gli elementi della diagonale principale sono tra loro diversi.
	 * Se m rappresenta una matrice cosi` fatta:
	 *
	 * 3 0 0 1
	 * 0 3 0 0
	 * 3 0 3 0
	 * 0 0 0 3
	 *
	 * allora il metodo deve restituire 'false', perche` sebbene gli elementi della diagonale siano tutti identici in valore
	 * esistono due elementi, in posizione riga,colonna (0,3) e (2,0),
	 * che non soddisfano la condizione, perche` hanno valore rispettivamente 1 e 3.
	 * Se m rappresenta una matrice cosi` fatta:
	 *
	 * 2 0 0 0
	 * 0 2 0 0
	 * 0 0 2 0
	 * 0 0 0 2
	 *
	 * allora il metodo deve restituire 'true', perche` entrambe le condizioni sono soddisfatte.
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
	 * (ii) restituisca true se v non divide alcuno degli elementi di a 
	 * compreso tra i, incluso, ed f, escluso, false altrimenti.
	 * 
	 * ESEMPI. 
	 * Con a == {3,4,6,6,2,3,3,4,4}, i == 5, f == 7 e v == 2 il risultato e' true 
	 * perche' 3 e 3 non hanno 2 come divisori intero. 
	 * Con a == {3,4,6,6,2,3,3,4,4}, i == 5, f == 8 e v == 2 il risultato e' false
	 * perche' 4 ha 2 come divisore intero.
	 * 
	 * È opportuno definire un metodo di supporto richiamato da exDue e che
	 * verifichi effettivamente la proprieta' dell'intervallo.
	 */

    /* 
     * Scrivere qui sotto il metodo soluzione in modo che l'intera classe compili
     */

}
