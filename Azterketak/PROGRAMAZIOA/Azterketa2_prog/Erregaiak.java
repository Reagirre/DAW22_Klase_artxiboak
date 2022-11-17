import java.util.Scanner;
import java.lang.Math;

public class Erregaiak
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        float erregaia, inportea, litroak;
        
        System.out.print("Erregaiak\n\n1.Efitec 95\n\n2.Efitec 98\n\n3.Diesel e+\n\n4.Diesel e+ 10\n\nAukeratu erregaia: ");
        erregaia = sarrera.nextFloat();
        
        System.out.print("\nSartu inportea: ");
        inportea = sarrera.nextFloat();
        
        if(erregaia == 1)
        {
            litroak = inportea / (float)1.849;
            System.out.printf("\nLitroak = %.2f",litroak);
        }
        else if(erregaia == 2)
        {
            litroak = inportea / (float)1.999;
            System.out.printf("\nLitroak = %.2f",litroak);
        }
        else if(erregaia == 3)
        {
            litroak = inportea / (float)2.039;
            System.out.printf("\nLitroak = %.2f",litroak);
        }
        else if(erregaia == 4)
        {
            litroak = inportea / (float)2.099;
            System.out.printf("\nLitroak = %.2f",litroak);
        }
        
        sarrera.close();
    }
}