public class Pertsona
{
    private String izena;
    private String abizena;
    private static int kontadorea;
    
    public Pertsona()
    {
        kontadorea = kontadorea + 1;
    }
    public Pertsona(String i, String a)
    {
        izena = i;
        abizena = a;
        kontadorea = kontadorea + 1;
    }
    public static int getKontadorea()
    {
        return kontadorea;
    }
    public void setIzena(String i)
    {
        izena = i;
    }
    public String getIzena()
    {
            return izena;
    }
    public void setAbizena(String a)
    {
        abizena = a;
    }
    public String getAbizena()
    {
            return abizena;
    }
    public void erakutsi()
    {
        System.out.printf("Pertsonaren izena eta abizena: %s %s\n",izena, abizena);
    }
    public void erakutsi(String h)
    {
        System.out.printf("Pertsonaren izena eta abizena: %s %s\n",izena, abizena);
    }
}
