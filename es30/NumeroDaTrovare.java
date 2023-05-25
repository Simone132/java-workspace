package es30;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import java.util.Random;



public class NumeroDaTrovare 


{
public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);
                                             
    Double ranNum1 = Math.random();
    System.out.println(ranNum1);


    Double ranNum2= Math.random() * 10 ;
    System.out.println(ranNum2);

    int min = 2;
    Double ranNum3=(Math.random() *(10 - 5 ))+5;
    System.out.println(ranNum3);

    //Double ranNum4 = (Math.random()* (10 - 1)) + 1;

    int ranNum5 =(int)((Math.random() * (100- min)) + min );
    System.out.println(ranNum5);
     

    while (true)  
    {
        System.out.println(" inserisci un numero da indovinare da 1 a 100");
        int userGuess = input.nextInt();

        if ( userGuess == ranNum5) 
        {
            System.out.println("bravo hai indovinato il numero è  proprio" + ranNum5);
            break;
        }
        else 
         {
            System.out.println("il numero che hai inserito è troppo grande");
        }
    }






  
}    
}
