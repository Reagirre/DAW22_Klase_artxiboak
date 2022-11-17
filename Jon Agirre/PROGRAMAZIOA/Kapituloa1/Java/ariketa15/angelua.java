import java.util.Scanner; 

public class angelua
{
    public static void main(String[] args)
    {
        Scanner sarrera = new Scanner(System.in);

        double gradua;
        double konbertsioa;

        System.out.print("Sartu gradu sexagesimalak: ");
        gradua = sarrera.nextDouble();
        gradua = Math.toRadians(gradua);
        
        konbertsioa = Math.sin(gradua);
        
        System.out.printf("Erradianak = %.6f\n", konbertsioa);
    }
}
