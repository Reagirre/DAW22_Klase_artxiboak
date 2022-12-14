import java.util.*;

public class ZenbakiBatBilatu2
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
        int kont2 = 0;
        while(kont2 < luzera)
        {
            if(Array[kont2] == bilatu)
            {
                System.out.println("\nZenbakia aurkitu da");
                kont2 = luzera;
            }
            kont2++;
        }
        
        sarrera.close();
    }
}