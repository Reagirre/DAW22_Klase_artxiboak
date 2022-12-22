import java.util.*;
import java.io.*;
public class Kotxea extends Produktua
{
    String modeloa;
    String kolorea;
    int id_kotxea;
    String tipoa;
    String motorea;
    
    public Kotxea()
    {
        super();
    }
    public Kotxea(int id, String izena, String fabrikatzailea, String produkzio_data, int prezioa, int id_kotxea,String modeloa,
     String kolorea, String tipoa, String motorea)
    {
        super(id, izena, fabrikatzailea, produkzio_data, prezioa);
        this.id_kotxea = id_kotxea;
        this.modeloa = modeloa;
        this.kolorea = kolorea;
        this.tipoa = tipoa;
        this.motorea = motorea;
    }

    public String getModeloa() {
        return modeloa;
    }
    public void setModeloa(String modeloa) {
        this.modeloa = modeloa;
    }

    public String getKolorea() {
        return kolorea;
    }
    public void setKolorea(String kolorea) {
        this.kolorea = kolorea;
    }

    public int getId_kotxea() {
        return id_kotxea;
    }
    public void setId_kotxea(int id_kotxea) {
        this.id_kotxea = id_kotxea;
    }

    public String getTipoa() {
        return tipoa;
    }
    public void setTipoa(String tipoa) {
        this.tipoa = tipoa;
    }
    
    public String getMotorea() {
        return motorea;
    }
    public void setMotorea(String motorea) {
        this.motorea = motorea;
    }
    public String idatzi() {
        return getId() + "," + getIzena() + "," + getFabrikatzailea() + "," + getProdukzio_data() + "," + getPrezioa() + "," + id_kotxea
        + "," + modeloa + "," + kolorea + "," + tipoa + "," + motorea + ",";
    }
    public static boolean konprobatu(int x, int zein) 
    {
        boolean result = false;
        String kotxeak = "lib/Kotxeak.csv";
        int y;
        try {
            File kotxeakIra = new File(kotxeak);
            Scanner reader = new Scanner(kotxeakIra);
            String strin;
            while(reader.hasNextLine())
            {
                strin = reader.nextLine();
                int index = strin.indexOf(",");
                y = Integer.parseInt(strin.substring(zein, index));
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