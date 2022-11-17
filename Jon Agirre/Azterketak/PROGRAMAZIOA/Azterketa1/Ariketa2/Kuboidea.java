public class Kuboidea
{
    private int luzera;//Datuak private motan jarri
    private int zabalera;
    private int altuera;
    public Kuboidea()//Objetuak sortzeko funtzioa
    {
        
    }
    public Kuboidea(int z, int l, int a)//Objetuak sortzeko funtzioa argumentuak eskatuz
    {   zabalera = z;
        luzera = l;
        altuera = a;
    }
    public void setLuzera(int l)//Luzera ezartzeko funtzioa
    {
        luzera = l;
    }
    public int getLuzera()//Luzera lortzeko funtzioa
    {
        return luzera;
    }
    public void setZabalera(int z)//Altuera ezartzeko funtzioa
    {
        zabalera = z;
    }
    public int getZabalera()//Altuera lortzeko funtzioa
    {
        return zabalera;
    }
    public void setAltuera(int a)//Zabalera ezartzeko funtzioa
    {
        altuera = a;
    }
    public int getAltuera()//Zabalera lortzeko funtzioa
    {
        return altuera;
    }
    public void erakutsi()//Pantailatik objetuaren ezaugarriak(balioak) erakusteko funtzioa
    {
        System.out.printf("Kuboidearen luzera, zabalera eta altuera: %d, %d eta %d\n\n",luzera, zabalera, altuera);
    }
    public void erakutsi(String h)//Hizkuntza desberdinetan erakusteko funtzioa
    {
        if (h.equals("ES"))
        {
            System.out.printf("La longitud, amplitud y altura del cuboide: %d, %d eta %d\n\n",luzera, zabalera, altuera);
        }
        else if (h.equals("EN"))
        {
            System.out.printf("Cuboids lenght, width and heigth: %d, %d eta %d\n\n",luzera, zabalera, altuera);
        }
        else
        {
            System.out.printf("Kuboidearen luzera, zabalera eta altuera: %d, %d eta %d\n\n",luzera, zabalera, altuera);
        }
    }
    public int azalera()//Azaleraren kalkulua egin eta itzultzen duen funtzioa
    {
        int azalera;
        azalera = 2 * ((luzera*zabalera)+(zabalera*altuera)+(altuera*luzera));
        return azalera;
    }
    public int bolumena()//Bolumenaren kalkulua egin eta itzultzen duen funtzioa
    {
        int bolumena;
        bolumena = luzera * altuera * zabalera;
        return bolumena;
    }
}
