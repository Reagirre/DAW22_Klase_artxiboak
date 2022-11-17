import java.util.Scanner;

public class Eragiketak1
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        float zenbakia1;
        float zenbakia2;
        float batuketa;
        float kenketa;
        float biderketa;
        float zatiketa;
        float modulua;
        int aukera;
        
        System.out.print("Sartu 1. zenbakia: ");
        zenbakia1 = sarrera.nextInt();
        System.out.print("Sartu 2. zenbakia: ");
        zenbakia2 = sarrera.nextInt();
        
        System.out.print("Eragiketak\n 1.Batuketa\n 2.Kenketa\n 3.Biderketa\n 4.Zatiketa\n 5.Modulua\n");
        
        System.out.print("Aukeratu eragiketa: ");
        aukera = sarrera.nextInt();
        if(aukera == 1)
        {
            batuketa = zenbakia1 + zenbakia2;
            System.out.printf("%.0f + %.0f = %.0f ",zenbakia1,zenbakia2,batuketa);
        }
        if(aukera == 2)
        {
            kenketa = zenbakia1 - zenbakia2;
            System.out.printf("%.0f - %.0f = %.0f ",zenbakia1,zenbakia2,kenketa);
        }
        if(aukera == 3)
        {
            biderketa = zenbakia1 * zenbakia2;
            System.out.printf("%.0f * %.0f = %.0f ",zenbakia1,zenbakia2,biderketa);
        }
        if(aukera == 4)
        {
            zatiketa = zenbakia1 / zenbakia2;
            System.out.printf("%.0f / %.0f = %.0f ",zenbakia1,zenbakia2,zatiketa);
        }
        if(aukera == 5)
        {
            modulua = zenbakia1 % zenbakia2;
            System.out.printf("%.0f % %.0f = %.0f ",zenbakia1,zenbakia2,modulua);
        }
    }
}


