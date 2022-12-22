import java.util.*;
public class Kotxea_Gehitu
{
    public static void gehitu() 
    {
        Scanner sarrera = new Scanner(System.in);

        String aukera;

        System.out.print("\n\nKotxe berri bat sartzeko atalera sartu zara.\n\n");
        System.out.print("Aurrera jarraitu nahi? (y/n)");
        aukera = sarrera.next();

        if(aukera == "y")
        {
            System.out.print("\n\nOrain kotxearen datuak sartu mesedez\n\n");
            
        }


        sarrera.close();
    }
}