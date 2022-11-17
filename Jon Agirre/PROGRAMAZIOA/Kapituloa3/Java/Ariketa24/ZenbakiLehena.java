import java.util.Scanner;

public class ZenbakiLehena
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int z, kont, kont2;
        
        System.out.print("Sartu zenbakia: ");
        z = sarrera.nextInt();
        
        kont = 2;
        kont2 = 0;
        
        if(z == 1 || z == 0 || z== 4)
            System.out.print("Zenbakia ez da lehena");
        else
        {
            while(kont < z)
            {
                if(z % kont == 0)
                    kont2 = 1;
                kont++;
            }
        }
        if(kont2 == 1)
            System.out.print("Zenbakia ez da lehena");
        else
            System.out.print("Zenbakia lehena da");
        sarrera.close();
    }
}