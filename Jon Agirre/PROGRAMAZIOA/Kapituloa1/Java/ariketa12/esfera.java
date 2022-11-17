import java.util.Scanner; 

public class esfera
{
    public static void main(String[] args)
    {
        Scanner sarrera = new Scanner(System.in);

    float erradioa;
    float bolumena;
    float azalera; 

    System.out.print("Sartu esferaren erradioa: ");
    erradioa = sarrera.nextInt();
    
    azalera = (float)(erradioa * erradioa * Math.PI * 4.0);
    
    bolumena = (float)((erradioa * erradioa * erradioa * Math.PI * 4.0) / 3.0);
    
    System.out.printf("Azalera = %.6f\n", azalera);
    
    System.out.printf("Bolumena = %.6f\n",bolumena);
    }
}
