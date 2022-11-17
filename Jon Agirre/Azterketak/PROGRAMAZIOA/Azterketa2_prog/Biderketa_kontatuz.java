import java.util.Scanner;
import java.lang.Math;

public class Biderketa_kontatuz
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int zbk1, zbk2, b,k;
        
        System.out.print("Sartu 1.zenbakia: ");
        zbk1 = sarrera.nextInt();
        
        System.out.print("Sartu 2.zenbakia: ");
        zbk2 = sarrera.nextInt();
        
        b = 0;
        k = 1;
        while(k <= zbk2)
        {
            b = b + zbk1;
            k = k + 1;
        }
        
        System.out.print(b);
        sarrera.close();
    }
}
