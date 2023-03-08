public class Mikroprozesadorea implements Comparable <Mikroprozesadorea>
{
    private String kodea;
    private String ekoizlea;
    private String modeloa;
    private String socketa;
    private double frekuentzia;
    private double prezioa;
    private int deskontua;

    public Mikroprozesadorea()
    {

    }

    public Mikroprozesadorea(String kodea, String ekoizlea, String modeloa, String socketa, double frekuentzia, double prezioa, int deskontua)
    {
        this.kodea = kodea;
        this.ekoizlea = ekoizlea;
        this.modeloa = modeloa;
        this.socketa = socketa;
        this.frekuentzia = frekuentzia;
        this.prezioa = prezioa;
        this.deskontua = deskontua;
    }

    public void setKodea(String kodea)
    {
        this.kodea = kodea;
    }

    public String getKodea()
    {
        return kodea;
    }

    public void setEkoizlea(String ekoizlea)
    {
        this.ekoizlea = ekoizlea;
    }

    public String getEkoizlea()
    {
        return ekoizlea;
    }

    public void setModeloa(String modeloa)
    {
        this.modeloa = modeloa;
    }

    public String getModeloa()
    {
        return modeloa;
    }

    public void setSocketa(String socketa)
    {
        this.socketa = socketa;
    }

    public String getSocketa()
    {
        return socketa;
    }

    public void setFrekuentzia(double frekuentzia)
    {
        this.frekuentzia = frekuentzia;
    }

    public double getFrekuentzia()
    {
        return frekuentzia;
    }

    public void setPrezioa(double prezioa)
    {
        this.prezioa = prezioa;
    }

    public double getPrezioa()
    {
        return prezioa;
    }

    public void setDeskontua(int deskontua)
    {
        this.deskontua = deskontua;
    }

    public int getDeskontua()
    {
        return deskontua;
    }

    public double salmentaPrezioa()
    {
        return prezioa - prezioa * deskontua / 100;
    }

    public void erakutsi()
    {
        System.out.println("Kodea: " + kodea);
        System.out.println("Ekoizlea: " + ekoizlea);
        System.out.println("Modeloa: " + modeloa);
        System.out.println("Socketa: " + socketa);
        System.out.println("Frekuentzia: " + frekuentzia);
        System.out.println("Prezioa: " + prezioa);
        System.out.println("Deskontua: %" + deskontua);
        System.out.println("Salmenta-prezioa: " + salmentaPrezioa());
    }

    public void erakutsi(String hizkuntza)
    {
        if (hizkuntza.equals("ES"))
        {
            System.out.println("Código: " + kodea);
            System.out.println("Fabricante: " + ekoizlea);
            System.out.println("Modelo: " + modeloa);
            System.out.println("Socket: " + socketa);
            System.out.println("Frecuencia: " + frekuentzia);
            System.out.println("Precio: " + prezioa);
            System.out.println("Descuento: " + deskontua + "%");
            System.out.println("Precio de venta: " + salmentaPrezioa());
        }
        else if (hizkuntza.equals("EN"))
        {
            System.out.println("Code: " + kodea);
            System.out.println("Manufacturer: " + ekoizlea);
            System.out.println("Model: " + modeloa);
            System.out.println("Socket: " + socketa);
            System.out.println("Frequency: " + frekuentzia);
            System.out.println("Price: " + prezioa);
            System.out.println("Discount: " + deskontua + "%");
            System.out.println("Sale price: " + salmentaPrezioa());
        }
        else
        {
            System.out.println("Kodea: " + kodea);
            System.out.println("Ekoizlea: " + ekoizlea);
            System.out.println("Modeloa: " + modeloa);
            System.out.println("Socketa: " + socketa);
            System.out.println("Frekuentzia: " + frekuentzia);
            System.out.println("Prezioa: " + prezioa);
            System.out.println("Deskontua: " + deskontua + "%");
            System.out.println("Salmenta-prezioa: " + salmentaPrezioa());
        }
    }
    
    @Override
    public int compareTo(Mikroprozesadorea mikroprozesadorea)
    {
        return this.kodea.compareTo(mikroprozesadorea.getKodea());
    }
}
