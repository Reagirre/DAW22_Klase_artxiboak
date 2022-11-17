import java.util.Scanner;
public class Hirukia
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int zenbakia;
        int kont;
        int kont2;
        int kont3;
        
        System.out.print("Sartu hirukiaren altuera: ");
        zenbakia = sarrera.nextInt();
        
        kont = 1;
        kont2 = 0;
        kont3 = 1;
        
        while(kont3 <= zenbakia)
        {
            while(kont2 < kont)
            {
                System.out.print("*");
                kont2++;
            }
            System.out.print("\n\n");
            kont = kont + 2;
            kont2 = 0;
            kont3++;
        }
        sarrera.close();
    }
}