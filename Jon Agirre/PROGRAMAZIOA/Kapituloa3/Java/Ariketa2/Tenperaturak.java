import java.util.Scanner;

public class Tenperaturak
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        double tenperatura;
        double konbertsioa;
        int aukera;
        
        System.out.print("Tenperaturak\n\n1.Celsius -> Fahrenheit\n\n2.Fahrenheit -> Celsius\n\n");
        
        
        System.out.print("Aukeratu bihurketa: ");
        aukera = sarrera.nextInt();
        
        switch (aukera)
        {
            case 1:
                System.out.print("\n\nSartu Celsius graduak: ");
                tenperatura = sarrera.nextInt();
                konbertsioa = ((9f/5f * tenperatura) + 32.0);
                System.out.printf("\n\nFahrenheit graduak = %.2f ",konbertsioa);
                break;
            case 2:
                System.out.print("\n\nSartu Fahrenheit graduak: ");
                tenperatura = sarrera.nextInt();
                konbertsioa = (5f/9f)*(tenperatura - 32.0);
                System.out.printf("\n\nFahrenheit graduak = %.2f ",konbertsioa);
                break;
            default:
                System.out.printf("\n\nAukera ez da zuzena");
                break;
        }
    }
}
