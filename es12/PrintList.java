
import java.util.ArrayList;
import java.util.List;

public class PrintList 
{
    public static void main(String[] args)
     {
        List<String> fruits = new ArrayList<String>(null);
        fruits.add("Mela"); // il metodo add della classe aggiunge
        fruits.add("Banana");
        fruits.add("Arancia");

        for (String fruit : fruits)
        {
            System.out.println(fruit);
        }
    }
}
