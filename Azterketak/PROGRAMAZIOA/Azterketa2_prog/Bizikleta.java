public class Bizikleta
{
    private String ekoizlea;
    private String modeloa;
    private double prezioa;
    private int deskontua;
    private static int kontadorea;
    
    public Bizikleta()
    {
        kontadorea = kontadorea + 1;
    }
    public Bizikleta(String e, String m, double p, int d)
    {
        ekoizlea = e;
        modeloa = m;
        prezioa = p;
        deskontua = d;
        kontadorea = kontadorea + 1;
    }
    public void setEkoizlea(String e)
    {
        ekoizlea = e;
    }
    public String getEkoizlea()
    {
            return ekoizlea;
    }
    public void setModeloa(String m)
    {
        modeloa = m;
    }
    public String getModeloa()
    {
            return modeloa;
    }
    public void setPrezioa(double p)
    {
        prezioa = p;
    }
    public double getPrezioa()
    {
            return prezioa;
    }
    public void setDeskontua(int d)
    {
        deskontua = d;
    }
    public int getDeskontua()
    {
            return deskontua;
    }
    public static int getKontadorea()
    {
        return kontadorea;
    }
    public void erakutsi()
    {
        System.out.printf("\nBizikletaren ekoizlea, modeloa, prezioa eta deskontua: %s %s %.2f€ %d\n",ekoizlea, modeloa, prezioa, deskontua);
    }
    public void erakutsi(String h)
    {
        if (h.equals("ES"))
        {
            System.out.printf("\nEl productor, modelo, precio yh descuento de la bicicleta: %s %s %.2f€ %d\n",ekoizlea, modeloa, prezioa, deskontua);
        }
        else if (h.equals("EN"))
        {
            System.out.printf("\nBicycle's producer, model, price and discount: %s %s %.2f€ %d\n",ekoizlea, modeloa, prezioa, deskontua);
        }
        else
        {
            System.out.printf("\nBizikletaren ekoizlea, modeloa, prezioa eta deskontua: %s %s %.2f€ %d\n",ekoizlea, modeloa, prezioa, deskontua);
        }
    }
    public double salmentaPrezioa()
    {
        return prezioa * ((100.0 - (double)deskontua)/100.0);
    }
}
