// Batuketa.java
// bi zenbaki batu eta emaitza erakusten duen programa

import java.util.Scanner; //programak Scanner klasea erabiliko du

public class Biderketa
{
    // java aplikazioa main metodoaren bidez hasten da exekutatzen
    public static void main (String[] args)
    {
        // Scanner objetu bat sortu sarrerako datuak teklatu bidez jasotzeko
    Scanner sarrera = new Scanner(System.in);

    int zenbakia1; //1. zenbakia gordetzeko aldagaia
    int zenbakia2; //2. zenbakia gordetzeko aldagaia
    int zenbakia3; //2. zenbakia gordetzeko aldagaia
    int biderketa; // zenbakia1 eta zenbakia2 aldagaien arteko kenketa gordetzeko aldagaia
    
    System.out.print("Sartu 1. zenbakia: ");
    zenbakia1 = sarrera.nextShort();
    
    System.out.print("Sartu 2. zenbakia: ");
    zenbakia2 = sarrera.nextShort();
    
    System.out.print("Sartu 2. zenbakia: ");
    zenbakia3 = sarrera.nextShort();
    
    biderketa = zenbakia1 * zenbakia2 * zenbakia3;
    
        System.out.println(zenbakia1 + " x " + zenbakia2 +  " x " + zenbakia3 + " = " + biderketa);// kenketaren emaitza erakutsi
    } // main metodoaren bukaera
} // Batuketa klasearen bukaera
