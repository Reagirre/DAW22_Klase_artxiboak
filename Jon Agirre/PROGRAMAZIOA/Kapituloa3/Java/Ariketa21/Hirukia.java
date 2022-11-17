import java.util.Scanner;
public class Hirukia
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int zenbakia, kont, kont2, kont3;
        
        System.out.print("Sartu hirukiaren altuera: ");
        zenbakia = sarrera.nextInt();
        
        kont = 1;
        kont2 = zenbakia * 2 - 1;
        
        while(kont <= zenbakia)
        {
            kont3 = 1;
            while(kont2 > kont)
            {
                System.out.print(' ');
                kont2--;
            }
            while(kont3 <= 2 * kont - 1)
            {
                System.out.print('*');
                kont3++;
            }
            System.out.println();
            kont++;
            kont2 = (zenbakia * 2) - kont;
        }
        sarrera.close();
    }
}