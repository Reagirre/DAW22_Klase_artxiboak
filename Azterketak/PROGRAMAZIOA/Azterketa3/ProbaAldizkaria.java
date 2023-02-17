public class ProbaAldizkaria
{
    public static void main(String[] args)
    {
        Aldizkaria Aldizkaria = new Aldizkaria();
        Aldizkaria.setId(1);
        Aldizkaria.setIzenburua("PropiPropi");
        Aldizkaria.setGaia("kirolak");
        Aldizkaria.setMaiztasuna("Astero");
        Aldizkaria.setUrl("www.propi.eus");

        System.out.printf("%d, %s, %s, %s, %s\n", Aldizkaria.getId(), Aldizkaria.getIzenburua(), Aldizkaria.getGaia(), Aldizkaria.getMaiztasuna(), Aldizkaria.getUrl());

        Aldizkaria Aldizkari_berria;

        Aldizkari_berria = new Aldizkaria(5, "Keunews", "Eguraldia", "Hilero", "www.keu.es");

        System.out.printf("%d, %s, %s, %s, %s\n", Aldizkari_berria.getId(), Aldizkari_berria.getIzenburua(), Aldizkari_berria.getGaia(), Aldizkari_berria.getMaiztasuna(), Aldizkari_berria.getUrl());

    }
}