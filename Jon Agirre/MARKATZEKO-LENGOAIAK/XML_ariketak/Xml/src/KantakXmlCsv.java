import java.io.*;
import nu.xom.*;

public class KantakXmlCsv{
    public static void main(String[] args) {
        File f;
        FileWriter fw;
        BufferedWriter bw;
        Document d;
        Elements kantak;

        try {
            f = new File("lib/kantak.xml");
            d = new Builder().build(f);
            kantak = d.getRootElement().getChildElements();

            fw = new FileWriter("lib/kantak.csv");
            bw = new BufferedWriter(fw);

            for(int i = 0; i < kantak.size(); i++)
            {
                bw.write(kantak.get(i).getFirstChildElement("id").getValue() + ";;" +
                kantak.get(i).getFirstChildElement("izenburua").getValue() + ";;" + 
                kantak.get(i).getFirstChildElement("egilea").getValue() + ";;" + 
                kantak.get(i).getFirstChildElement("urtea").getValue() + "\r\n");
            }
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.printf("Salbuespena: %s\n", e);
        }
        catch(IOException e){
            System.out.printf("Salbuespena: %s\n", e);
        }
        catch(ParsingException e){
            System.out.printf("Salbuespena: %s\n", e);
        }
    }

}