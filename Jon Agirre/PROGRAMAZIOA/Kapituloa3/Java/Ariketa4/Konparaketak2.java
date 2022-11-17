import java.util.Scanner;

public class Konparaketak2
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        float zenbakia1;
        float zenbakia2;
        float zenbakia3;
        
        System.out.print("Sartu tartearen zenbaki txikiena: ");
        zenbakia1 = sarrera.nextInt();
        System.out.print("Sartu tartearen zenbaki handiena: ");
        zenbakia2 = sarrera.nextInt();
        System.out.print("Sartu zenbaki bat: ");
        zenbakia3 = sarrera.nextInt();
        
        if(zenbakia3 < zenbakia1 || zenbakia3 > zenbakia2)
        {
            System.out.print("Zenbakia ez dago tartean\n");
        }
        if(zenbakia3 >= zenbakia1 && zenbakia3 <= zenbakia2)
        {
            System.out.printf("Zenbakia tartean dago");
        }
        
    }
}


