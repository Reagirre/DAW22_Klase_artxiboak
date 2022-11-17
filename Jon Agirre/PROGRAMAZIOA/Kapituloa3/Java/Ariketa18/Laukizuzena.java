import java.util.Scanner;
public class Laukizuzena
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int zenbakia;
        int zenbakia2;
        int kontadorea;
        int kontadorea2;
        
        System.out.print("Sartu laukizuzenaren oinarria: ");
        zenbakia = sarrera.nextInt();
        System.out.print("Sartu laukizuzenaren altuera: ");
        zenbakia2 = sarrera.nextInt();
        
        kontadorea = 0;
        kontadorea2 = 0;
        while(kontadorea < zenbakia2)
        {
            while(kontadorea2 < zenbakia)
            {
                System.out.print("*");
                kontadorea2++;
            }
            System.out.print("\n");
            kontadorea++;
            kontadorea2 = 0;
        }
        sarrera.close();
    }
}