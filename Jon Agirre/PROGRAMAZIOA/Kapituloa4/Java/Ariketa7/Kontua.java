// Kontua.java
// Bankuko kontu bat errepresentatzen du

public class Kontua 
{
    private double saldoa; // kontuaren saldoa
    private static int kontadorea;
    // saldoan lehenetsitako balioa (0) izango duten kontuak sortzeko eraikitzailea
    public Kontua()
    {
        kontadorea = kontadorea + 1;
    } // eraikitzailearen bukaera
    
    // hasieratik saldo jakin bat duten kontuak sortzeko eraikitzailea
    public Kontua( double z )
    {
        if (z >= 0)
            saldoa = z;
        else
            saldoa = 0;
        kontadorea = kontadorea + 1;
    } // eraikitzailearen bukaera      
    
    public static int getKontadorea()
    {
        return kontadorea;
    }
    
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
    
    public void erakutsi()
    {
        System.out.printf("Kontuaren saldoa: %.2f\n",saldoa);
    }
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
