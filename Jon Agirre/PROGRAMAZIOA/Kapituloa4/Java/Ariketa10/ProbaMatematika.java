package Ariketa10;

import java.util.Scanner;

public class ProbaMatematika
{
    
    public static void main( String[] args) 
    {
        Scanner sarrera = new Scanner(System.in);

        int zenbakia1;
        int zenbakia2;
        double zenbakia3;
        double zenbakia4;
        float zenbakia5;
        float zenbakia6;
        long zenbakia7;
        long zenbakia8;

        System.out.print("Sartu 1. zenbakia (int): ");
        zenbakia1 = sarrera.nextInt();

        System.out.print("Sartu 2. zenbakia (int): ");
        zenbakia2 = sarrera.nextInt();

        System.out.printf("Zenbaki handiena %d da\n", Matematika.max(zenbakia1,zenbakia2));
        
        //---------------------------------------------------------------------------------------------------//

        System.out.print("Sartu 3. zenbakia (double): ");
        zenbakia3 = sarrera.nextDouble();

        System.out.print("Sartu 4. zenbakia (double): ");
        zenbakia4 = sarrera.nextDouble();

        System.out.printf("Zenbaki handiena %f da\n", Matematika.max(zenbakia3,zenbakia4));

        //---------------------------------------------------------------------------------------------------//

        System.out.print("Sartu 5. zenbakia (float): ");
        zenbakia5 = sarrera.nextFloat();

        System.out.print("Sartu 6. zenbakia (float): ");
        zenbakia6 = sarrera.nextFloat();

        System.out.printf("Zenbaki handiena %f da\n", Matematika.max(zenbakia5,zenbakia6));

        //---------------------------------------------------------------------------------------------------//

        System.out.print("Sartu 7. zenbakia (long): ");
        zenbakia7 = sarrera.nextLong();

        System.out.print("Sartu 8. zenbakia (long): ");
        zenbakia8 = sarrera.nextLong();

        System.out.printf("Zenbaki handiena %f da\n", Matematika.max(zenbakia7,zenbakia8));

        sarrera.close();
    }
}