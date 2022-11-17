import java.util.Scanner;

public class ZenbakiSekretua
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int zenbakia;
        int erantzuna;
        
        System.out.print("Sartu zenbakia (1-10): ");
        zenbakia = sarrera.nextInt();
        
        erantzuna = (int)(Math.random()*10+1);
        
        if(zenbakia == erantzuna)
            System.out.printf("Zorionak, igarri duzu!\n");
        else
            System.out.printf("Ooooh, ez duzu igarri, zenbaki sekretua %d izan da!\n",erantzuna);
    }
}