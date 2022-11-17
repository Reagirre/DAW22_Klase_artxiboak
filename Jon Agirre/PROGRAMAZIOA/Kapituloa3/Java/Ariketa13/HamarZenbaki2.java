import java.util.Scanner;
public class HamarZenbaki2
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        int zenbakia;
        int kont;
        
        System.out.print("Sartu bakoiti kopurua: ");
        kont= sarrera.nextInt();
        
        for(zenbakia = 1; 0 < kont; kont = kont - 1)
        {
            System.out.printf("%d\n", zenbakia);
            zenbakia = zenbakia + 2;
        }
            
    }
}
