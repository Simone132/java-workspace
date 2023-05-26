package es45;
import java.util.Random;
import java.util.Scanner;
public class sassoCartaForbice 
{
    public static void main(String[] args) 
    {
         Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.println("ciao come ti chiami?");
        String nome =input.nextLine();
        System.out.println( nome + "  il regolamento è: \n carta = carta\n carta > sasso\n carta < forbice\n sasso = sasso\n sasso > forbice\n sasso < carta\n forbice = forbice\n forbice < sasso\n forbice > carta\n ");
        
         String[] options = {"sasso", "carta", "forbice"};


        System.out.println("Inserisci la tua mossa (sasso, carta, forbice):");
        String utenteMossa = input.nextLine().toLowerCase();

        String computerMossa = options[random.nextInt(options.length)];

        System.out.println("Il pc ha scelto: " + computerMossa);
        boolean vincita = false;
        while (vincita == false)
        {
            System.out.println("Inserisci la tua mossa (sasso, carta, forbice):");
            utenteMossa = input.nextLine().toLowerCase();
            computerMossa = options[random.nextInt(options.length)];
            if (utenteMossa.equals(computerMossa))
            {
                System.out.println("Pareggio!");
            }
            else if ((utenteMossa.equals("sasso") && computerMossa.equals("forbice")) ||
                (utenteMossa.equals("carta") && computerMossa.equals("sasso")) ||
                (utenteMossa.equals("forbice") && computerMossa.equals("carta"))) 
            {
            System.out.println( nome + " Hai vinto!");
            vincita= true;
            }
            else
            {
            System.out.println("hai perso");
            }
        } 
         input.close();
     

    }

}
