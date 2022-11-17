import java.util.Scanner;
public class Faktoriala2
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int zenbakia;
        int kontadorea;
        int faktoriala;
        zenbakia = 0;
        
        System.out.print("Sartu 0 edo 0 baino handiagoa den zenbaki oso bat: ");
        zenbakia = sarrera.nextInt();
        
        for(;zenbakia < 0;)
        {
            System.out.print("\nSartu 0 edo 0 baino handiagoa den zenbaki oso bat: ");
            zenbakia = sarrera.nextInt();
        }
        for(kontadorea = 1 ,faktoriala = 1; kontadorea <= zenbakia; kontadorea++)
            faktoriala = kontadorea * faktoriala;
        System.out.printf("\n%d! = %d",zenbakia, faktoriala);
    }
}
