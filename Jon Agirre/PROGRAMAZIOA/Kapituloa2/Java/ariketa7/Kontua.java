public class Kontua
{
    private double saldoa;
    
    public Kontua(double z)
    {
        saldoa = z;
    }    
    public double getSaldoa()
    {
        return saldoa;
    }
    public void abonatu(double z)
    {
        saldoa = saldoa + z;
    }
    public void erakutsi()
    {
        System.out.printf("Kontuaren saldoa: %.2f\n", saldoa);
    }
}

