package es28;

import java.util.Random;
import java.util.Scanner;
public class indovinaNumero 
{
    public static void main(String[] args) 
    {
    
        Scanner input = new Scanner(System.in);
        Random rand =new Random();
        int tentativo =0;
        
        boolean vincita = false ;
        int randomInt = rand.nextInt(100) + 1;
        int tentativi =0;
        
        while(vincita==false)
        {
            tentativi++;
         System.out.println("indovina un numero tra 1 e 100");
         
         tentativo= input.nextInt();
         
         
         if (tentativo == randomInt) 
         {
            vincita=true;
         }
         
           

        
    
    else if (tentativo< randomInt) 
     System.out.println("troppo basso prova ancora ");

    else if (tentativo  >   randomInt  )
    System.out.println("troppo alto  prova ancora");
     
    
    }
    System.out.println("bravo hai idovinato dopo "  + tentativi + "  tentativi");
    
    input.close();
}
}

