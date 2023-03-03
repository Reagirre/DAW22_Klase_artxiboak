import java.io.*;
import nu.xom.*;

public class KantakCsvXml{
    public static void main(String[] args) {
        File f;
        FileReader fr;
        BufferedReader br;
        String lerroa;
        String[] baloreak;
        FileOutputStream fos;
        Element kantak;
        Element kanta;
        Element id;
        Element izenburua;
        Element egilea;
        Element urtea;
        Document d;
        DocType dt;
        Serializer s;

        kantak = new Element("kantak");

        try {
            f = new File("lib/kantak.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            lerroa = br.readLine();

            while(lerroa != null)
            {
                baloreak = lerroa.split(";;");

                kanta = new Element("kanta");

                id = new Element("id");
                id.appendChild(baloreak[0]);
                kanta.appendChild(id);

                izenburua = new Element("izenburua");
                izenburua.appendChild(baloreak[1]);
                kanta.appendChild(izenburua);

                egilea = new Element("egilea");
                egilea.appendChild(baloreak[2]);
                kanta.appendChild(egilea);

                urtea = new Element("urtea");
                urtea.appendChild(baloreak[3]);
                kanta.appendChild(urtea);

                kantak.appendChild(kanta);

                lerroa = br.readLine();
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.printf("Salbuespena: %s\n", e);
        }
        catch(IOException e){
            System.out.printf("Salbuespena: %s\n", e);
        }

        d = new Document(kantak);

        dt = new DocType("kantak", "kantak.dtd");

        d.insertChild(dt, 0);

        try {
            fos = new FileOutputStream("lib/kantak.xml");
            s = new Serializer(fos, "UTF-8");
            s.setIndent(8);
            s.setMaxLength(100);
            s.write(d);
            s.flush();
            fos.close();

        } catch (FileNotFoundException e) {
            System.out.printf("Salbuespena: %s\n", e);
        }
        catch(IOException e){
            System.out.printf("Salbuespena: %s\n", e);
        }
    }
}