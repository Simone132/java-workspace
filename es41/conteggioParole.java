package es41;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class conteggioParole
{
 public static void main(String[] args) 
 {
    Scanner input = new Scanner(System.in);
    Map<String , Integer> mappaParole = new HashMap<String , Integer>();
    String testo = input.nextLine();
    String[]parole = testo.split("");
    for (String parola :parole)
{
    if ( mappaParole.containsKey(parola))
{
 mappaParole.put(parola, mappaParole.get(parola)+ 1);
}
else 

{
    mappaParole.put(parola, 1 );
}

}
System.out.println(" la lista delle parole  e il loro conteggio è:");
for (Map.Entry < String, Integer> entry: mappaParole.entrySet())
  
{
    System.out.println(entry.getKey() +  " :" + entry.getValue());
}
input.close();
} 
}
