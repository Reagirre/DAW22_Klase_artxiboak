import java.util.*;
import java.io.*;
public class Kotxea_Gehitu
{
    private static String kotxeak = "lib/Kotxeak.csv";
    private static Kotxea kotxea1 = new Kotxea();
    public static void gehitu() 
    {
        Scanner sarrera = new Scanner(System.in);

        String aukera;
        
        int probatu;

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
                probatu = sarrera.nextInt();
                while(!konprobatu(probatu))
                {
                    System.out.print("Sartu kodea berriro: ");
                    probatu = sarrera.nextInt();
                }
                kotxea1.setId(probatu);

            
                writer.write(kotxea1.idatzi());
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
    private static boolean konprobatu(int x) 
    {
        boolean result = false;
        int y;
        try {
            File kotxeakIra = new File(kotxeak);
            Scanner reader = new Scanner(kotxeakIra);
            String strin;
            while(reader.hasNextLine())
            {
                strin = reader.nextLine();
                int index = strin.indexOf(",");
                y = Integer.parseInt(strin.substring(0, index));
                if(x == y)
                    result = true;
            }
            reader.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        return result;
    }
}