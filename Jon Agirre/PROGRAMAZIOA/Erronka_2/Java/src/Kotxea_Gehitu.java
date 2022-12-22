import java.util.*;
import java.io.*;
public class Kotxea_Gehitu
{
    public static void gehitu() 
    {
        Scanner sarrera = new Scanner(System.in);

        String aukera;
        String kotxeak = "lib/Kotxeak.csv";
        String sardena;
        Kotxea kotxea = new Kotxea();

        System.out.print("\n\nKotxe berri bat sartzeko atalera sartu zara.\n\n");
        System.out.print("Aurrera jarraitu nahi? (y/n)");
        aukera = sarrera.next();

        if(aukera == "y")
        {
            System.out.print("\n\nOrain kotxearen datuak sartu mesedez\n\n");
            try 
            {
                BufferedWriter writer = new BufferedWriter(new FileWriter(kotxeak, true));
                System.out.print("Sartu kodea: ");
                sardena = Integer.toString(sarrera.nextInt());
                
                writer.write(sardena);
                writer.close();
            } 
            catch (IOException e)
            {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

        

        sarrera.close();
    }
}