import java.util.Scanner;

public class Kosinua
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        float x, kont, kosinua, bikoitia, faktoriala, berreketa, kont2;
        
        System.out.print("Sartu angelua: ");
        x = sarrera.nextFloat();
        
        kosinua = 0;
        bikoitia = 0;
        kont = 1;
        while(kont <= 10)
        {
            faktoriala = 1;
            berreketa = 1;
            kont2 = 1;
            while(kont2 <= bikoitia)
            {
                berreketa = berreketa * x;
                faktoriala = faktoriala * kont2;
                kont2++;
            }
            if(kont % 2 == 0)
                kosinua = 1 - berreketa / faktoriala;
            else
                kosinua = 1 + berreketa / faktoriala;
            bikoitia = bikoitia + 2;
            kont++;
        }
        System.out.printf("%.6f", kosinua);
        sarrera.close();
    }
}