// Batuketa.java
// bi zenbaki batu eta emaitza erakusten duen programa

import java.util.Scanner; //programak Scanner klasea erabiliko du

public class Batuketa
{
    // java aplikazioa main metodoaren bidez hasten da exekutatzen
    public static void main (String[] args)
    {
        // Scanner objetu bat sortu sarrerako datuak teklatu bidez jasotzeko
    Scanner sarrera = new Scanner(System.in);

    byte zenbakia1; //1. zenbakia gordetzeko aldagaia
    byte zenbakia2; //2. zenbakia gordetzeko aldagaia
    int batuketa; // zenbakia1 eta zenbakia2 aldagaien arteko batuketa gordetzeko aldagaia
    
    System.out.print("Sartu 1. zenbakia: ");
    zenbakia1 = sarrera.nextByte();
    
    System.out.print("Sartu 2. zenbakia: ");
    zenbakia2 = sarrera.nextByte();
    
    batuketa = (zenbakia1 + zenbakia2);
    
        System.out.println(zenbakia1 + "+" +zenbakia2+ "=" +batuketa);// batuketaren emaitza erakutsi
    } // main metodoaren bukaera
} // Batuketa klasearen bukaera
