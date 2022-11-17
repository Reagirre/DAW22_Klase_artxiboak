import java.util.Scanner;
import java.lang.Math;

public class ZenbakiSekretua
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int z, kont, zs, kont2;
        
        System.out.print("Sartu zenbakia (1-10): ");
        z = sarrera.nextInt();
        
        kont = 0;
        kont2 = 1;
        zs = (int)(Math.random() * 10);
        
        while(kont2 == 1)
        {
            while(kont < 3)
            {
                if(zs == z)
                {
                    System.out.printf("Zorionak, igarri duzu!\n");
                    kont = 5;
                }
                else
                {
                    if(zs > z)
                        System.out.printf("Zenbaki sekretua handiagoa da!\n");
                    else
                        System.out.printf("Zenbaki sekretua txikiagoa da!\n");
                    kont++;
                    if(kont < 3)
                    {
                        System.out.print("Sartu zenbakia (1-10): ");
                        z = sarrera.nextInt();
                    }
                    if(kont == 3)
                        System.out.printf("Agortu dituzu aukera guztiak, zenbaki sekretua %d izan da!", zs);
                }
                
            }
            System.out.print("\n\n0 amatetako");
            kont2 = sarrera.nextInt();
            if(kont2 == 1)
            {
                kont = 0;
                System.out.print("\nSartu zenbakia (1-10): ");
                z = sarrera.nextInt();
                zs = (int)(Math.random() * 10);
            }
                
        }
        sarrera.close();
    }
}