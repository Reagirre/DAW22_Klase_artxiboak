import java.io.*;
import java.util.*;

public class ProbaKanta
{
    
    public static void proba() {

        String kotxeak = "lib/Kotxeak.csv";
        // Scanner s = null;
        
        ArrayList<Kotxea> autoak = new ArrayList<Kotxea>();


        Kotxea kotxea1 = new Kotxea(20,"Tesla Model S", "Tesla","2021/08/14",
        50000, 1, "Model S", "Negro","Deportivo", "LED");

        Kotxea kotxea2 = new Kotxea(26,"Tesla Model S", "Tesla","2021/08/14",
        50000, 1, "Model S", "Negro","Deportivo", "LED");

        Kotxea kotxea3 = new Kotxea(10,"Tesla Model S", "Tesla","2021/08/14",
        50000, 1, "Model S", "Negro","Deportivo", "LED");

        autoak.add(kotxea1);
        autoak.add(kotxea2);
        autoak.add(kotxea3);
        
        //HAU DA IDAZTEKO
        int kont = 0;
        try 
        {
            // ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(kotxeak,true));
            // writer.writeObject(kotxea1);

            BufferedWriter writer = new BufferedWriter(new FileWriter(kotxeak, true));
            while(kont < autoak.size())
            {
                String testua = autoak.get(kont).idatzi();
                writer.write(testua);
                writer.newLine();
                kont++;
            }

            writer.close();
        } 
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

            // FileOutputStream f = new FileOutputStream("test.txt");
            // PrintStream ps = new PrintStream(f);
            // ps.print("line1");
            // ps.println(); //this writes your new line
            // ps.print("line2");
            // ps.close();


            // BufferedWriter fos = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename)));
            //       fos.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            //       fos.newLine();

        //HAU DA IRAKURTZEKO

        try 
        {
            File kotxeakIra = new File(kotxeak);
            Scanner reader = new Scanner(kotxeakIra);
            String strin;
            //String[] split = string.split(",");
            // while (reader.hasNextLine()) {
            //     strin = reader.nextLine();
            //     int index = strin.indexOf(":");
            //     Kotxea  kotxea4 = new Kotxea(Integer.parseInt(strin.substring(0, index)),
            //      strin.substring(1, index),
            //      strin.substring(2, index),
            //      strin.substring(3, index),
            //      Integer.parseInt(strin.substring(4, index)),
            //      Integer.parseInt(strin.substring(5, index)),
            //      strin.substring(6, index),
            //      strin.substring(7, index),
            //      strin.substring(8, index),
            //      strin.substring(9, index));
            //      autoak.add(kotxea4);
            //     // String value = strin.substring(0, index);

            // }
            
            if(reader.hasNextLine())
            {
                strin = reader.nextLine();
                int index = strin.indexOf(",");
                Kotxea  kotxea4 = new Kotxea(Integer.parseInt(strin.substring(0, index)),
                 strin.substring(1, index),
                 strin.substring(2, index),
                 strin.substring(3, index),
                 Integer.parseInt(strin.substring(4, index)),
                 Integer.parseInt(strin.substring(5, index)),
                 strin.substring(6, index),
                 strin.substring(7, index),
                 strin.substring(8, index),
                 strin.substring(9, index));
                 autoak.add(kotxea4);
            }
            
            
            // System.out.print(kotxea4);
            // int kont3 = 0;
            // while(kont3 < autoak.size())
            // {
            //     System.out.print(kotxea4);
            // }
            // String[] split = strin.split(",");
            // System.out.println(value);
            // System.out.println(split);
            // strin = "";

            reader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}