import java.util.Scanner;
public class Faktoriala1
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int zenbakia;
        int kontadorea;
        int faktoriala;
        
        System.out.print("Sartu 0 edo 0 baino handiagoa den zenbaki oso bat: ");
        zenbakia = sarrera.nextInt();
        
        kontadorea = 1;
        faktoriala = 1;
        while(zenbakia < 0)
        {
            System.out.print("\nSartu 0 edo 0 baino handiagoa den zenbaki oso bat: ");
            zenbakia = sarrera.nextInt();
        }
        
        while(kontadorea <= zenbakia)
        {
            faktoriala = kontadorea * faktoriala;
            kontadorea++;
        }
        System.out.printf("\n%d! = %d\n",zenbakia, faktoriala);
        sarrera.close();
    }
}