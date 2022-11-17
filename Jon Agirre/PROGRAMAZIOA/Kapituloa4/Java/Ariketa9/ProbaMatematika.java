package Ariketa9;

import java.util.Scanner;

public class ProbaMatematika
{
    
    public static void main( String[] args) 
    {
        Scanner sarrera = new Scanner(System.in);

        double erradioa;
        double azalera;
        double bolumena;

        System.out.print("Sartu esferaren erradioa:");
        erradioa = sarrera.nextDouble();

        azalera = 4 * Matematika.PI * erradioa * erradioa;
        bolumena = 4 * Matematika.PI * erradioa * erradioa * erradioa;

        System.out.printf("Azalera: %f\n", azalera);
        System.out.printf("Bolumena: %f\n", bolumena);
        sarrera.close();
    }
}