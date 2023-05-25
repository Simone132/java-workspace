package es25;
import java.util.Scanner;


public class NumeoCasuale 
{
 public static void main(String[] args) 
 {
    Scanner input =new Scanner(System.in);
        System.out.print("scegli un numero da 1 a 4  ");
        int num = input.nextInt();
    
    switch (num)                              
     {
      case 1:                                             
      System.out.println( "numero 1 troppo basso riprova  riprova ");
      
      case 2 :
      System.out.println( "numero 2 non valido  ci sei vicino riprova ");
      
      case 3 :
      System.out.println(  "numero 3 giusto  ");
      break;
      case 4 :
      System.out.println( "numero 4 non valido  ci sei vicino riprova ");
      
      case 5:
      System.out.println("il numero 5 inserito è troppo alto riprova  ");
      

     }
     
 }   
}
