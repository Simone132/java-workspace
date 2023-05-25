package es29;
import java.util.Scanner;
import java.util.Random;
public class NumeroDaIndovinare 
{
 public static void main(String[] args) 
 {
    Scanner input = new Scanner(System.in);
    Random casuale = new Random();
    int casual = casuale.nextInt(100) + 1 ;
    int numeroutente;
    do 
      {
        System.out.println(" indovina un numero da 1 a 100:");
        numeroutente= input.nextInt();
    
    if (numeroutente<casual)
    {
      System.out.println(" il numero che hai scelto è troppo basso ");
    }


else  if (numeroutente>casual)
              { 
 System.out.println(" il numero che hai scelto è troppo grande :");
              }

      } 
   while ( numeroutente != casual);
   System.out.println(" complimenti hai indovinato il numero " +  casual);
 }    

}
