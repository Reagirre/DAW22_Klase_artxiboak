import java.util.Scanner;

public class Bisurtea
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        float urtea;
        float posibilitatea4;
        float posibilitatea100;
        float posibilitatea400;
        
        System.out.print("Sartu urtea: ");
        urtea = sarrera.nextFloat();
        
        posibilitatea4 = urtea % 4;
        posibilitatea100 = urtea % 100;
        posibilitatea400 = urtea % 400;
        
        if(posibilitatea4 > 0 && posibilitatea100 == 0)
            System.out.printf("%.0f bisurtea da", urtea);
        else
            System.out.printf("%.0f ez da bisurtea", urtea);
    }
}