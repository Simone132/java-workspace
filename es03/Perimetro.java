//chiedi il nome all'utente, chiedere i valori di base e altezza di un rettangolo all'utente e calcolarne il perimetro e l'area, stampa poi i risultati.
//infine commenta il codice
import java.util.Scanner;

public class Perimetro
{
     public static void main(String[] args)   // ho dichiarato il metodo main 
     {
        Scanner tastiera = new Scanner(System.in); // ho creato un oggetto chiamato tastiera della classe scanner 
        System.out.println("inserire il nome:"); // qua  ho creato un comando che riproduce questo mesaggio nel terminale: inserire il nome                                     
       //qua ho messo un comando che permette  all' utente di scrivere il suo nome nel terminale che assegna alla variabile nome 
        System.out.println("ciao "+ nome +" inerisci il valore della base :");
        int base = tastiera.nextInt(); // qua ho messo un comando che permette all' utente di scrivere il valore della sua base nel terminale 
        if (base>40)
      {
         System.out.println("non è valido");
      }
        else { // qua ho creato un comando che riproduce questo messaggio nel terminale inerisci il valore della base
        System.out.println("ciao "+ nome + " inserisci il valore dell' altezza:"); // qua ho creato un comando che riproduce questo messaggio nel terminale inerisci il valore della base
        int altezza =tastiera.nextInt(); // qua ho messo un comando che permette all' utente di scrivere il valore della sua altezza  nel terminale 
        int perimetro = base*2 +altezza*2;// questa è una variabile che mi calcola il perimetro 
        int area = base*altezza; // questa è una variabile che mi calcola l' area
        System.out.println("ciao "+ nome + " il tuo perimetro è:"+ perimetro); // questo è un comando che mi stampa nel terminale ciao + il nome + il tuo perimetro è: + valore del perimetro nel terminale 
        System.out.println("ciao "+ nome +  " la tua area è:"+ area); // questo è un comando che mi stampa nel terminale ciao + il nome + la tua area è: è: + valore dell' area nel terminale 
        tastiera.close(); // è un comando che chiude lo scanner 
        int a;
      }
                                                 
      
                                                   
   }                                           
                                                  
}

