import java.util.Scanner;
public class Lerroa
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int zenbakia;
        int kontadorea;
        
        System.out.print("Sartu lerroaren luzeera: ");
        zenbakia = sarrera.nextInt();
        
        kontadorea = 0;
        while(kontadorea < zenbakia)
        {
            System.out.print("*");
            kontadorea++;
        }
        sarrera.close();
    }
}