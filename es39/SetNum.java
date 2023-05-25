package es39;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class SetNum
{
 public static void main(String[] args) 
 {
    Scanner input = new Scanner(System.in);
    Set<Integer> setNumeri = new HashSet<Integer>();
    System.out.println("inserisci gli interi separati da uno spazio");
    String[]numeri= input.nextLine().split(" ");
    int i = 0;
  
for (String nuemro: numeri) 
{
    setNumeri.add(Integer.parseInt(nuemro));
}
System.out.println("il numero di elementi inseristi è:" + numeri.length);
System.out.println("il numero di elementi del set duplicati  sono :" + setNumeri.size());
 System.out.println("il Set senza duplicati è :");
 
 for (int nuemro: setNumeri)
 {
   System.out.print(nuemro + ".");

 }
 input.close();
} 
}
