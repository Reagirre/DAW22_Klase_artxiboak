import java.util.Scanner;

public class Sinua
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        float x, kont, sinua, bakoitia, faktoriala, berreketa, kont2;
        
        System.out.print("Sartu angelua: ");
        x = sarrera.nextFloat();
        
        sinua = 0;
        bakoitia = 1;
        kont = 1;
        
        while(kont <= 10)
        {
            faktoriala = 1;
            berreketa = 1;
            kont2 = 1;
            while(kont2 <= bakoitia)
            {
                berreketa = berreketa * x;
                faktoriala = faktoriala * kont2;
                kont2++;
            }
            if(kont % 2 == 0)
                sinua = sinua - berreketa / faktoriala;
            else
                sinua = sinua + berreketa / faktoriala;
            bakoitia = bakoitia + 2;
            kont++;
        }
        System.out.printf("%.6f", sinua);
        sarrera.close();
    }
}