package es24;
import java.util.Scanner;  
public class NumeriCasuali2 
{
    public static void main(String[] args)  // qua ho dichiarato il metodo main 
    {
       Scanner input =new Scanner(System.in); //qua ho creato lo scanner 
           System.out.print("scegli un numero da 1 a 5  "); // qua ho messo il comando per far partire il messaggio nel terminale 
           int num = input.nextInt();
       
       switch (num)                              // qua ho creato il primo switch che mi permette di sceglere un numero per esempio case 1 
        {
         case 1:                                            
         System.out.println( " numero 1 troppo piccolo "); // qua riproduco nel terminale un messaggio  che dice che è sbagliato 
         
        }
        switch (num)                              
        {
        case 2 :
         System.out.println( " ci sei vicino ma non è il numero 2  "); //qua riproduco nel terminale un messaggio  che dice che è sbagliato 
         
       
          } 
         
       switch (num) // qua ho creato il primo switch che mi permette di sceglere un numero per esempio case 3
       
       {
        case 3 :
        System.out.println(" il numero 3 è giusto ");// qua riproduco nel terminale un messaggio  che dice che è giusto 
         
        break; // qua ho interrotto il ciclo 
   
       }

       
       switch (num) // qua ho creato il primo switch che mi permette di sceglere un numero per esempio case 4
       {
        case 4 :
        System.out.println("ci sei vino ma non è il numero 4");// qua riproduco nel terminale un messaggio  che dice che è sbagliato 
         
       }

       
       switch (num)  // qua ho creato il primo switch che mi permette di sceglere un numero per esempio case 5
       {
         case 5 :
         System.out.println("il numero 5 è troppo grande "); // qua riproduco nel terminale un messaggio  che dice che è sbagliato 
         
       }
    
    input.close();
    }
    

}
