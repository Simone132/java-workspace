package es19;
import java.util.Scanner;
public class DoWhileLoop 
{
    public static void main(String[] args) 
    {
      Scanner input =new Scanner(System.in);
      int num;
    
    do // viene eseguito almeno la prima volta 
    {
    System.out.println("inserisci un numero(inserisci 0 per uscire )");
    num= input.nextInt();
    System.out.println("hai inserito:" + num);
    
    }
    while(num != 0);
    input.close();
   } 
}
