import java.util.Scanner;

public class ProbaKontua
{
    public static void main( String[] args)
    {
        
        Kontua kontua1 = new Kontua(100);
        Kontua kontua2 = new Kontua(200);
        
        double zenbatekoa;
        
        Scanner sarrera = new Scanner(System.in);
        
        System.out.printf("1. kontuaren saldoa: %.2f\n", kontua1.getSaldoa());
        System.out.printf("2. kontuaren saldoa: %.2f\n", kontua2.getSaldoa());
        
        System.out.print("Sartu 1.kontuaren saldoa: ");
        zenbatekoa = sarrera.nextDouble();
        
        kontua1.abonatu(zenbatekoa);
        
        System.out.print("Sartu 2.kontuaren saldoa: ");
        zenbatekoa = sarrera.nextDouble();
        
        kontua2.abonatu(zenbatekoa);
        
        System.out.printf("1. kontuaren saldoa: %.2f\n", kontua1.getSaldoa());
        
        System.out.printf("2. kontuaren saldoa: %.2f\n", kontua2.getSaldoa());
        
    }
    
}
