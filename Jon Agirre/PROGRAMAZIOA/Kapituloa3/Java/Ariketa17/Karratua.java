import java.util.Scanner;
public class Karratua
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int zenbakia;
        int kontadorea;
        int kontadorea2;
        
        System.out.print("Sartu karratuaren luzeera: ");
        zenbakia = sarrera.nextInt();
        
        kontadorea = 0;
        kontadorea2 = 0;
        while(kontadorea < zenbakia)
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