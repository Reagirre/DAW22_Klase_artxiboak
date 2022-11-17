import java.util.Scanner; 

public class ekuazioa
{
    public static void main(String[] args)
    {
        Scanner sarrera = new Scanner(System.in);

        double a;
        double b;
        double c;
        double x1;
        double x2;
        double egiaztapena;
        
        System.out.print("Sartu ekuazio koadratikoaren a koefizientea: ");
        a = sarrera.nextDouble();
        System.out.print("Sartu ekuazio koadratikoaren b koefizientea: ");
        b = sarrera.nextDouble();
        System.out.print("Sartu ekuazio koadratikoaren c koefizientea: ");
        c = sarrera.nextDouble();
        
        egiaztapena = (b*b)-(4*a*c)/(2*a);
        
        if(egiaztapena < 0)
        {
            System.out.print("Ekuazioak ez du erro errealik");
        }
        else
        {
            x1 = ((-b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
            x2 = ((-b)-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
            System.out.printf("x1 = %.6f\n", x1);
            System.out.printf("x2 = %.6f\n", x2);
        }
    }
}
