/**
Calcolare la circonferenza di un cerchio. In un primo momento, inserire nel codice del programma il valore del raggio. 
In un secondo momento, farlo inserire all'utente.
*/
public class Circonferenza{

	public static void main(String [] args){
		final float PI_GRECO = 3.14f;
		System.out.print("INSERISCI IL RAGGIO: ");
		float raggio = SIn.readLineFloat();
		float circonferenza = raggio * 2 * PI_GRECO;
		System.out.println(circonferenza);

// completare codice...
// si ricorda che la circonferenza del cerchio
// e' pari al prodotto del diametro per PI_GRECO

	}
}