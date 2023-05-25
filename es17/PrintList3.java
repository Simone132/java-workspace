package es17;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PrintList3
{
    public static void main(String[] args)
     {
        Scanner tastiera = new Scanner(System.in);
        
        
      
        List<String> fruits = new ArrayList<String>();
        List<String> carello = new ArrayList<String>();
        System.out.println(" prodotti disponibili :");
        fruits.add("Mela"); // il metodo add della classe aggiunge
        fruits.add("Banana");
        fruits.add("Arancia");
           for (String fruit : fruits)

 {
           System.out.println(fruit);
           // System.out.println(fruits.size());
           
        }


        System.out.println(" cosa vuoi prendere:"); 
        String prodotti = tastiera.nextLine();
        carello.add( prodotti);
         fruits.remove(prodotti);
System.out.println(" nel tuo carello c' è");
       
for (String fruits2 : carello)
{
    System.out.println(fruits2);
    // System.out.println(fruits.size());
    
 }

       // fruits.clear(); // il metodo per pulire la lista 
        // il metodo per rimuovere un elemento specifico 
        //fruits.size(); 
       // fruits.isEmpty();
     
       
        System.out.println(fruits);
        tastiera.close();
    }

   
  




}



