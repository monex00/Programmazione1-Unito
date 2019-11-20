/*Esercizio 1:

calcolare il prezzo di quanto acquistiamo al supermercato:
3 pacchi di orecchiette
2 kg di pomodori

prezzo di un pacco di orecchiette: euro 1.50
prezzo al kg dei pomodori: euro 2.50

Scrivere una classe SuperMarket il cui
metodo main calcoli e visualizzi a video
la spesa totale.

Modellare il problema utilizzando delle variabili opportunamente dichiarate con tipi adeguati.
Utilizzare una variabile anche per rappresentare il totale.
Indentare e commentare opportunamente il programma.

Infine, fare inserire le quantità degli articoli alimentari dall'utente da tastiera (anziche' fissare
nel codice del programma i valori delle variabili).
*/

public class Supermarket{
    public static void main(String[] args){
        float orecchiette = 1.50f;
        float pomodori = 2.50f;
        int qOrecchiette = 0;
        int qPomodori = 0;
        System.out.println("INSERISCI LA QUANTITA DELLE ORECCHIETTE");
        qOrecchiette = SIn.readInt();

        System.out.println("INSERISCI LA QUANTITA DEI POMODORI");
        qPomodori = SIn.readInt();

        float totale = orecchiette * qOrecchiette + pomodori * qPomodori;
        System.out.println(totale);
    }
}