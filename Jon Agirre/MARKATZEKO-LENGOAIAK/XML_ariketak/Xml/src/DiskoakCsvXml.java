import java.io.*;
import nu.xom.*;

public class DiskoakCsvXml{
    public static void main(String[] args) {
        File f;
        FileReader fr;
        BufferedReader br;
        String lerroa;
        String[] baloreak;
        FileOutputStream fos;
        Element diskoak;
        Element diskoa;
        Attribute id;
        Element izenburua;
        Element egilea;
        Element urtea;
        Element formatua;
        Element prezioa;
        Document d;
        DocType dt;
        Serializer s;

        diskoak = new Element("diskoak");

        try {
            f = new File("lib/diskoak.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            lerroa = br.readLine();

            while(lerroa != null)
            {
                baloreak = lerroa.split(";;");

                diskoa = new Element("diskoa");

                id = new Attribute("id",baloreak[0]);
                diskoa.addAttribute(id);

                izenburua = new Element("izenburua");
                izenburua.appendChild(baloreak[1]);
                diskoa.appendChild(izenburua);

                egilea = new Element("egilea");
                egilea.appendChild(baloreak[2]);
                diskoa.appendChild(egilea);

                urtea = new Element("urtea");
                urtea.appendChild(baloreak[3]);
                diskoa.appendChild(urtea);

                formatua = new Element("formatua");
                formatua.appendChild(baloreak[4]);
                diskoa.appendChild(formatua);

                prezioa = new Element("prezioa");
                prezioa.appendChild(baloreak[5]);
                diskoa.appendChild(prezioa);

                diskoak.appendChild(diskoa);

                lerroa = br.readLine();
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.printf("Salbuespena: %s\n", e);
        }
        catch(IOException e){
            System.out.printf("Salbuespena: %s\n", e);
        }

        d = new Document(diskoak);

        dt = new DocType("diskoak", "diskoak.dtd");

        d.insertChild(dt, 0);

        try {
            fos = new FileOutputStream("lib/diskoak.xml");
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