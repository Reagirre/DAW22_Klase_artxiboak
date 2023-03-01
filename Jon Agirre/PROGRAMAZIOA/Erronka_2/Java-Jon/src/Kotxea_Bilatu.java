import java.util.*;
import java.io.*;

public class Kotxea_Bilatu
{
    public static void bilatu() {
        String kotxeak = "lib/Kotxeak.csv";
        Kotxea kotxea1 = new Kotxea();
        Scanner sarrera = new Scanner(System.in);

        String aukera;
        
        int probatu;

        System.out.print("\n\nKotxe bat ezabatzeko atalera sartu zara.\n\n");
        System.out.print("Aurrera jarraitu nahi? (y/n): ");
        aukera = sarrera.nextLine();

        if(aukera.equals("y"))
        {
            System.out.print("\n\nIdentifikatzeko ze kotxe ezabatu nahi duzun, kodea adierazi behar duzu. Kontuz honekin!\n\n");
            System.out.print("\n\nAukeratzen den kotxea ezabatu egingo da erregistrotik!!!\n\n");
            System.out.print("\n\nHona hemen barneko kotxeak:\n\n");
            try 
            {
                File kotxeak_file = new File(kotxeak);
                Scanner scan = new Scanner(kotxeak_file);
                BufferedWriter writer = new BufferedWriter(new FileWriter(kotxeak, true));
                
                
            } 
            catch (IOException e)
            {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        else if(aukera.equals("n"))
        {

        }
        else{
            System.out.println("Aukera ez da zuzena. Sartu berriro:");
        }

        sarrera.close();
    }
}