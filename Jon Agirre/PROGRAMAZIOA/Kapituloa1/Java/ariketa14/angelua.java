import java.util.Scanner; 

public class angelua
{
    public static void main(String[] args)
    {
        Scanner sarrera = new Scanner(System.in);

        float gradua;
        float konbertsioa;

        System.out.print("Sartu gradu sexagesimalak: ");
        gradua = sarrera.nextInt();
    
        konbertsioa = (float)(gradua * Math.PI / 180);
    
        System.out.printf("Erradianak = %.6f\n", konbertsioa);
    }
}
