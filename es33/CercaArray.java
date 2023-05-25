package es33;
import java.util.Scanner;
public class CercaArray 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); // metodo input 
        System.out.print("inserisci la dimensione dell' arrey:");
        int dimensione = input.nextInt(); // dimensione specifica dell' utente 
        int[] array = new int[dimensione]; // creazione di un array della dimensione dell' utente 
        System.out.println("inserisci gli elementi dell arrey:");
  
    for (int i = 0 ; i< dimensione ; i++)  // il ciclo for continua finche il il contatore raggiunge la dimensione del contatore 
    {
      array[i] = input.nextInt();
    }
  System.out.print("inserisci il numero da cercare:");
  int numeroCercato= input.nextInt(); // definisco una variabile e la inizializzo con un valore input pari a quella dell' utente 
  int indice = -1; // creo  una variabile a cui do il valore di -1  che presenta l' indice   di un elemento che non esiste 
  
  for (int i  = 0; i < dimensione ; i++ ) 
  {

if (array[i]== numeroCercato)  // se ad un determinato indice trovi il numero che ho scelto 
{
indice= i ;
break;

}

}
if (indice != -1)
 {
 System.out.println(" il numero si trova all' indice " + indice + " dell' array.");
}
   
else 
{
System.out.println("Il numero non è presente nell'array.");
}
}
}
