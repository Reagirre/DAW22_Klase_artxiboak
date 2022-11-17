// Batuketa.java
// bi zenbaki batu eta emaitza erakusten duen programa

import java.util.Scanner; //programak Scanner klasea erabiliko du

public class Zatiketa2
{
    // java aplikazioa main metodoaren bidez hasten da exekutatzen
    public static void main (String[] args)
    {
        // Scanner objetu bat sortu sarrerako datuak teklatu bidez jasotzeko
    Scanner sarrera = new Scanner(System.in);

    long zenbakia1; //1. zenbakia gordetzeko aldagaia
    long zenbakia2; //2. zenbakia gordetzeko aldagaia //2. zenbakia gordetzeko aldagaia
    float zatiketa; // zenbakia1 eta zenbakia2 aldagaien arteko kenketa gordetzeko aldagaia
    
    System.out.print("Sartu 1. zenbakia: ");
    zenbakia1 = sarrera.nextLong();
    
    System.out.print("Sartu 2. zenbakia: ");
    zenbakia2 = sarrera.nextLong();
    while(zenbakia2 == 0 )
    {
        System.out.print("Sartu 2. zenbakia: ");
        zenbakia2 = sarrera.nextLong();
    }
    
    zatiketa = (float)zenbakia1 / zenbakia2;
    System.out.printf("%d / %d = %.2f da\n",zenbakia1, zenbakia2, zatiketa);
        // kenketaren emaitza erakutsi
    } // main metodoaren bukaera
} // Batuketa klasearen bukaera
