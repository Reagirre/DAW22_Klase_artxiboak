import java.util.Scanner; 

public class tenperatura
{
    public static void main(String[] args)
    {
        Scanner sarrera = new Scanner(System.in);

        float gradua;
        float konbertsioa;

        System.out.print("Sartu Fahrenheit graduak: ");
        gradua = sarrera.nextInt();
    
        konbertsioa = (float)((5f/9f)*(gradua - 32));
    
        System.out.printf("Celsius graduak = %.6f\n", konbertsioa);
    }
}
