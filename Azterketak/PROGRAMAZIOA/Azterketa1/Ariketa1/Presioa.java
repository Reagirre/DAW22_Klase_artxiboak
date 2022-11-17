import java.util.Scanner;//Datuak jasotzeko funtzioaren liburutegia
public class Presioa
{
    public static void main(String[] args)
    {
        Scanner sarrera = new Scanner(System.in);//Datuak jasotzeko funtzioarei izena jarri

        float presioa;//Deklaratu bariableak
        float bar;
        float PSI;
        int aukera;

        System.out.print("Sartu presioa pascaletan (Pa): ");//Pantailatik eskatu Pascal-ak
        presioa = sarrera.nextFloat();//Jaso presioa
        
        System.out.printf("\n\nPresio unitateak\n\n");//Pantalairatu menua
        System.out.printf("1.Bar\n\n");
        System.out.printf("2.PSI\n\n");
        
        System.out.printf("Aukeratu presio unitatea: ");//Eskatu pantailatik aukera
        aukera = sarrera.nextInt();//Jaso aukera
        
        if (aukera == 1)//aukera 1 bada barrura sartu
        {
            bar = presioa / 100000;//bar-ak kalkulatu
            System.out.printf("\n\n%.0f Pa = %.2f bar", presioa, bar);//Emaitzak pantailan erakutsi
        }
        if(aukera == 2)//aukera 2 bada barrura sartu
        {
            PSI = presioa / (float)6894.76;//PSI-ak kalkulatu
            System.out.printf("\n\n%.0f Pa = %.2f PSI", presioa, PSI);//Emaitzak pantailan erakutsi
        }
    }
}