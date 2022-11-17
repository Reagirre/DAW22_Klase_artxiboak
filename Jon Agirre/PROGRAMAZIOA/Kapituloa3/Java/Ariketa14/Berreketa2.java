import java.util.Scanner;
public class Berreketa2
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
        
        for(zenbakia = 1; 0 < berretzailea; berretzailea = berretzailea - 1)
            zenbakia = zenbakia * berrekizuna;
        System.out.printf(" = %d\n", zenbakia);
    }
}
