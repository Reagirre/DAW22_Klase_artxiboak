import java.util.*;
import java.io.*;
public class Kotxea_Ezabatu
{
    public static void ezabatu() {
        String kotxeak = "lib/Kotxeak.csv";
        Kotxea kotxea1 = new Kotxea();
        Scanner sarrera = new Scanner(System.in);

        String aukera;
        String lerroa;

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
                BufferedReader br = new BufferedReader(new FileReader(kotxeak));
                BufferedWriter writer = new BufferedWriter(new FileWriter(kotxeak, true));

                while((lerroa = br.readLine()) != null)
                {
                    String[] autoa = lerroa.split(",");
                    System.out.println("Id-a: " + autoa[0]);
                }
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