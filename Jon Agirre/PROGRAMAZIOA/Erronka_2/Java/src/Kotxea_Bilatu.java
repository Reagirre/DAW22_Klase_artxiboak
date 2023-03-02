import java.util.*;
import java.io.*;

public class Kotxea_Bilatu
{
    public static void bilatu() {
        String kotxeak = "lib/Kotxeak.csv";
        Kotxea kotxea1 = new Kotxea();
        Scanner sarrera = new Scanner(System.in);

        String aukera;
        String berriro;
        
        int probatu;

        System.out.print("\n\nKotxe bat bilatzeko atalera sartu zara.\n\n");
        System.out.print("Aurrera jarraitu nahi? (y/n): ");
        aukera = sarrera.nextLine();
        while(!(aukera.equals("y")))
        {
            if(aukera.equals("n"))
            {
                break;
            }
            System.out.print("\n\nAukera ez da zuzena. Sartu berriz. \n\n");
            System.out.print("\n\nKotxe bat bilatzeko atalera sartu zara.\n\n");
            System.out.print("Aurrera jarraitu nahi? (y/n): ");
            aukera = sarrera.nextLine();
        }
        if(aukera.equals("y"))
        {
            System.out.print("\n\nIdentifikatzeko ze kotxe bilatu nahi duzun, kodea adierazi behar duzu\n\n");
            System.out.print("\n\nSartu ze kode bilatu nahi duzun: ");
            probatu = sarrera.nextInt();
            try 
            {
                File kotxeak_file = new File(kotxeak);
                Scanner scan = new Scanner(kotxeak_file);
                BufferedWriter writer = new BufferedWriter(new FileWriter(kotxeak, true));

                if(Kotxea.konprobatu(probatu, 0))
                {
                    System.out.print("\n\nAurkitu da zuk sartutako kodea duen kotxea.\n\n");
                    System.out.print("\n\nHonakoa da: ");
                    Kotxea.erakutsiKotxea(probatu, 0);
                }
                else if(Kotxea.konprobatu(probatu, 0) != true)
                {
                    System.out.print("\n\nEz da sartutako kodea aurkitu.\n");
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