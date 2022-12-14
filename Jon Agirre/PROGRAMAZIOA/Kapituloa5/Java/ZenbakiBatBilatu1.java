import java.util.*;

public class ZenbakiBatBilatu1
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);

        int Array[];
        Array = new int[10];
        
        int kont, bilatu;
        kont = 0;

        while(kont < 10)
        {
            System.out.printf("\nSartu array-aren %d .zenbakia: ", kont + 1);
            Array[kont] = sarrera.nextInt();
            kont++;
        }
        
        System.out.print("\nSartu array-an bilatu behar den zenbakia: ");
        bilatu = sarrera.nextInt();
        
        int luzera = Array.length;
        kont = 0;
        while(kont < luzera)
        {
            if(Array[kont] == bilatu)
            {
                System.out.println("\nZenbakia aurkitu da");
                kont = luzera;
            }
            kont++;
        }
        if(!(kont > luzera))
            System.out.print("\nZenbakia ez da aurkitu");
        sarrera.close();
    }
}