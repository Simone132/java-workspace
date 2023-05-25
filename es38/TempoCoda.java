package es38;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class TempoCoda 
{
    public static void main(String[] args) 
    {
     Scanner input =new Scanner(System.in);
     Queue<Integer> codaClienti=new LinkedList<Integer>();
     Queue<Integer> codatempoServizio=new LinkedList<Integer>(); 
     System.out.println("inserisci il numero di clienti:");
     int numeroClienti= input.nextInt();
  
    for (int i = 1; i <= numeroClienti; i++) 
    {
      System.out.println("inserisci il tempo di servizio per il cliente"+ i + ".");
      int tempoServizio= input.nextInt();
      codaClienti.add(i);
      codatempoServizio.add(tempoServizio);
    }
     int tempoTotale=0;
     int tempoTrascorso=0;
     
     while (!codaClienti.isEmpty())
     {
       int clienteCorrente= codaClienti.remove();
       int tempoServizioCorrente= codatempoServizio.remove();
       tempoTotale  = tempoServizioCorrente + tempoTrascorso;
       tempoTrascorso = tempoServizioCorrente; 
     }
     System.out.println("Il tempo totale di attesa per tutti i clienti è " + tempoTotale + ".");

 input.close();
  }
}
