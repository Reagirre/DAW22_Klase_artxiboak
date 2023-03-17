package eragiketak;

import java.util.Scanner;

public class Eragiketak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sarrera = new Scanner(System.in);

        int zenbakia1;
        int zenbakia2;
        int aukera;
        int batuketa;
        int kenketa;
        int biderketa;
        double zatiketa;
        int modulua;

        System.out.print("Sartu 1. zenbakia: ");
        zenbakia1 = sarrera.nextInt();

        System.out.print("Sartu 2. zenbakia: ");
        zenbakia2 = sarrera.nextInt();

        System.out.println("Eragiketak");
        System.out.println("1. Batuketa");
        System.out.println("2. Kenketa");
        System.out.println("3. Biderketa");
        System.out.println("4. Zatiketa");
        System.out.println("5. Modulua");
        System.out.print("Aukeratu eragiketa: ");
        aukera = sarrera.nextInt();

        if (aukera == 1)
        {
            batuketa = batuketa(zenbakia1, zenbakia2);
            System.out.printf("%d + %d = %d\n",zenbakia1,zenbakia2,batuketa);
        }

        if (aukera == 2)
        {
            kenketa = kenketa(zenbakia1, zenbakia2);
            System.out.printf("%d - %d = %d\n",zenbakia1,zenbakia2,kenketa);
        }

        if (aukera == 3)
        {
            biderketa = biderketa(zenbakia1, zenbakia2);
            System.out.printf("%d x %d = %d\n",zenbakia1,zenbakia2,biderketa);
        }

        if (aukera == 4)
        {
            zatiketa = zatiketa(zenbakia1, zenbakia2);
            System.out.printf("%d / %d = %f\n",zenbakia1,zenbakia2,zatiketa);
        }

        if (aukera == 5)
        {
            modulua = modulua(zenbakia1, zenbakia2);
            System.out.printf("%d %% %d = %d\n",zenbakia1,zenbakia2,modulua);
        }

        if (aukera < 1 || aukera > 5)

            System.out.println("Aukera ez da zuzena");    
	}

    public static int batuketa(int zenbakia1, int zenbakia2)
    {
        return zenbakia1 + zenbakia2;
    }

    public static int kenketa(int zenbakia1, int zenbakia2)
    {
        return zenbakia1 - zenbakia2;
    }

    public static int biderketa(int zenbakia1, int zenbakia2)
    {
        return zenbakia1 * zenbakia2;
    }

    public static double zatiketa(int zenbakia1, int zenbakia2)
    {
        return (double)zenbakia1 / zenbakia2;
    }

    public static int modulua(int zenbakia1, int zenbakia2)
    {
        return zenbakia1 % zenbakia2;
    }

}
