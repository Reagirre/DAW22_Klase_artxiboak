import java.util.Scanner;
public class Hirukia
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int zenbakia;
        int kontadorea;
        int kontadorea2;
        
        System.out.print("Sartu hirukiaren altuera: ");
        zenbakia = sarrera.nextInt();
        
        kontadorea = 1;
        kontadorea2 = 0;
        while(kontadorea <= zenbakia)
        {
            while(kontadorea2 < kontadorea)
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