public class ProbaKontua
{
    public static void main( String[] args)
    {
        System.out.printf("\nSortutako kontuak (kontua2.getKontadorea() metodoa erabiliz): %d\n",Kontua.getKontadorea());
        
        System.out.println("Sortzen 1.kontua...");
        Kontua kontua1 = new Kontua();
        
        System.out.println("\n1. kontuaren informazioa");
        kontua1.erakutsi();
        
        System.out.printf("\nSortutako kontuak (kontua2.getKontadorea() metodoa erabiliz): %d\n",Kontua.getKontadorea());
        System.out.printf("\nSortutako kontuak (kontua1.getKontadorea() metodoa erabiliz): %d\n",kontua1.getKontadorea());
        
        
        System.out.println("\nSortzen 2.kontua...");
        Kontua kontua2 = new Kontua(100);
        
        System.out.println("\n2. kontuaren informazioa");
        kontua2.erakutsi();
        
        System.out.printf("\nSortutako kontuak (kontua2.getKontadorea() metodoa erabiliz): %d\n",Kontua.getKontadorea());
        System.out.printf("\nSortutako kontuak (kontua1.getKontadorea() metodoa erabiliz): %d\n",kontua1.getKontadorea());
        System.out.printf("\nSortutako kontuak (kontua2.getKontadorea() metodoa erabiliz): %d\n",kontua2.getKontadorea());
    }
}