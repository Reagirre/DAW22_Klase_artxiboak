import java.util.Scanner;

public class Konparaketak
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        float zenbakia1;
        float zenbakia2;
        
        System.out.print("Sartu 1. zenbakia: ");
        zenbakia1 = sarrera.nextInt();
        System.out.print("Sartu 2. zenbakia: ");
        zenbakia2 = sarrera.nextInt();
        
        if(zenbakia1 == zenbakia2)
        {
            System.out.print("Zenbakiak berdinak dira\n");
        }
        if(zenbakia1 != zenbakia2)
        {
            System.out.print("Zenbakiak ezberdinak dira\n");
        }
        if(zenbakia1 < zenbakia2)
        {
            System.out.print("1.zenbakia 2.zenbakia baino txikiagoa da\n");
        }
        if(zenbakia1 > zenbakia2)
        {
            System.out.print("1.zenbakia 2.zenbakia baino handiagoa da\n");
        }
        if(zenbakia1 <= zenbakia2)
        {
            System.out.print("1.zenbakia 2.zenbakia baino txikiagoa edo berdina da\n");
        }
        if(zenbakia1 >= zenbakia2)
        {
            System.out.print("1.zenbakia 2.zenbakia baino handiagoa  edo berdina da\n");
        }
    }
}


