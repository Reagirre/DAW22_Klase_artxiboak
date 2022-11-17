// Kontua.java
// Bankuko kontu bat errepresentatzen du

public class Kontua 
{
    protected double saldoa; // kontuaren saldoa

    // saldoan lehenetsitako balioa (0) izango duten kontuak sortzeko eraikitzailea
    public Kontua()
    {
    } // eraikitzailearen bukaera
    
    // hasieratik saldo jakin bat duten kontuak sortzeko eraikitzailea
    public Kontua( double z )
    {
        if (z >= 0)
            saldoa = z;
        else
            saldoa = 0;
    } // eraikitzailearen bukaera      

    // saldoa ezarri
    public void setSaldoa( double z )
    {
        saldoa = z;
    } // setSaldoa metodoaren bukaera

    // saldoa itzuli
    public double getSaldoa()
    {
        return saldoa;
    } // getSaldoa metodoaren bukaera

    // zenbateko bat gehitu saldora 
    public void abonatu( double z )
    {
        saldoa = saldoa + z;
    } // abonatu metodoaren bukaera

    // zenbateko bat kendu saldoari 
    public void kargatu( double z )
    {
        saldoa = saldoa - z;
    } // kargatu metodoaren bukaera
    
    // kontuaren informazioa erakutsi
    public void erakutsi(String hizkuntza)
    {
        if (hizkuntza.equals("ES"))
        {
            System.out.printf("Saldo de la cuenta: %.2f\n",saldoa);
        }
        else if (hizkuntza.equals("EN"))
        {
            System.out.printf("Account balance: %.2f\n",saldoa);
        }
        else
        {
            System.out.printf("Kontuaren saldoa: %.2f\n",saldoa);
        }
    }
}
