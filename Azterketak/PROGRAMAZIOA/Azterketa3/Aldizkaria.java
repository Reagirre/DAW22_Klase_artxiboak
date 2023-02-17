public class Aldizkaria extends Publikazioa
{
    String gaia;
    String maiztasuna;
    String url;

    public Aldizkaria() {
        
    }

    public Aldizkaria(int id, String izenburua, String gaia, String maiztasuna, String url) {
        super(id, izenburua);
        this.gaia = gaia;
        this.maiztasuna = maiztasuna;
        this.url = url;
    }

    public void setGaia(String gaia) {
        this.gaia = gaia;
    }
    public String getGaia() {
        return gaia;
    }

    public void setMaiztasuna(String maiztasuna) {
        this.maiztasuna = maiztasuna;
    }
    public String getMaiztasuna() {
        return maiztasuna;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }

    public void erakutsi()
    {
        System.out.println("Id-a: " + id);
        System.out.println("Izenburua: " + izenburua);
        System.out.println("Gaia: " + gaia);
        System.out.println("Maiztasuna: " + maiztasuna);
        System.out.println("Url-a: " + url);
    }
    public void erakutsi(String hizkuntza)
    {
        if (hizkuntza.equals("ES"))
        {
            System.out.println("Id: " + id);
            System.out.println("Titulo: " + izenburua);
            System.out.println("Tema: " + gaia);
            System.out.println("Periodo: " + maiztasuna);
            System.out.println("Url: " + url);
        }
        else if (hizkuntza.equals("EN"))
        {
            System.out.println("Id: " + id);
            System.out.println("Title: " + izenburua);
            System.out.println("Topic: " + gaia);
            System.out.println("Periodicity: " + maiztasuna);
            System.out.println("Url: " + url);
        }
        else
        {
            System.out.println("Id-a: " + id);
            System.out.println("Izenburua: " + izenburua);
            System.out.println("Gaia: " + gaia);
            System.out.println("Maiztasuna: " + maiztasuna);
            System.out.println("Url-a: " + url);
        }
    }

    // @Override
    // public int compareTo(Aldizkaria aldizkaria)
    // {
    //     return this.id.compareTo(aldizkaria.getId());
    // }
}