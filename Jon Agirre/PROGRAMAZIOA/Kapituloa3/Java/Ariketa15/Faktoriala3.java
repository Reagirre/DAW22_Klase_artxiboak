import java.util.Scanner;
public class Faktoriala3
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int zenbakia;
        int kontadorea;
        int faktoriala;
        
        kontadorea = 1;
        faktoriala = 1;
        
        do
        {
            System.out.print("\nSartu 0 edo 0 baino handiagoa den zenbaki oso bat: ");
            zenbakia = sarrera.nextInt();
        }while(zenbakia < 0);
        
        do
        {
            faktoriala = kontadorea * faktoriala;
            kontadorea++;
        }while(kontadorea <= zenbakia);
        System.out.printf("\n%d! = %d\n",zenbakia, faktoriala);
        sarrera.close();
    }
}
