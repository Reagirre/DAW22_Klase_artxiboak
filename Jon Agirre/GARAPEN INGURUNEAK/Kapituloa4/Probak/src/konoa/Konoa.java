package konoa;
import java.util.*;
public class Konoa {
    public static void main(String[] args) throws Exception {
        Scanner sarrera = new Scanner(System.in);
        double erradioa;
        double height;
        double area;
        double volum;

        System.out.print("Sartu konoaren erradioa: ");
        erradioa = sarrera.nextDouble();

        System.out.print("Sartu konoaren altuera: ");
        height = sarrera.nextDouble();

        area = Math.PI * erradioa * erradioa + Math.PI * erradioa * Math.sqrt(height*height+erradioa*erradioa);
        volum = Math.PI * erradioa * erradioa * height / 3;

        System.out.printf("Azalera = %.2f\n", area);
        System.out.printf("Bolumena = %.2f\n", volum);

        sarrera.close();
    }
}