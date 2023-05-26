package es31;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SassoCartaForbice 
{
    public static void main(String[] args) 
    {
        String[] options = {"sasso", "carta", "forbice"};

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la tua mossa (sasso, carta, forbice):");
        String utenteMpossa = scanner.nextLine().toLowerCase();

        String computerMossa = options[random.nextInt(options.length)];

        System.out.println("Il computer ha scelto: " + computerMossa);

        if (utenteMpossa.equals(computerMossa)) 
        {
            System.out.println("Pareggio!");
        } else if (
            (utenteMpossa.equals("sasso") && computerMossa.equals("forbice")) ||
            (utenteMpossa.equals("carta") && computerMossa.equals("sasso")) ||
            (utenteMpossa.equals("forbice") && computerMossa.equals("carta"))
        ) 
        {
            System.out.println("Hai vinto!");
        } 
        else 
        
        {
            System.out.println("Hai perso!");
        }

        scanner.close();
    }
}

