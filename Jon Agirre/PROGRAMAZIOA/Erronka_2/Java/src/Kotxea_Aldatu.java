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
        int probatu2;

        System.out.print("\n\nKotxe bat aldatzeko atalera sartu zara.\n\n");
        System.out.print("Aurrera jarraitu nahi? (y/n): ");
        aukera = sarrera.nextLine();

        if(aukera.equals("y"))
        {
            System.out.print("\n\nOrain kotxearen datuak sartu mesedez\n\n");
            try 
            {
                BufferedWriter writer = new BufferedWriter(new FileWriter(kotxeak, true));
                System.out.print("Sartu kodea: ");
                probatu = sarrera.nextInt();
                while(Kotxea.konprobatu(probatu, 0) != false)
                {
                    System.out.print("Sartu kodea berriro: ");
                    probatu = sarrera.nextInt();
                }
                kotxea1.setId(probatu);

                System.out.print("Sartu produktuaren izena: ");
                kotxea1.setIzena(sarrera.next());

                System.out.print("Sartu produktuaren fabrikatzailea: ");
                kotxea1.setFabrikatzailea(sarrera.next());

                System.out.print("Sartu produktuaren data: ");
                kotxea1.setProdukzio_data(sarrera.next());

                System.out.print("Sartu produktuaren prezioa: ");
                kotxea1.setPrezioa(sarrera.nextInt());

                System.out.print("Sartu kotxearen id-a: ");
                probatu2 = sarrera.nextInt();
                while(Kotxea.konprobatu(probatu2, 4) != false)
                {
                    System.out.print("Sartu kodea berriro: ");
                    probatu2 = sarrera.nextInt();
                }
                kotxea1.setId_kotxea(probatu2);

                System.out.print("Sartu kotxearen modeloa: ");
                kotxea1.setModeloa(sarrera.next());

                System.out.print("Sartu kotxearen kolorea: ");
                kotxea1.setKolorea(sarrera.next());

                System.out.print("Sartu kotxearen tipoa: ");
                kotxea1.setTipoa(sarrera.next());

                System.out.print("Sartu kotxearen motorea: ");
                kotxea1.setMotorea(sarrera.next());
            
                writer.write(kotxea1.idatzi());
                writer.newLine();
                writer.close();
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

        sarrera.close();
    }
}