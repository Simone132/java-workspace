package es27;
import java.util.Random;

public class GenerazioneCaso 
{
    public static void main(String[] args) 
    {
        Random rand =new Random();
        int randomInt = rand.nextInt(100);
        System.out.println("numero intero casuale " + randomInt );
         double randomdouble = rand.nextDouble();
         System.out.println( " numero double casuale:"+ randomdouble);

         boolean randomBoolean = rand.nextBoolean();
         System.out.println("valore booleano casuale "+ randomBoolean);
    }
}
