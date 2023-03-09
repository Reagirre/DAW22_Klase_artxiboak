public class Kotxea implements Comparable <Kotxea>
{
    private String kodea;
    private String fabrikatzailea;
    private String modeloa;
    private String kolorea;
    private double zaldiak;
    private double prezioa;
    int deskontua;

    public Kotxea()
    {

    }

    public Kotxea(String kodea, String fabrikatzailea, String modeloa, String kolorea, double zaldiak, double prezioa, int deskontua)
    {
        this.kodea = kodea;
        this.fabrikatzailea = fabrikatzailea;
        this.modeloa = modeloa;
        this.kolorea = kolorea;
        this.zaldiak = zaldiak;
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

    public void setFabrikatzailea(String fabrikatzailea)
    {
        this.fabrikatzailea = fabrikatzailea;
    }

    public String getFabrikatzailea()
    {
        return fabrikatzailea;
    }

    public void setModeloa(String modeloa)
    {
        this.modeloa = modeloa;
    }

    public String getModeloa()
    {
        return modeloa;
    }

    public void setKolorea(String kolorea)
    {
        this.kolorea = kolorea;
    }

    public String getKolorea()
    {
        return kolorea;
    }

    public void setZaldiak(double zaldiak)
    {
        this.zaldiak = zaldiak;
    }

    public double getZaldiak()
    {
        return zaldiak;
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
        System.out.println("Fabrikatzailea: " + fabrikatzailea);
        System.out.println("Modeloa: " + modeloa);
        System.out.println("Kolorea: " + kolorea);
        System.out.println("Zaldiak: " + zaldiak);
        System.out.println("Prezioa: " + prezioa);
        System.out.println("Deskontua: %" + deskontua);
        System.out.println("Salmenta-prezioa: " + salmentaPrezioa());
    }

    public void erakutsi(String hizkuntza)
    {
        if (hizkuntza.equals("ES"))
        {
            System.out.println("Código: " + kodea);
            System.out.println("Fabricante: " + fabrikatzailea);
            System.out.println("Modelo: " + modeloa);
            System.out.println("Kolorea: " + kolorea);
            System.out.println("Caballos: " + zaldiak);
            System.out.println("Precio: " + prezioa);
            System.out.println("Descuento: " + deskontua + "%");
            System.out.println("Precio de venta: " + salmentaPrezioa());
        }
        else if (hizkuntza.equals("EN"))
        {
            System.out.println("Code: " + kodea);
            System.out.println("Manufacturer: " + fabrikatzailea);
            System.out.println("Model: " + modeloa);
            System.out.println("Kolorea: " + kolorea);
            System.out.println("Horse power: " + zaldiak);
            System.out.println("Price: " + prezioa);
            System.out.println("Discount: " + deskontua + "%");
            System.out.println("Sale price: " + salmentaPrezioa());
        }
        else
        {
            System.out.println("Kodea: " + kodea);
            System.out.println("Fabrikatzailea: " + fabrikatzailea);
            System.out.println("Modeloa: " + modeloa);
            System.out.println("Kolorea: " + kolorea);
            System.out.println("zaldiak: " + zaldiak);
            System.out.println("Prezioa: " + prezioa);
            System.out.println("Deskontua: " + deskontua + "%");
            System.out.println("Salmenta-prezioa: " + salmentaPrezioa());
        }
    }
    
    @Override
    public int compareTo(Kotxea kotxea)
    {
        return this.kodea.compareTo(kotxea.getKodea());
    }
}
