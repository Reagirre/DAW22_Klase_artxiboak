// Batuketa.java
// bi zenbaki batu eta emaitza erakusten duen programa

import java.util.Scanner; //programak Scanner klasea erabiliko du

public class Kenketa
{
    // java aplikazioa main metodoaren bidez hasten da exekutatzen
    public static void main (String[] args)
    {
        // Scanner objetu bat sortu sarrerako datuak teklatu bidez jasotzeko
    Scanner sarrera = new Scanner(System.in);

    short zenbakia1; //1. zenbakia gordetzeko aldagaia
    short zenbakia2; //2. zenbakia gordetzeko aldagaia
    int kenketa; // zenbakia1 eta zenbakia2 aldagaien arteko kenketa gordetzeko aldagaia
    
    System.out.print("Sartu 1. zenbakia: ");
    zenbakia1 = sarrera.nextShort();
    
    System.out.print("Sartu 2. zenbakia: ");
    zenbakia2 = sarrera.nextShort();
    
    kenketa = zenbakia1 - zenbakia2;
    
        System.out.println(zenbakia1 + "-" + zenbakia2 + "=" + kenketa);// kenketaren emaitza erakutsi
    } // main metodoaren bukaera
} // Batuketa klasearen bukaera
