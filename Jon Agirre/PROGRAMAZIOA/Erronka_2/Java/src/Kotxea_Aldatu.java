import java.util.*;
import java.io.*;
public class Kotxea_Aldatu
{
    public static void aldatu() {
        String kotxeak = "lib/Kotxeak.csv";
        Kotxea kotxea1 = new Kotxea();
        Scanner sarrera = new Scanner(System.in);

        String aukera;
        
        int probatu;

        System.out.print("\n\nKotxe bat aldatzeko atalera sartu zara.\n\n");
        System.out.print("Aurrera jarraitu nahi? (y/n): ");
        aukera = sarrera.nextLine();

        if(aukera.equals("y"))
        {
            System.out.print("\n\nIdentifikatzeko ze kotxe aldatu nahi duzun, kodea adierazi behar duzu. Kontuz honekin!\n\n");
            try 
            {
                File kotxeak_file = new File(kotxeak);
                Scanner scan = new Scanner(kotxeak_file);
                BufferedWriter writer = new BufferedWriter(new FileWriter(kotxeak, true));
                
                while(scan.hasNextLine())
                {
                    System.out.println(scan.nextLine());
                }
                //String strin;
                //strin = reader.nextLine();
                //int index = strin.indexOf(",");
                System.out.print("Sartu kodea: ");
                probatu = sarrera.nextInt();
                if(Kotxea.konprobatu(probatu, 0))
                {
                    System.out.printf("Kodea %s", scan.nextLine());
                }

                // writer.write(kotxea1.idatzi());
                // writer.newLine();
                writer.close();
                scan.close();
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

