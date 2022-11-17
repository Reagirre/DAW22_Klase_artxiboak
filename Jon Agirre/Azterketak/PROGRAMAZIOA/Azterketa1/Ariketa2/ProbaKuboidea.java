import java.util.Scanner;//Datuak jasotzeko funtzioaren liburutegia
public class ProbaKuboidea
{
    public static void main(String[] args)
    {
        Kuboidea kuboidea1 = new Kuboidea(5,5,5);//Objetu berri bat sortu balore batzuekin
        
        kuboidea1.erakutsi();//Metodo desberdinak kuboidearen ezaugarriak erakusteko pantailatik
        kuboidea1.erakutsi("EN");
        System.out.printf("Kuboidearen luzera, zabalera eta altuera: %d, %d eta %d\n\n",kuboidea1.getLuzera(), kuboidea1.getZabalera(), kuboidea1.getAltuera());
        
        //Kuboidearen azalera pantailaratu
        System.out.printf("Kuboidearen azalera: %d\n\n",kuboidea1.azalera());
        //Kuboidearen bolumena pantailaratu
        System.out.printf("Kuboidearen bolumena: %d\n\n",kuboidea1.bolumena());
        
        //--------------------------------------------------------------------------------------------------------------//
        
        Kuboidea kuboidea2 = new Kuboidea();//Beste objetu ba sortu hutsik balioak sartzea probatzeko
        
        kuboidea2.setLuzera(4);//Luzera esleitu
        kuboidea2.setAltuera(7);//Zabalera esleitu
        kuboidea2.setZabalera(2);//Altuera esleitu
        
        kuboidea2.erakutsi();//Kuboidearen ezaugarriak erakutsi
        
        //Kuboidearen azalera pantailaratu
        System.out.printf("Kuboidearen azalera: %d\n\n",kuboidea2.azalera());
        //Kuboidearen bolumena pantailaratu
        System.out.printf("Kuboidearen bolumena: %d\n\n",kuboidea2.bolumena());
        
        //--------------------------------------------------------------------------------------------------------------//
        
        Kuboidea kuboidea3 = new Kuboidea();//Azken objetua ezaugarriak teklatutik sartzea probatzeko
        
        int luz;//Deklaratu bariableak
        int alt;
        int zab;
        
        Scanner sarrera = new Scanner(System.in);//Datuak jasotzeko funtzioarei izena jarri
        
        System.out.print("Sartu kuboidearen luzera: ");//Pantailatik eskatu luzera
        luz = sarrera.nextInt();//Jaso luzera
        kuboidea3.setLuzera(luz);//Gorde objetuaren balioetan
        
        System.out.print("Sartu kuboidearen altuera: ");//Pantailatik eskatu altuera
        alt = sarrera.nextInt();//Jaso altuera
        kuboidea3.setAltuera(alt);//Gorde objetuaren balioetan
        
        System.out.print("Sartu kuboidearen zabalera: ");//Pantailatik eskatu zabalera
        zab = sarrera.nextInt();//Jaso zabalera
        kuboidea3.setZabalera(zab);//Gorde objetuaren balioetan
        
        kuboidea3.erakutsi();//Kuboidearen ezaugarriak erakutsi
        
        //Kuboidearen azalera pantailaratu
        System.out.printf("Kuboidearen azalera: %d\n\n",kuboidea3.azalera());
        //Kuboidearen bolumena pantailaratu
        System.out.printf("Kuboidearen bolumena: %d\n\n",kuboidea3.bolumena());
    }
}