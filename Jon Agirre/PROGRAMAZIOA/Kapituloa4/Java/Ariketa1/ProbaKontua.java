public class ProbaKontua
{
    public static void main( String[] args)
    {
        Kontua kontua1 = new Kontua();
        Kontua kontua2 = new Kontua(200);
        
        System.out.println("1. kontuaren informazioa");
        kontua1.erakutsi();
        
        System.out.println("2. kontuaren informazioa");
        kontua2.erakutsi();
    }
}