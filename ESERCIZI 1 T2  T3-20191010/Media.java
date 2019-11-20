/** classe Media: serve per calcolare la media
    di 3 numeri letti da tastiera.
    Seguono diverse implementazioni del
    calcolo della media, che differiscono per le
    dichiarazioni delle variabili:
    ci aspettiamo problemi.
    Ad esempio provare ad eseguire il programma con
    i valori 2, 3, 3, o con 8, 2, 3.
  */


public class Media {

  public static void main(String[] args) {

    int x, y, z, media1;
    double media2, media3;

    System.out.println("Introduci il primo numero (per es. 8): ");
    x = SIn.readInt();
    System.out.println("Introduci il secondo numero (per es. 2): ");
    y = SIn.readInt();
    System.out.println("Introduci il terzo numero (per es. 3): ");
    z = SIn.readInt();

    media1 = (x + y + z) / 3; //divisione intera
    System.out.println("int media1: (x+y+z)/3 = " + media1 + " (divisione intera)");

    media2 = (x + y + z) / 3; //divisione intera e cast a double
    System.out.println("double media2: (x+y+z)/3 = " + (double)media2  + " (divisione intera e cast a double)");

    media3 = (x + y + z) / 3.0; // divisione con virgola - risultato atteso!!
    System.out.println("double media3: (x+y+z)/3.0 = " + media3  + " (divisione con virgola - risultato atteso!)");


// VARIANTI all'esercizio:
// posso scrivere: media3 = (double)(x + y + z) / 3;
// ma non: media3 = (double)((x + y + z) / 3); Perche'?

/*
// Aggiungiamo le seguenti istruzioni:
int m = media3; // problema incontrato negli es. precedenti...
// Per le seguenti provare  ad es. con 1,2,5
System.out.println((int)media3);
// modo sbagliato di arrotondare!
System.out.println((int)Math.round(media3));
//modo giusto di arrotondare!
*/
  }
}


/**
  ancora problemi imprevisti dovuti
  a range di numeri finito
  (che portano a rappresentazione binaria
  approssimata)
  */
/*
double f=4.35;
System.out.println((int)(f*100)); // usare il Math.round prima del cast!
*/