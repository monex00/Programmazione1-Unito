/**
 * ESAME PROGRAMMAZIONE 1 ESTRATTO
 */

public class Simulazione {

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

    public static boolean exUno(int[][] m){
    	int valDiagonale = m[0][0];
    	int cont = 0;
    	boolean controllo = true;
    	boolean ret;
    	for(int i = 0; controllo && i<m.length; i++){

    		for(int j = 0; controllo &&j<m[i].length; j++){
				if( i == j){
					if(m[i][j] == valDiagonale){
						cont = cont + 1;
					}
				}else{
					if (m[i][j] != 0){
						controllo = false;
					}
				}
			}
		}
    	if(cont == m.length && controllo){
    		ret = true;
		}else{
    		ret = false;
		}
    	return ret;
	}
	
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

    public static boolean exDue(int[] vet, int i, int f,int val){
    	if(i + 1 == f){
			if((vet[i] % val) == 0){
				return false;
			}else{
				return true;
			}
		}else{
    		boolean controllo;
    		if((vet[i] % val) == 0){
    			controllo = false;
			}else{
    			controllo = true;
			}
    		return controllo && exDue(vet,i + 1, f, val);
		}
	}

	/**
	 * ESERCIZIO 2 (Massimo 8 punti -- da consegnare elettronicamente).
	 *
	 * Scrivere un metodo ricorsivo exDue:
	 * (i) che abbia come parametro formale il riferimento ad un array di interi
	 * (ii) e che, controllata la validita' del parametro attuale,
	 * alteri a nel seguente modo: ogni cella di posizione pari a[i] deve essere
	 * modificata con la somma tra a[i] e a[i+1], ammesso che a[i+1] esista.
	 *
	 * ESEMPIO.
	 * Sia a == {3,4,1}. Allora a risultante e' {7,4,1}.
	 * Sia a == {3,4,1,2}. Allora a risultante e' {7,4,3,2}.
	 */

	public static void exxDue(int[] a){
		exxDue(a, 0);
	}
	private static void exxDue(int[] a, int i){
		if(i >= a.length - 1 ){

		}else{
			a[i] = a[i] + a[i + 1];
			exxDue(a, i + 2);
		}
	}

	//sempre lo stesso ex ma covariante

	public static void exxDueCov(int[] a){
		exxDueCov(a, a.length - 1);
	}

	private static void exxDueCov(int[] a,int i){
		if (i < 0){

		}else{
			if((i % 2 ) == 0){
				if(i+1 != a.length) {
					a[i] = a[i] + a[i + 1];
				}
			}
			exxDueCov(a,i - 1);
		}
	}
}
