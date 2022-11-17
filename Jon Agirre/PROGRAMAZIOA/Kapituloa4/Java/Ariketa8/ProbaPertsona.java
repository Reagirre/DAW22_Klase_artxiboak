public class ProbaPertsona
{
    public static void main(String[] args)
    {
        
        System.out.printf("\nSortutako kontuak (pertsona2.getKontadorea() metodoa erabiliz): %d\n",Pertsona.getKontadorea());
        Pertsona pertsona1 = new Pertsona();
        Pertsona pertsona2 = new Pertsona("","");
        
        //Scanner sarrera = new Scanner(System.in);
        
        // String izena;
        // String abizena;
        
        pertsona1.erakutsi();
        pertsona2.erakutsi();
        
        //System.out.print("Sartu 1.pertsonaren izena: ");
        //izena = sarrera.nextLine();
        
        //pertsona1.setIzena(izena);
        
        //System.out.print("Sartu 1.pertsonaren abizena: ");
        //abizena = sarrera.nextLine();
        
        //pertsona1.setAbizena(abizena);
        
        //System.out.print("Sartu 2.pertsonaren izena: ");
        //izena = sarrera.nextLine();
        
        //pertsona2.setIzena(izena);
        
        //System.out.print("Sartu 2.pertsonaren abizena: ");
        //abizena = sarrera.nextLine();
        
        //pertsona2.setAbizena(abizena);
        
        System.out.printf("\nSortutako kontuak (pertsona1.getKontadorea() metodoa erabiliz): %d\n",pertsona1.getKontadorea());
        System.out.printf("\nSortutako kontuak (pertsona2.getKontadorea() metodoa erabiliz): %d\n",pertsona2.getKontadorea());
        
        //System.out.printf("1.pertsonaren izena eta abizena. %s %s\n", pertsona1.getIzena(), pertsona1.getAbizena());
        //System.out.printf("2.pertsonaren izena eta abizena. %s %s\n", pertsona2.getIzena(), pertsona2.getAbizena());
        
    }
}
