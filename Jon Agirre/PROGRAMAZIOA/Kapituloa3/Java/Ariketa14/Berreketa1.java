import java.util.Scanner;


public class Berreketa1
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int zenbakia;
        int berrekizuna;
        int berretzailea;
        
        System.out.print("Sartu berrekizuna: ");
        berrekizuna = sarrera.nextInt();
        System.out.print("Sartu berretzailea: ");
        berretzailea = sarrera.nextInt();
        System.out.printf("%d ^", berrekizuna);
        System.out.printf(" %d", berretzailea);
        
        zenbakia = 1;
        
        while(berretzailea > 0)
        {
            
            zenbakia = zenbakia * berrekizuna;
            berretzailea = berretzailea - 1;
        }
        System.out.printf(" = %d\n", zenbakia);
    }
}