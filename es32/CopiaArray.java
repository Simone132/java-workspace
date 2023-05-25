package es32;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class CopiaArray 
{
 public static void main(String[] args) 
 {
    Scanner input = new Scanner(System.in);
    System.out.println("inserisci la dimensione dell' arrey:");
    int dimensione = input.nextInt();
    int [] array = new int [dimensione];
    System.out.println("inserisci gli elementi dell' arrey:");
      
    for (int i = 0; i < dimensione; i++) 
    {
      array[i] = input.nextInt();

   }
  int [] arrayCopia=new int [dimensione];
  
  for (int i = 0; i < dimensione; i++)
  {
   arrayCopia[i]= array[i];
  }
  System.out.println("l' array originale è:" + Arrays.toString(array));
  System.out.println(" l' array copiato è :" + Arrays.toString(arrayCopia));
  input.close();
}
}
