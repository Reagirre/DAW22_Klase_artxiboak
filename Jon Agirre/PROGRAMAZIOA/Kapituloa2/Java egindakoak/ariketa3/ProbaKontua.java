import java.util.Scanner;

public class ProbaKontua2
{
    public static void main( String[] args)
    {
        
        kontua kontua1 = new kontua();
        kontua kontua2 = new kontua();
        
        double zenbatekoa;
        
        Scanner sarrera = new Scanner(System.in);
        
        System.out.printf("1. kontuaren saldoa: %.2f\n", kontua1.getSaldoa());
        System.out.printf("2. kontuaren saldoa: %.2f\n", kontua2.getSaldoa());
        
        System.out.print("Sartu 1.kontuaren saldoa: ");
        zenbatekoa = sarrera.nextDouble();
        
        kontua1.setSaldoa(zenbatekoa);
        
        System.out.print("Sartu 2.kontuaren saldoa: ");
        zenbatekoa = sarrera.nextDouble();
        
        kontua2.setSaldoa(zenbatekoa);
        
        System.out.printf("1. kontuaren saldoa: %.2f\n", kontua1.getSaldoa());
        
        System.out.printf("2. kontuaren saldoa: %.2f\n", kontua2.getSaldoa());
        
    }
    
}
