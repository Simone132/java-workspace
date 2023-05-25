package es22;
import java.util.Scanner;
public class SwitchStatement 
{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.print("inserisci un numero da 1 a 3: ");
        int num = input.nextInt();
    
    switch (num)                               // questo comando sfrutta la variabilità di num cioè che num cambia valore 
     {
      case 1:                                             
      System.out.println(" hai inserito 1");
      break;
      case 2 :
      System.out.println(" hai inserito 2");
      break;
      case 3 :
      System.out.println(" hai inserito 3");
      break;
      default:
      System.out.println(" il numero inserito non è valido ");
      break;

     }




    }

}
