import java.util.Scanner;


public class HamarZenbaki1
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int zenbakia;
        int kont;
        
        System.out.print("Sartu bakoiti kopurua: ");
        kont = sarrera.nextInt();
        
        zenbakia = 1;
        
        while(kont > 0)
        {
            System.out.printf("%d\n", zenbakia);
            zenbakia = zenbakia + 2;
            kont = kont - 1;
        }
    }
}