public class Pertsona
{
    private String izena;
    private String abizena;
    
    public Pertsona(String i, String a)
    {
        izena = i;
        abizena = a;
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
}
