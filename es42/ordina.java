package es42;
import java.util.ArrayList;
import java.util.Collections;
public class ordina 
{
 public static void main(String[] args)
  {
    ArrayList< String> list = new ArrayList< String>();
    list.add("apple ");
    list.add("banana");
    list.add(" orange");
    list.add("grapes");
    list.add(" strawberry");
   // Collections.shuffle(list); // per scombinare la lista 
   //Collections.sort(list); //  per riordinale la lista 
   //llections.reverse(list); // inverte l' ordine della lista 
   //Collections.replaceAll(list, "apple", "gatto"); // cambia un elemnto della lista 
   //list.remove("grapes");// rimouove un elemneto dalla lista 
//list.remove(2);
//Collections.rotate(list, 3); // ruota gli elemneti della lista in base all' numero determinato da noi 

    System.out.println("list:" + list);
    
 }   
}

