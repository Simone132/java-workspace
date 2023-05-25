package es37;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class AccettaElementoCoda 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
        Queue<Integer> coda = new LinkedList<Integer>();
        System.out.println("inserisci gli elemneti della queue ( inserisci 0 per terminare l' inserimento):");
        int elemento input.nextInt();
    
    while(elemento != 0) 
    {
     coda.add(elemento);
     elemento= input.nextInt();
    }
    Queue< Integer> codaSenzaNegativi = new LinkedList<Integer>();

}
}
