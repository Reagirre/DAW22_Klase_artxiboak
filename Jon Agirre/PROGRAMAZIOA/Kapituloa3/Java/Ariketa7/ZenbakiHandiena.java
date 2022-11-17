import java.util.Scanner;

public class ZenbakiHandiena
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        float zenbakia1;
        float zenbakia2;
        float zenbakia3;
        
        System.out.print("Sartu 1. zenbakia: ");
        zenbakia1 = sarrera.nextInt();
        System.out.print("Sartu 2. zenbakia: ");
        zenbakia2 = sarrera.nextInt();
        System.out.print("Sartu 3. zenbakia: ");
        zenbakia3 = sarrera.nextInt();
        
        if(zenbakia1 < zenbakia2 && zenbakia3 < zenbakia2)
            System.out.printf("Zenbakia handiena %.0f da\n", zenbakia2);
        else if(zenbakia1 > zenbakia3)
            System.out.printf("Zenbaki handiena %.0f da", zenbakia1);
        else
            System.out.printf("Zenbaki handiena %.0f da", zenbakia3);
    }
}