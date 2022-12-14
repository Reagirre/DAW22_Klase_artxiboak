public class Kanta extends Diskoak
{   
    private String izena;
    private String egilea;
    private String urtea;
    private int iraupena;
    private int zenbakia;
    public Kanta()
    {
        
    }
    public Kanta(int z,String a,String b,String c,int d)
    {   zenbakia = z;
        izena = a;
        egilea = b;
        urtea = c;
        iraupena = d;
    }
    public String getIzena()
    {   return izena;
    }
    public String getEgilea()
    {   return egilea;
    }
    public String getUrtea()
    {   return urtea;
    }
    public int getIraupena()
    {   return iraupena;
    }
    public void MenuanErakutsi()
    {   System.out.printf("%d. %s - %s (%s)\n",zenbakia, izena, egilea, urtea);
    }
    public void setEntzuten()
    {   System.out.printf("\nOrain entzuten: %s - %s (%s)\n\n",izena, egilea, urtea);
    }
}
