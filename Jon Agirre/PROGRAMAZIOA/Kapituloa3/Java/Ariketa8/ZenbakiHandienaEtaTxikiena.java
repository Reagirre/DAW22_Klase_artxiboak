import java.util.Scanner;

public class ZenbakiHandienaEtaTxikiena
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int zenbakia1;
        int zenbakia2;
        int zenbakia3;
        
        System.out.print("Sartu 1. zenbakia: ");
        zenbakia1 = sarrera.nextInt();
        System.out.print("Sartu 2. zenbakia: ");
        zenbakia2 = sarrera.nextInt();
        System.out.print("Sartu 3. zenbakia: ");
        zenbakia3 = sarrera.nextInt();
        
        if(zenbakia1 < zenbakia2 && zenbakia3 < zenbakia2)
        {
            if(zenbakia1 > zenbakia3)
            {
                System.out.printf("Zenbaki handiena %d da\n", zenbakia2);
                System.out.printf("Zenbaki txikiena %d da\n", zenbakia3);
            }
            else
            {
                System.out.printf("Zenbaki handiena %d da\n", zenbakia2);
                System.out.printf("Zenbaki txikiena %d da\n", zenbakia1);
            }
        }
        else
        {
            if(zenbakia1 > zenbakia3)
            {
                System.out.printf("Zenbaki handiena %d da\n", zenbakia1);
                if(zenbakia2 > zenbakia3)
                    System.out.printf("Zenbaki txikiena %d da\n", zenbakia3);
                else
                    System.out.printf("Zenbaki txikiena %d da\n", zenbakia2);
            }
            else 
            {
                System.out.printf("Zenbaki handiena %d da\n", zenbakia3);
                if(zenbakia2 > zenbakia1)
                    System.out.printf("Zenbaki txikiena %d da\n", zenbakia1);
                else
                    System.out.printf("Zenbaki txikiena %d da\n", zenbakia2);
            }
        }
    }
}