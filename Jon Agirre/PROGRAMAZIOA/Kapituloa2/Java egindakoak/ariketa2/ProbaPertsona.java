import java.util.Scanner;

public class ProbaPertsona
{
    public static void main(String[] args)
    {
        Pertsona pertsona1 = new Pertsona();
        Pertsona pertsona2 = new Pertsona();
        
        Scanner sarrera = new Scanner(System.in);
        
        String izena;
        String abizena;
        
        System.out.print("Sartu 1.pertsonaren izena: ");
        izena = sarrera.nextLine();
        
        pertsona1.izena = izena;
        
        System.out.print("Sartu 1.pertsonaren abizena: ");
        abizena = sarrera.nextLine();
        
        pertsona1.abizena = abizena;
        
        System.out.print("Sartu 2.pertsonaren izena: ");
        izena = sarrera.nextLine();
        
        pertsona2.izena = izena;
        
        System.out.print("Sartu 2.pertsonaren abizena: ");
        abizena = sarrera.nextLine();
        
        pertsona2.abizena = abizena;
        
        System.out.printf("1.pertsonaren izena eta abizena. %s %s\n", pertsona1.izena, pertsona1.abizena);
        System.out.printf("2.pertsonaren izena eta abizena. %s %s\n", pertsona2.izena, pertsona2.abizena);
        
    }
}
