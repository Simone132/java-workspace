package es36;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Coda 
{
 public static void main(String[] args) 
 {
    Scanner input= new Scanner(System.in);
    Queue<String> coda = new LinkedList<>();
    System.out.println("inserisci gli elementi della queue(inserisci \"fine\" per terminare l'inserimento)");
    String elemento =input.nextLine();

while(!elemento.equals("fine"))
{
 coda.add(elemento);
 elemento= input.nextLine();
}
System.out.println("gli elemnti della queue sono:");

while(!coda.isEmpty())
{
System.out.println(coda.remove());


}
input.close();
}   
}
